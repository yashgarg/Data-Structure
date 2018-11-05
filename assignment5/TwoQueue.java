import java.util.*;
 
 class TwoQueue{
 static class Stack
{
    Queue<Integer> q=new LinkedList<Integer>();
    Queue<Integer> tmp=new LinkedList<Integer>();
 
    public void push(int data)
    {       
        if (q.size() == 0)
            q.add(data);
        else
        {            
            int l = q.size();
            for (int i = 0; i < l; i++)
                tmp.add(q.remove());                
            q.add(data);                         
            for (int i = 0; i < l; i++)
                q.add(tmp.remove());
        }
    }  
     public int getSize()
    {
        return q.size();
    }   
     public void display()
    {
        System.out.print("\nStack = ");
        int l = getSize();
        if (l == 0)
            System.out.print("Empty\n");
        else
        {
            Iterator it = q.iterator();
            while (it.hasNext())
                System.out.print(it.next()+" ");
            System.out.println();
        }
    }
}  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);      
        Stack suq = new Stack();       
        System.out.print("Enter the no of items you want to enter::");
        int item=sc.nextInt(); 
        int i=item;
        System.out.println("Enter the data:");
        while(i!=0)
        {
          suq.push(sc.nextInt());
          i--;
          }  
          suq.display();
          }
 }