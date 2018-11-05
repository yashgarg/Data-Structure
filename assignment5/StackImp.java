import java.util.Scanner;  
class Stack   
{  
    int top;   
    int maxsize = 10;  
    int[] arr = new int[maxsize];  
      
      
    boolean isEmpty()  
    {  
        return (top < 0);  
    }  
    Stack()  
    {  
        top = -1;  
    }  
    boolean push (Scanner sc)  
    {  
        if(top == maxsize-1)  
        {  
            System.out.println("Overflow !!");  
            return false;  
        }  
        else   
        {  
            System.out.println("Enter Value");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
            return true;  
        }  
    }  
    boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("Underflow !!");  
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("Item popped");  
            return true;  
        }  
    }  
    void display ()  
    {  
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
    }  
}  
public class StackImp {  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);  
    Stack s = new Stack();  
    System.out.println("Stack operations using array\n");  
    
    while(choice != 4)  
    {  
        System.out.println("\nChose one from the below options...\n");  
        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
        System.out.println("\n Enter your choice \n");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
                s.push(sc);  
                break;  
            }  
            case 2:  
            {  
                s.pop();  
                break;  
            }  
            case 3:  
            {  
                s.display();  
                break;  
            }  
            case 4:   
            {  
                System.out.println("Exiting....");  
                System.exit(0);  
                break;   
            }  
            default:  
            {  
                System.out.println("Please Enter valid choice ");  
            }   
        } 
    }  
}  
} 
/*----------------------------------------------------------------------------------*/
/*
import java.util.Scanner;
class Queue  {
int front = -1, rear = -1;    
    int maxsize = 10;  
    int[] queue = new int[maxsize];  
      
void insert(Scanner sc)  
{   
    System.out.println("\nEnter the element\n");  
    int item=sc.nextInt();    
    if(rear == maxsize-1)  
    {  
        System.out.println("\nOVERFLOW\n");  
        return;  
    }  
    if(front == -1 && rear == -1)  
    {  
        front = 0;  
        rear = 0;  
    }  
    else   
    {  
        rear = rear+1;  
    }  
    queue[rear] = item;  
    System.out.println("\nValue inserted ");  
      
}  
void delete()  
{  
    int item;   
    if (front == -1 || front > rear)  
    {  
        System.out.println("\nUNDERFLOW\n");  
        return;  
              
    }  
    else  
    {  
        item = queue[front];  
        if(front == rear)  
        {  
            front = -1;  
            rear = -1 ;  
        }  
        else   
        {  
            front = front + 1;  
        }  
        System.out.println("\nvalue deleted ");  
    }  
      
      
}  
      
void display()  
{  
    int i;  
    if(rear == -1)  
    {  
        System.out.println("\nEmpty queue\n");  
    }  
    else  
    {   System.out.println("\nprinting values .....\n");  
        for(i=front;i<=rear;i++)  
        {  
            System.out.println(queue[i]);    
        }     
    }  
}  
}

public class QueueImp{

public static void main (String[] args)  
{  
     int choice=0;  
    Scanner sc = new Scanner(System.in);  
    Queue q = new Queue();  
    System.out.println("Queue operations using array\n");  
    while(choice != 4)   
    {      
        System.out.println("\n1.insert an element\n2.Delete an element\n3.Display the queue\n4.Exit\n");  
        System.out.println("\nEnter your choice ?");  
       choice=sc.nextInt();
        switch(choice)  
        {  
            case 1:  
            q.insert(sc);  
            break;  
            case 2:  
           q. delete();  
            break;  
            case 3:  
           q. display();  
            break;  
            case 4:  
            System.out.println("Exiting....");  
                System.exit(0);  
            break;  
            default:   
            System.out.println("\nEnter valid choice??\n");
            }  
        }  
    }
   }  */
  