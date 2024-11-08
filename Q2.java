import java.util.Scanner;

public class Q2{

    public static void main(String []args)
    {
        
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the value of n ");
      int n= input.nextInt();
      if(n>=0)
      {
        System.out.println("Positive");
      }
      if(n<0)
      {
        System.out.println("Negative");
      }
      else
      System.out.println("Zero");

    }
}