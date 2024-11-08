import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
       
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter the temperature in  celcius");
        int n=input.nextInt();

        int f=(n * 9/5) + 32 ;
        System.out.println(f);


    }
    
}
