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

public int Length(Node head)
{
	int count=0;
	Node temp=head;
	while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
}
public Node Middle(Node head,int l)
{
	int count =0;
	Node temp=head;
	while(count!=(l/2))
	{
		count++;
		temp=temp.next;
	}
        Node Mid=temp.next;
        temp.next=null;
	//System.out.println("Middle Element of LinkeList is:"+temp.data);
        return Mid;
}

public Node mid_reverse(Node node)
 {
  Node prev=null;
  Node curr=node;
  Node next=null;
  while(curr!=null)
  {
   next=curr.next;
   curr.next=prev;
   prev=curr;
   curr=next;
  }
  node=prev;
  
  return node;
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

public void palindrome(Node temp1 , Node temp2)
 {
     if(temp1.data==temp2.data)
       {
              System.out.println("Linked List is Palindrome");
              temp1=temp1.next;
              temp2=temp2.next;
        }
          else
             System.out.println("Linked List is not  Palindrome");
 }


class PalinDrome
{
	public static void main(String args[])
	{
		Node p=new Node();
		int n,l;
		Node a=null,b=null,c=null,e=null;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of nodes you want to create:");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
      	               System.out.print("Enter the data:");
			int d=s.nextInt();
			a=p.add(d);
		}
		        p.display(a);
                l=p.Length(a);
                System.out.println("Length of linked list is:"+l);
                e=p.Middle(a,l);
                p.display(e);
                c=p.mid_reverse(e);
                System.out.print("Reversed mid_list is: ");
                p.display(c);
                p.palindrome(a,c);

	}
}