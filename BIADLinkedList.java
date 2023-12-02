import java.math.BigInteger;

public class BIADLinkedList
{
  private BIADNode headNode;
  private BIADNode tailNode;  
  private int      count;
  
  public BIADLinkedList()
  {
    BigInteger[] zero = new BigInteger[2];
    
    zero[0] = new BigInteger("0");
    zero[1] = new BigInteger("0");
    
    headNode = new BIADNode(zero);   
    tailNode = null;
    count = 0;
  }
  
  public int size()
  {
    return count;
  }
  
  public BigInteger[] first()
  {
    return headNode.getNext().getItem();
  } 
  
  public BigInteger[] last()
  {
    return tailNode.getItem();
  }
  
  public void insertfb(BigInteger[] newItem)
  {
    if(count == 0)
    {
      BIADNode newNode = new BIADNode(newItem, null, headNode);
      headNode.setNext(newNode);
      tailNode = newNode;
      count++;
    }
    else
    {
      BIADNode currNode = tailNode;
      
      while(newItem[0].compareTo(currNode.getItem()[0]) < 0)
      {
        currNode = currNode.getPrev();
      }
      
      if(newItem[0].compareTo(currNode.getItem()[0]) != 0)
      {
        BIADNode newNode = new BIADNode(newItem, currNode.getNext(), currNode);
        
        if (currNode.getNext() == null)
          tailNode = newNode;
        else 
          currNode.getNext().setPrev(newNode);
              
        currNode.setNext(newNode);
        count++;
      }
    }    
  }  
  
  public void insertff(BigInteger[] newItem)
  {
    
  } 
  
  public void remove()
  {
    if(count != 0)
    {
      
      headNode.setNext(headNode.getNext().getNext());
      
      if (headNode.getNext() != null)
        headNode.getNext().setPrev(headNode);
      else
        tailNode =  null;
      
      count--;
    }
  }
  
  public void display()
  {
    BIADNode currNode = headNode.getNext();
    while(currNode.getNext() != null)
    {
      System.out.println("not prime : " + currNode.getItem()[0]);
      System.out.println("factor    : " + currNode.getItem()[1]);
      currNode = currNode.getNext();
    }    
    System.out.println("not prime : " + currNode.getItem()[0]);
    System.out.println("factor    : " + currNode.getItem()[1]);
  }
}