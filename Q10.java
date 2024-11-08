import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first two numbers");
        int a=input.nextInt();
        int b=input.nextInt();

        for(int i=0;i<=5;i++)
        {
            int c =a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            
        }
    }
    
}
