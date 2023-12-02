import java.math.BigInteger;

public class BIADNode
{
  private BigInteger[] item;
  private BIADNode next;
  private BIADNode prev;
  
  public BIADNode(BigInteger[] newItem) 
  {
    item = newItem;
    next = null;
    prev = null;
  }
  public BIADNode(BigInteger[] newItem, BIADNode nextNode, BIADNode prevNode) 
  {
    item = newItem;
    next = nextNode;
    prev = prevNode;
  }
  public void setItem(BigInteger[] newItem) 
  { 
    item = newItem; 
  }
  public BigInteger[] getItem() 
  { 
    return item; 
  }
  public void setNext(BIADNode nextNode) 
  { 
    next = nextNode; 
  }
  public BIADNode getNext() 
  { 
    return next; 
  }
  public void setPrev(BIADNode prevNode) 
  { 
    prev = prevNode; 
  }
  public BIADNode getPrev() 
  { 
    return prev; 
  }
}