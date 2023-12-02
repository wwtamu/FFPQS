import java.io.*;
import java.util.*;
import java.math.*;

public class RSADecode 
{
  private int rsaLength;
  private String rsaString;
  private BigInteger rsaNumber;  
    
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
  private BigInteger alot     = new BigInteger("100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    
  public RSADecode() 
  {
    this.rsaLength = rsaLength;
    this.rsaNumber = rsaNumber;    
    this.rsaString = rsaString;
  }
    
  public int getrsaLength()
  {
    return rsaLength;
  }
  
  public BigInteger getrsaNumber()
  {
    return rsaNumber;
  } 
  
  public String getrsaString()
  {
    return rsaString;
  }
  
  public void readRSA(String inFileName)
  {        
    try
    {
      Scanner file = new Scanner(new File("c:\\java\\projects\\sieve\\" + inFileName));     
      
      while (file.hasNext() == true)
      {
        rsaString = file.nextLine();
        rsaNumber = file.nextBigInteger();
        rsaLength = rsaString.length();
        System.out.println(rsaNumber);   
        System.out.println(rsaLength);
        System.out.println(rsaString);  
        System.out.println("Successful");
      }
      file.close();
    }
    catch (IOException e)
    {
      System.out.println("I/O ERROR");
      System.exit(1);
    }
  }  

  public void saveFile(int count)
  {
    RSADecode object = new RSADecode();
    
    try
    {
      PrintWriter outfile = new PrintWriter(new FileWriter("c:\\java\\projects\\sieve\\out.txt"));
            
      outfile.close();
    }
    catch (IOException e)
    {
      System.out.println("I/O ERROR");
      System.exit(1);
    }
  }

  public void factor(BigInteger rsa)
  {
    
  }
}