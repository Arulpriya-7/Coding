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
    
    public void insertAtLast(int val)
    {
       
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
         Node node=new Node(val);
         node.next=null;
         node.prev=temp;
         temp.next=node;
         size++;
        
    }
    public void insertAtMiddle(int val,int index)
    {
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        node.prev=temp;
        temp.next.prev=node;
    }
    public void display()
    {
      Node temp=head;
      while(temp!=null)
      {
          System.out.print(temp.val+"->");
          temp=temp.next;
      }
      System.out.println(" END");
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
        list.insertAtLast(99);
        list.display();
        list.insertAtMiddle(100,3);
        list.display();
    }
}
