class Insert 
{
    public Node head;
    public Node tail;
    public int size=0;
    
    class Node 
    {
        int val;
        Node next;
        
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
    
    public void insertAtFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
    
    public void insertatMiddle(int val,int index)
    {
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
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
        temp.next=node;
        tail=node;
        size++;
    }
    
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ->");
            temp=temp.next;
        }
        System.out.println(" END");
    }
    
}

class Main 
{
    public static void main(String args[])
    {
        Insert list = new Insert();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        
        list.display();
        
        list.insertatMiddle(100,3);
        
        list.display();
        
        list.insertAtLast(9);
        list.display();
    }
}
