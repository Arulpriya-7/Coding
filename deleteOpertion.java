class Insert
{
    public Node head=null;
    public Node tail=null;
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
    
    public void insertAtMiddle(int val,int index)
    {
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node =new Node(val,temp.next);
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
        Node node = new Node(val);
        temp.next=node;
        tail=node;
        size++;
    }
    
    public int deleteAtFirst()
    {
        Node temp=head;
        int val=head.val;
        head=head.next;
        size--;
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
    public int deleteAtlast()
    {
       Node secondnode=get(size-2);
       int val=tail.val;
       tail=secondnode;
       tail.next=null;
       return val;
       
    }
    
    public int deleteAtMiddle(int index)
    {
        Node prev=get(index-1);
        int val=prev.next.val;
        prev.next=prev.next.next;
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
        Insert list=new Insert();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.display();
        list.insertAtMiddle(100,3);
        list.display();
        
        list.insertAtLast(99);
        list.display();
        
        
        System.out.println(list.deleteAtFirst());
        list.display();
        
        System.out.println(list.deleteAtlast());
        list.display();
        
        System.out.println(list.deleteAtMiddle(3));
        list.display();
        
    }
}
