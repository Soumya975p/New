import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the no. for table");
        int k=input.nextInt();

    System.out.println("Enter the last digit");
        int n=input.nextInt();

        for(int i=k;i<=n;i+=k)
        {
          
          System.out.println(i);
        }
    }
}