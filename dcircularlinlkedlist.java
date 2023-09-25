class Circular
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
        if(head==null)
        {
            head=node;
            tail=node;
            
        }
        node.next=head;
        tail.next=node;
        node.prev=tail;
        head.prev=node;
       
        head=node;
}

public void insertAtLast(int val)
{
    Node node = new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            
        }
        node.next=head;
        tail.next=node;
        node.prev=tail;
        head.prev=node;
        tail=node;}  
       
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
    

    public void display()
    {
        Node temp=head;
        if(head!=null)
        {
            do{
                System.out.print(temp.val+"->");
                temp=temp.next;
            }while(head!=temp);
            
            System.out.println(" HEAD");
        }
    
    }
}

class Main 
{
    public static void main(String args[])
    {
        Circular list=new Circular();
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
