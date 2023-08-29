class Insert{
    class Node{
        int val;
        Node next;
        
    public Node(int val){
        this.val=val;
        this.next=null;
    }
  }
  public Node head=null;
  public Node tail=null;
    
    
    
    public void insertAtfirst(int val)
    {
        Node n=new Node(val);
        n.next=head;
        head=n;
        
        if(tail==null)
        {
            tail=head;
    }
    
}


public void display()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.val+"->");
        temp=temp.next;
    }
    System.out.print("End");
}
}
class Main 
{
    public static void main(String args[])
    {
        Insert in=new Insert();
        in.insertAtfirst(3);
        in.insertAtfirst(4);
        in.insertAtfirst(5);
        in.insertAtfirst(6);
        in.insertAtfirst(7);
        in.display();
    }
}
