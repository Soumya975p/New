import java.util.Scanner;

public class Q20{

    public static void main(String []args)
    {
        
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the value of n ");
      int n= input.nextInt();
      int count=0;
      for(int i=1;i<=n;i++)
     {
        if(n%i==0)
        {
            count++;
        }
     }
     if(count==2)
     {
        System.out.println("Prime Number");
     }
     else
     {
        System.out.println("Composite Number");
     }
    }
}
