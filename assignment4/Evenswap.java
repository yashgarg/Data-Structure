import java.util.Scanner;
class Node
{
	int data;
	Node next;
	Node head=null;

	public Node(){
		this.data=0;
		this.next=null;
	}

	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}

	public Node add(int data)
	{
		Node l=new Node(data);
		Node temp=head;
		if(head==null)
		{
			head=l;
		}
	else{
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=l;
  }
		return head;
	}

	public void display(Node head)
{
     Node temp=head;
     while(temp!=null)
       {
          System.out.print(temp.data+" ");
	  temp=temp.next;
       }
}

public void Swap(Node node)
{

  
       /* if (node == null || node.next == null) { 
            return node; 
        }*/ 
  
        Node temp1 = node; 
        Node x = node.next; 
        Node temp2=node.next.next;
        Node y=node.next.next.next;
  
 int c=1;
        while (y!=null) { 
System.out.println("Count: "+c++);
        	 Node next = y.next; 
            temp1.next=y;
            y.next=temp2;
            temp2.next=x;
            x.next=next;
            // System.out.println("temp1 "+temp1.data);
            // System.out.println("x "+x.data);
            //  System.out.println("temp2 "+temp2.data);
            //  System.out.println("y "+y.data);
            // temp1= temp2; 
            
            x = temp1.next; 
            
            temp2=temp1.next.next;
           
            y=temp1.next.next.next;
            
            System.out.print("\n");
            display(node);
        } 
        //return node; 
    } 
	
	//
}

class Evenswap
{
	public static void main(String args[])
	{
		Node p=new Node();
		int n,l;
		Node a=null;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of nodes you want to create:");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
      	    System.out.print("Enter the data:");
			int d=s.nextInt();
			a=p.add(d);
		}
		System.out.print("the given linkedlist is:");
		p.display(a);
		p.Swap(a);
		//System.out.println("the Swapped linkedlist is:");
		//p.display(b);
	}
}
