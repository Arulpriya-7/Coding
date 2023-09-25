class Doubly 
{
    public Node head=null;
    public Node tail=null;
    public int size=0;
    class Node{
        int val;
        Node next;
        Node prev;
        
        public Node(int val)
        {
            this.val=val;
        }
        public Node(int val, Node next)
        {
            this.val=val;
            this.next=next;
        }
    }
    
    public void insertAtFirst(int val)
    {
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
    }
    
    public void insertAtMiddle(int val,int index)
    {
        Node temp=head;
        
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        
        node.prev=temp;
        temp.next.prev=node;
        temp.next=node;
    
        
    }
    
    public void insertAtLast(int val)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node node=new Node(val);
        temp.next=node;
        node.prev=temp;
        node.next=null;
        tail=node;
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
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtFirst(7);
        list.display();
        list.insertAtMiddle(99,3);
        list.display();
        list.insertAtLast(1000);
        list.display();
        
    }
}
