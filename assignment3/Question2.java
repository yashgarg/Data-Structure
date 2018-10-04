import java.util.Scanner;
public class Question2 {
    static void rvereseArray(int arr[],
                    int start, int end)
    {
        int temp;
          
        while (start < end)
        {
            temp = arr[start]; 
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
    }     
      
    static void printArray(int arr[], 
                            int size)
    {
        for (int i = 0; i < size; i++)
             System.out.print(arr[i] + " ");
          
         System.out.println();
    } 
 
    // Driver code
    public static void main(String args[]) {
         
        Scanner s=new Scanner(System.in);
        System.out.println("Enetr the number of elements:");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        printArray(arr, n);
        rvereseArray(arr, 0, n-1);
        System.out.print("Reversed array is \n");
        printArray(arr, n); 
        
    }
}
 