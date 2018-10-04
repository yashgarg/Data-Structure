import java.util.Scanner;
public class Question1 {
   static int recSearch(int arr[], int l, int r, int x)
     {
          if (r < l)
             return -1;
          if (arr[l] == x)
             return l;
          if (arr[r] == x)
             return r;
          return recSearch(arr, l+1, r-1, x);
     }



    public static void main(String args[]) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        System.out.println("Enter the number of element you want to search:");
        int a=s.nextInt();
        int c=recSearch(arr, 0,arr.length-1,a);
        if(c!=-1)
        System.out.println("True");
        else
        System.out.println("True");
    }
}
