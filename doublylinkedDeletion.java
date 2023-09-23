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
    
    public int deleteAtFirst()
    {
        Node temp=head;
        int val=head.val;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    
    public int deleteAtLast()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        int val=temp.val;
        tail=temp.prev;
        temp.prev.next=null;
        return val;
        
    }
    
    public Node get(int index)
    {
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    
    public int deleteAtMiddle(int index)
    {
        Node secondLastNode=get(index-1);
        int val=secondLastNode.next.val;
        secondLastNode.next=secondLastNode.next.next;
        secondLastNode.next.prev=secondLastNode.next;
        return val;
        
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
        System.out.println(list.deleteAtFirst());
        list.display();
        System.out.println(list.deleteAtLast());
        list.display();
        System.out.println(list.deleteAtMiddle(4));
        list.display();
        
    }
}
