class Doubly 
{
    public Node head=null;
    public Node tail=null;
    public int size=0;
    class Node 
    {
       int val;
       Node next;
       Node prev;
        
        public Node(int val)
        {
            this.val=val;
        }
        public Node(int val,Node next)
        {
            this.val=val;
            this.next=next;
        }
    }
    public void insertAtfirst(int val)
    {
       Node node=new Node(val);
       node.next=head;
       node.prev=null;
       if(head!=null)
       {
           head.prev=node;
       }
       head=node;
       size++;
    }
    public void display()
    {
      Node temp=head;
      Node last=null;
      while(temp!=null)
      {
          System.out.print(temp.val+"->");
          last=temp;
          temp=temp.next;
      }
      System.out.println(" END");
      System.out.println("Print in the reverse Oder");
      while(last!=null)
      {
          System.out.print(last.val+"->");
          last=last.prev;
      }
      System.out.println("START");
      
    }
}

class Main 
{
    public static void main(String args[])
    {
        Doubly list=new Doubly();
        list.insertAtfirst(1);
        list.insertAtfirst(2);
        list.insertAtfirst(3);
        list.insertAtfirst(4);
        list.insertAtfirst(5);
        list.insertAtfirst(6);
        list.insertAtfirst(7);
        list.display();
    }
}
