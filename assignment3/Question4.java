import java.util.Scanner;

class Question4{ 
    static int power(int x, int y) 
    { 
        if (y == 0) 
            return 1; 
        else
            return x*power(x,y-1); 
    } 
  
    public static void main(String[] args) 
    { 
    	Scanner s=new Scanner(System.in);
        int x = s.nextInt(); 
        int y = s.nextInt(); 
  
        System.out.println( power(x, y)); 
    } 
} 