import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the number");
        int n =input.nextInt();
        int r,s=0;
        int m=n;
       
        while(n>0)
        {
         r=n%10;
         s=(s*10)+r;
         n=n/10;
        }
        if(m==s)
        {
            System.out.println("No."+s+" is a palindrome");
        }
        else 
        {
            System.out.println("No."+m+" is not a palindrome");
        }
    }
    
}
