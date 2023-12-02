import java.io.*;
import java.util.*;
import java.math.*;

public class Tester
{    
  public static void main(String[] args)
  {
    RSADecode    rsaobject = new RSADecode();
    BIOperations biobject  = new BIOperations();
    Sieve        sobject   = new Sieve();        
    
    //Scanner keyboard = new Scanner(System.in);
    
    //String fileName;

    //System.out.println("Enter the input file path: ");
    //fileName = keyboard.nextLine().trim();
    
    //rsaobject.readRSA(fileName);
    
    //System.out.println();    
    //System.out.println("square root = " + biobject.sqrt(rsaobject.getrsaNumber()));    
    
    /*
    System.out.println();
    System.out.println(biobject.chepn(new BigInteger("2")));    
    System.out.println();
    System.out.println(biobject.mersenne(biobject.chepn(new BigInteger("2"))));
    */
    
    System.out.println();
    System.out.println("2");
    System.out.println("3");
    System.out.println("5");
    
    //BigInteger i = new BigInteger("0");
    //while(i.compareTo(new BigInteger("10000000")) < 0)
    //{
      sobject.sieve(new BigInteger("1000000000"));
      //i = i.add(new BigInteger("1"));
    //}   
    
    System.out.println();
    System.out.println("********************************************");
    System.out.println("********************done********************");
    System.out.println("********************************************");
  }
}