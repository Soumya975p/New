import java.util.Scanner;

public class Q6 {
     public static void main(String[] args) {
       
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter the Year");
        int n=input.nextInt();
        if(n%4==0)
        System.out.println("Leap Year");
        else
        System.out.println("Not a Leap Year");
    
}
}
