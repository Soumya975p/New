import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the number");
        int n =input.nextInt();
        int r,s=0;
       
        while(n>0)
        {
         r=n%10;
         s=(s*10)+r;
         n=n/10;
        }
        System.out.println(s);
    }
    
}
