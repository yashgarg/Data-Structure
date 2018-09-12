
import java.util.Scanner;
class Toogle
{
 public static void main(String args[]) 
 {
     Scanner br=new Scanner(System.in);
     int i,s,k=0;
     String a;
     System.out.print("Enter a string : ");
     a=br.nextLine();
     System.out.print("\nToggled cases are : ");
     for(i=0;i<=a.length()-1;i++)
     {
         s=a.charAt(i);
         if(s!=' ')
         {
             if(s>=65 && s<=90)
             k=s+32;
             if(s>=97 && s<=122)
             k=s-32;
             System.out.print((char)k);
         }   
     }
    }
}
