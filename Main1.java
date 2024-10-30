class Linkedlist
{
    Node head;
    Linkedlist()
    {
        head = null;
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
    public void insert_at_begin(int d)
    {
        Node newnode = new Node(d);
        if(head == null)
        {
            head = newnode;
        }
        else
        {
            newnode.next = head;
            head = newnode;
        }
    }
    public void delete_at_begin()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else 
        {
            head = head.next;
        }
    }
    public void insert_at_last(int d)
    {
        Node newnode = new Node(d);
        if(head == null)
        {
            head  = newnode;
        }
        else 
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("hey idiot sleep");
        }
        else
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public void middle_element()
    {
        if(head == null)
        {
            System.out.println("Hello mental the list is empty");
        }
        else 
        {
            Node temp = head;
            int count = 0;
            while(temp != null)
            {
                temp = temp.next;
                count++;
            }
            count = count / 2;
            temp = head;
            while(count>0)
            {
                temp = temp.next;
                count--;
            }
            System.out.println("\nMiddle element: " + temp.data);
        }
    }
    public void middle_element_optimised()
    {
        if(head == null)
        {
            System.out.println("Hello mental the list is empty");
        }
        else 
        {
            Node t = head;
            Node r = head;
            while(r!=null && r.next !=null )
            {
                r = r.next.next;
                t = t.next;
            }
            System.out.println("\nMiddle element : " + t.data);
        }
    }
    public void kth_element_from_last(int k)
    {
        if(head == null)
        {
            System.out.println("Hello mental the list is empty");
        }
        else 
        {
            Node temp = head;
            int count = 0;
            while(temp != null)
            {
                temp = temp.next;
                count++;
            }
            count = count - k;
            temp = head;
            while(count>0)
            {
                temp = temp.next;
                count--;
            }
            System.out.println("\nkth element from last element: " + temp.data);
        }   
    }
    public void kth_element_from_last_optimised(int k)
    {
        if(head == null)
        {
            System.out.println("Hey idiot");
        }
        else 
        {
            Node t = head;
            Node r = head;
            while(k>0)
            {
                r = r.next;
                k--;
            }
            while(r!=null)
            {
                t = t.next;
                r = r.next;
            }
            System.out.println("Kth element from last optimised: " + t.data);
        }
    }
    public void create_loop()
    {
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = head.next.next.next;
    }
    public void detect_loop()
    {
        Node t = head;
        Node r = head.next;
        while(r != t && (r!=null && r.next!=null))
        {
            t = t.next;
            r = r.next.next;
        }
        if(r==t)
        {
            System.out.println("Loop is detected");
        }
        else 
        {
            System.out.println("Loop is not detected");
        }
    }
}

public class Main1
{
	public static void main(String[] args) 
	{
		Linkedlist l = new Linkedlist();
		l.insert_at_last(1);
		l.insert_at_last(2);
		l.insert_at_last(3);
		l.insert_at_begin(15);
		l.insert_at_begin(8);
		l.insert_at_last(7);
		l.insert_at_begin(5);
		l.display();
		System.out.println();
		l.delete_at_begin();
		l.display();
		l.middle_element();
		l.middle_element_optimised();
		l.kth_element_from_last(3);
		l.kth_element_from_last_optimised(2);
// 		l.create_loop();
		l.detect_loop();
	}
}
