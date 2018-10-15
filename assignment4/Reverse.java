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
	
public Node reverse(Node head)
{
  Node prev=null,cur=head,next;
  while(cur!=null)
  {
    next=cur.next;
    cur.next=prev;
    prev=cur;
    cur=next;
  }
  head=prev;
  return head;
}

public void display(Node head)
{
     Node temp=head;
     System.out.print("the given linkedlist is:");
     while(temp!=null)
       {
          System.out.print(temp.data+" ");
	  temp=temp.next;
       }
}


class Reverse
{
	public static void main(String args[])
	{
		Node p=new Node();
		int n,l;
		Node a=null,b=null,c=null,E=null;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of nodes you want to create:");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
      	               System.out.print("Enter the data:");
			int d=s.nextInt();
			a=p.add(d);
		}
                b=p.reverse(a);
                System.out.println("Reverse of linked list is:"+b);
                
	}
}