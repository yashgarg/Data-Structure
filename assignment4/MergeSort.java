import java.util.*; 
class Node  
{ 
    int data; 
    Node next; 
    Node head;

    Node()
    {
    	this.data=0;
    	this.next=null;
    }
    Node(int d) 
    {
	 this.data = d;  
     this.next = null;
    } 
  
 public Node add(int data)  
{ 
	Node l=new Node(data);
    if (head == null) 
    { 
        head = l; 
    } 
    else 
    { 
        Node temp = head; 
        while (temp.next != null) 
            temp = temp.next; 
        temp.next = l; 
    } 
    return head;
} 
 
 
   public Node sortedMerge(Node first, Node second) {
        Node head;
        if (first == null)
            return second;
        else if (second == null)
            return first;
        else if (first.data < second.data) {
            head = first;
            head.next = sortedMerge(first.next, second);
        } else {
            head = second;
            head.next = sortedMerge(first, second.next);
        }
        return head;
    }
void printList(Node head) 
{ 
    Node temp = head; 
    while (temp!= null) 
    { 
        System.out.print(temp.data + " "); 
        temp = temp.next; 
    }  
    System.out.println(); 
} 
  
} 
  
public class MergeSort 
{ 

public static void main(String args[]) 
{ 
    
    Node l1 = new Node(); 
    Node l2 = new Node(); 
      
   Node a= l1.add(5); 
    a=l1.add(10); 
    a=l1.add(15); 
      
   Node b= l2.add(2); 
    b= l2.add(3); 
    b=l2.add(20); 
  
    Node c= new Node().sortedMerge(a,b); 
    l1.printList(c);   
      
} 
} 