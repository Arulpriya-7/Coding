class DoublyCdelete 
{
    public Node head=null;
    public Node tail=null;
    public int size=0;
    class Node{
        int val;
        Node next;
       // Node prev;
        
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
        head=node;
        size++;
}
public int deleteAtFirst()
{
    Node temp=head;
    int val=head.val;
    head=head.next;
    tail.next=head;
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

public int deleteAtLast()
{
    Node temp=get(size-2);
    int val=temp.next.val;
    temp.next=head;
    return val;
    
    
    
}
public int deleteAtMiddle(int index)
{
    Node temp=head;
    for(int i=0;i<index-1;i++)
    {
        temp=temp.next;
    }
    int val=temp.next.val;
    temp.next=temp.next.next;
   // temp.next.prev=temp.next;
    return val;
    
    
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
        //System.out.println(tail.val);
    
    }
}

class Main 
{
    public static void main(String args[])
    {
        DoublyCdelete list=new DoublyCdelete();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtFirst(7);
        list.display();
        
        System.out.println(list.deleteAtFirst());
        list.display();
        System.out.println(list.deleteAtLast());
        list.display();
       System.out.println(list.deleteAtMiddle(2));
    list.display();
        
    }
}
