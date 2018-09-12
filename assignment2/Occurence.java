import java.util.Scanner;
public class Occurence
{
    static char getMax(String str)
    {
        int count[] = new int[256];
        int len = str.length();
        for (int i=0; i<len; i++)
        {
            count[str.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) 
        {
            if (max < count[str.charAt(i)]) 
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
     
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the String:");
        String str = s.nextLine();
        System.out.println("Max occurring character is " +
                            getMax(str));
    }
}