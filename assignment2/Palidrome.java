import java.util.Scanner;
public class Palidrome
{
  static boolean check(String a){
    String b = "";
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            return true;
        }
        else
        {
          return false;
        }
  }

public static void main(String args[])
{
        String a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        System.out.println(check(a)? "Yes": "No");
}
}