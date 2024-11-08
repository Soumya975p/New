import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    System.out.println("Enter the last digit");
        int n=input.nextInt();
int sum=0;
        for(int i=0;i<=n;i++)
        {
sum=sum+i;
        }
        System.out.println("The su  of the digits is "+sum);

    }
}
