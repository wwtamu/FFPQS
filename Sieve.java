import java.io.*;
import java.util.*;
import java.math.*;

public class Sieve
{
  private BigInteger zero = new BigInteger("0");
  private BigInteger one  = new BigInteger("1");
  private BigInteger two  = new BigInteger("2");
  
  //public BigInteger numberOfPrimes = new BigInteger("100000");

  public Sieve() {
  }
  
  //made 11-3-05
  public void sieve(BigInteger numberOfPrimes)
  {
    long time_stamp = System.currentTimeMillis() % 1000;

	System.out.println("START " + time_stamp);

    BIOperations   biobject = new BIOperations();
    BIADLinkedList list     = new BIADLinkedList();    
    Sieve          sobject  = new Sieve();
    BigInteger[]   curr;
    
    int count = 2;
    
    curr = new BigInteger[2];    
    curr[0] = biobject.p((sobject.hitpfq(one, biobject.q(one))).subtract(one));
    curr[1] = biobject.q(one);    
    list.insertfb(curr);
    
    curr = new BigInteger[2];    
    curr[0] = biobject.q(sobject.hitqfq(one, biobject.q(one)));
    curr[1] = biobject.q(one);    
    list.insertfb(curr);
    
    count++;
        
    for(BigInteger i = two; i.compareTo(numberOfPrimes) < 0; i = i.add(one))
    {
      System.out.println();
      //System.out.println("first  = " + list.first()[0]);
      System.out.println("p(i-1) = " + biobject.p(i.subtract(one)));
      System.out.println("q(i)   = " + biobject.q(i));      
      
      if(biobject.p(i.subtract(one)).compareTo(list.first()[0]) == 0)
      {
        System.out.println(biobject.p(i.subtract(one)) + " is composite");
        curr = new BigInteger[2];    
        curr[0] = biobject.p((sobject.cast(i, list.first()[1])).subtract(one));
        curr[1] = list.first()[1];
        list.insertfb(curr);
        
        curr = new BigInteger[2];    
        curr[0] = biobject.p((sobject.cast(i, list.first()[0].divide(list.first()[1]))).subtract(one));
        curr[1] = list.first()[0].divide(list.first()[1]);
        list.insertfb(curr);
        
        list.remove();
      }
      else
      {
       
        System.out.println(biobject.p(i.subtract(one)) + " is prime");
        
        curr = new BigInteger[2];    
        curr[0] = biobject.p((sobject.hitpfp(i, biobject.p(i.subtract(one)))).subtract(one));
        curr[1] = biobject.p(i.subtract(one));    
        list.insertfb(curr);        
        
        curr = new BigInteger[2];    
        curr[0] = biobject.q(sobject.hitqfp(i, biobject.p(i.subtract(one))));
        curr[1] = biobject.p(i.subtract(one));    
        list.insertfb(curr);
        
        count++;
      }
      
      System.out.println("first  = " + list.first()[0]);
      
      if(biobject.q(i).compareTo(list.first()[0]) == 0)
      {        
        System.out.println(biobject.q(i) + " is composite");
        curr = new BigInteger[2];    
        curr[0] = biobject.q(sobject.cast(i, list.first()[1]));
        curr[1] = list.first()[1];
        list.insertfb(curr);
        
        curr = new BigInteger[2];    
        curr[0] = biobject.q(sobject.cast(i, list.first()[0].divide(list.first()[1])));
        curr[1] = list.first()[0].divide(list.first()[1]);
        list.insertfb(curr);
        
        list.remove();
      }
      else
      {
        System.out.println(biobject.q(i) + " is prime");
        
        curr = new BigInteger[2];    
        curr[0] = biobject.p((sobject.hitpfq(i, biobject.q(i))).subtract(one));
        curr[1] = biobject.q(i);    
        list.insertfb(curr);

        curr = new BigInteger[2];    
        curr[0] = biobject.q(sobject.hitqfq(i, biobject.q(i)));
        curr[1] = biobject.q(i);    
        list.insertfb(curr);
        
        count++;
      }
    } 
    System.out.println("number of composites in list: " + list.size());
  }  
  
  public BigInteger hitqfp(BigInteger n, BigInteger P)
  {
    return P.subtract(n.subtract(one)); 
  }
 
  public BigInteger hitpfq(BigInteger n, BigInteger Q)
  {
    return Q.subtract(n.subtract(one)); 
  }
  
  public BigInteger hitpfp(BigInteger n, BigInteger P)
  {
    return P.add(n); 
  }
  
  public BigInteger hitqfq(BigInteger n, BigInteger Q)
  {
    return Q.add(n); 
  }
  
  public BigInteger cast(BigInteger n, BigInteger F)
  {
    return F.add(n);
  } 
}