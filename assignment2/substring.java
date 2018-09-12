import java.util.Scanner;
public class substring
{
public static void main(String[] x)
{
Scanner s=new Scanner(System.in);
String input = s.nextLine();
for(int i=0;i<input.length();i++)
{
for(int j=i+1;j<=input.length();j++)
{
String s = input.substring(i,j);
   System.out.println(s);
  }
}
}
}