import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    System.out.println("Enter the last digit");
        int n=input.nextInt();

        for(int i=1;i<=n;i++)
        {
          if(i%10==0)
          System.out.println(i+" ");
        }
      

    }
}