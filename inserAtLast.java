class Insert 
{
    public Node head=null;
    public Node tail=null;
    class Node{
        int val;
        Node next;
        
        public Node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }
    public void insertAtFirst(int val)
    {
        Node n = new Node(val);
        n.next=head;
        head=n;
        
        if(tail==null)
        {
            tail=head;
        }
    }
    
    public void insertAtlast(int val)
    {
        Node nn=new Node(val);
        tail.next=nn;
        tail=nn;
    }
    
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val +" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    
    
}

class Main 
{
    public static void main(String args[])
    {
        Insert l =new Insert();
        l.insertAtFirst(2);
        l.insertAtFirst(3);
        l.insertAtFirst(4);
        l.insertAtFirst(5);
        l.insertAtFirst(6);
        
        l.display();
        
        l.insertAtlast(7);
        
        l.display();
        
    }
}
