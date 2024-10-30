class Stack 
{
    Node top;
    Stack()
    {
        top = null;
    }
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
        public void push(int d)
        {
            Node newnode = new Node(d);
            if(top == null)
            {
                top = newnode;
            }
            else 
            {
                newnode.next = top;
                top = newnode;
            }
        }
    
    public void pop()
    {
        if(top == null)
        {
            System.out.println("stack is empty to delete");
        }
        else 
        {
            top = top.next;
        }
    }
    public void peek()
    {
        System.out.println("peek element: " + top.data);
    }
    
}
public class Stackallocation
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.peek();
		s.pop();
		s.peek();
	}
}
