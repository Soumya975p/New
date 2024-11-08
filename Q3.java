import java.util.Scanner;

public class Q3 {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=input.nextInt();
        System.out.println("Enter the value of b ");
        int b=input.nextInt();
        System.out.println("Enter the value of c ");
        int c=input.nextInt();

        // (a>b)?((a>c)?a:c):((b>c)?b:c);
        if(a>b){
          if(a>c)
          {
            System.out.println("A is Greatest");
          }
          else
          System.out.println("C is Greatest");
        }    
        else
        {
        if(c>b)
        {
        System.out.println("C is Greatest");
        }
        else{
            System.out.println("B is Greatest");
        }

        }
    
    }
}
