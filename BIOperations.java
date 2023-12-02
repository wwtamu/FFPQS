import java.util.*;
import java.math.*;

public class BIOperations 
{    
  private BigInteger zero     = new BigInteger("0");
  private BigInteger one      = new BigInteger("1");
  private BigInteger two      = new BigInteger("2");
  private BigInteger three    = new BigInteger("3");
  private BigInteger four     = new BigInteger("4");
  private BigInteger five     = new BigInteger("5");
  private BigInteger six      = new BigInteger("6");
  private BigInteger seven    = new BigInteger("7");
  private BigInteger eight    = new BigInteger("8");
  private BigInteger nine     = new BigInteger("9");
  private BigInteger ten      = new BigInteger("10");
  private BigInteger hundred  = new BigInteger("100");
  private BigInteger thousand = new BigInteger("1000");
  private BigInteger million  = new BigInteger("1000000");
  private BigInteger billion  = new BigInteger("1000000000");
  private BigInteger trillion = new BigInteger("1000000000000");  
  
  private BigInteger p = zero;   
  private BigInteger q = zero;
  
  public BIOperations() 
  {
  }
 
  public BigInteger sqrt(BigInteger rsa)
  {    
    BigDecimal sqrt;
    BISquareRoot app = new BISquareRoot();
    app.setTraceFlag (true);
    
    int length = rsa.toString().length();
    if (length > 20) 
    {
      app.setScale(length / 2);
    }
    sqrt = app.get(rsa);
    return sqrt.toBigInteger();
  } 
  
  public BigInteger pow(BigInteger base, BigInteger power)
  {
    BigInteger powered = base;
    for(BigInteger i = zero; i.compareTo(power.subtract(one)) < 0; i = i.add(one))
    {
      powered = powered.multiply(base);
    }    
    return powered;
  }   
  
  public BigInteger factorial(BigInteger i)
  {
    BigInteger product = one;
    while(i.compareTo(zero) > 1)
    {
      product = i.multiply(i.subtract(one));
      i = i.subtract(one);
    }    
    return product;
  }
  
  public BigInteger p(BigInteger i)
  {
    return (i.multiply(six)).add(one);
  }
  
  public BigInteger q(BigInteger i)
  {
    return (i.multiply(six)).subtract(one);
  }
  
  public BigInteger mersenne(BigInteger i)
  {
    BIOperations object = new BIOperations();
    return object.pow(two, i).subtract(one);
  }
  
  public BigInteger doublemersenne(BigInteger i)
  {
    BIOperations object = new BIOperations();    
    return (object.pow(two, object.mersenne(i))).subtract(one);
  }
  
  public BigInteger fermat(BigInteger i)
  {
    BIOperations object = new BIOperations();
    BigInteger exponent = object.pow(two, i);
    return (object.pow(two, exponent)).add(one);
  }
  
  public BigInteger carol(BigInteger i)
  {
    BIOperations object = new BIOperations();
    BigInteger base = object.pow(two, i).subtract(one);
    return object.pow(base, two).subtract(two);
  }
  
  public BigInteger cullen(BigInteger i)
  {
    BIOperations object = new BIOperations();
    return (i.multiply(object.pow(two, i))).add(one);  
  }
  
  public BigInteger safe(BigInteger i)
  {
    BIOperations object = new BIOperations();
    return (two.multiply(i)).add(one);
  }
  
  public BigInteger star(BigInteger i)
  {
    BIOperations object = new BIOperations();     
    return ((six.multiply(i)).multiply(i.subtract(one))).add(one);
  }
  
  public BigInteger thabit(BigInteger i)
  {
    BIOperations object = new BIOperations();     
    return (three.multiply(object.pow(two, i))).subtract(one);
  }
  
  public BigInteger dirichlet(BigInteger i)
  {
    BIOperations object = new BIOperations();
    return (three.multiply(i)).add(one);
  }
  
  public BigInteger pythagorean(BigInteger i)
  {
    BIOperations object = new BIOperations();
    return (four.multiply(i)).add(one);
  }
  
  public BigInteger woodall(BigInteger i)
  {
    BIOperations object = new BIOperations();
    return (i.multiply(object.pow(two, i))).subtract(one);   
  }
  
  public BigInteger euclidean(BigInteger i)
  {
    // euclidean primes are the summation of the primes to i plus one
    // needs sieve
    return i;
  }
  
  public BigInteger wagstaff(BigInteger i)
  {
    // (2p + 1) / 3
    // needs sieve    
    return i;
  }
  
  public BigInteger fibonacci(BigInteger i)
  {
    // f2 = f0 + f1 , f3 = f2 + f1 , f4 = f3 + f2
    // make
    return i;
  }
  
  public BigInteger pell(BigInteger i)
  {
    // recursive
    // make
    return i;
  }
  
  public BigInteger perrin(BigInteger i)
  {
    // recursive
    // make
    return i;
  }
  
  public BigInteger fpo(BigInteger i) // factorial plus one
  {
    BIOperations object = new BIOperations();
    return object.factorial(i).add(one);
  }
    
  public BigInteger fmo(BigInteger i) // factorial minus one
  {
    BIOperations object = new BIOperations();
    return object.factorial(i).subtract(one);
  }
  
  public BigInteger cdn(BigInteger i) // centered decagonal number
  {
    BIOperations object = new BIOperations();    
    return (five.multiply(((object.pow(i, two)).subtract(i)))).add(one);
  }
  
  public BigInteger chepn(BigInteger i) // centered heptagonal number
  {
    BIOperations object = new BIOperations();
    return (((seven.multiply(object.pow(i, two))).subtract(seven.multiply(i))).add(two)).divide(two);
  }
  
  public BigInteger chexn(BigInteger i) // centered hexagonal number
  {
    BIOperations object = new BIOperations();    
    return (three.multiply(object.pow(i, two))).add(three.multiply(i)).add(one);
  }
  
  public BigInteger csn(BigInteger i) // centered square number
  {
    BIOperations object = new BIOperations();
    return object.pow(i, two).add(object.pow(i.subtract(one), two));
  }
  
  public BigInteger ctn(BigInteger i) // centered triangular number 
  {
    BIOperations object = new BIOperations();
    return ((three.multiply(object.pow(i, two))).add(three.multiply(i)).add(two)).divide(two);
  }
  
  public BigInteger lucaslehmer(BigInteger i)
  {
    BIOperations object = new BIOperations();
    BigInteger prev = zero;
    BigInteger curr = ten.add(four);    
    BigInteger c = three;
    
    if(i.compareTo(c) > 0)
    {
      while(c.compareTo(i) != 0)
      {
        prev = curr;
        curr = object.pow(prev, two).subtract(two);
        c = c.add(one);
      }   
      return curr;
    }
    else if(i.compareTo(c) == 0)
    {      
      return curr;
    }
    else 
    {      
      System.out.println("parameter must be greater than two");
      System.out.println("zero returned");
      return zero;
    }    
  }
  
  public BigInteger zeta(BigInteger i, BigInteger x)
  {
    BIOperations object = new BIOperations();
    BigInteger z = zero;
    for(BigInteger c = one; c.compareTo(i) < 0; c = c.add(one))
    {
      z = z.add(one.divide(object.pow(i, x)));
    }
    return z;        
  }
}