import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
    
        System.out.println("Enter any random number");
        int n=input.nextInt();

        System.out.println("Enter the number for which divisiblity has to be tested");
        int a=input.nextInt();

        if(n%a==0)
        {
            System.out.println("NUmber is Divisible");
        }
        else
        System.out.println("Number is NOT Divisible");
    }
    
}
