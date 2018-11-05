
import java.util.*; 
  
public class TwoStacks 
{  
static class Queue  
{  
    static Stack<Integer> s1 = new Stack<Integer>();  
    static Stack<Integer> s2 = new Stack<Integer>();  
  
    static void enQueue(int x)  
    {  
        while (!s1.isEmpty()) 
        {  
            s2.push(s1.pop());   
        }   
        s1.push(x);   
        while (!s2.isEmpty())  
        {  
            s1.push(s2.pop());    
        }  
    }  
    
    static int deQueue()  
    {  
        if (s1.isEmpty())  
        {  
            System.out.println("Q is Empty");  
            System.exit(0);  
        }  
   
        int x = s1.peek();  
        s1.pop(); 
        return x; 
    }  
}  
   
public static void main(String[] args)  
{  
    Queue q = new Queue();
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the no of items you want to enter::"); 
  int item=sc.nextInt(); 
  int i=item;
  System.out.println("Enter the data:");
  while(i!=0)
  {
    q.enQueue(sc.nextInt());
    i--;  
  }
  i=item;
  System.out.print("Queue using two stacks:");
  while(i!=0){
  System.out.print(q.deQueue()+" ");
  i--;
  }
}  
}  
 