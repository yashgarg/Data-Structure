class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

class MinStack{
	static int min;
	public static int getMinimum(){
		return min;
	}

}

class Stack{
	int top;
	int[] arr;
	Node head;
	int min;
	Stack(){
		top=-1;
	}
	void push(int data){			
		Node temp=new Node(data);
			if(top==-1){
				min=data;
			}
			else{
				min=min<data?min:data;
			}
			MinStack.min=this.min;
			temp.next=head;
			head=temp;
			top++;
			
	}
	Node pop(){
		if(top == -1){
			System.out.println("Under flow ");
			return null;
		}
		else{
			Node a=head;
			head=head.next;
			top--;
			return a;
		}
	}

	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}

public class Question4 {
	
	public static void main(String[] args){
		Stack obj=new Stack();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.display();
		System.out.println("=============");
		System.out.println("Minimum -> "+MinStack.getMinimum());
	}
}