import java.util.Scanner;

public class Q16 {
    
    public static void main(String[] args) {
        int  hcf=0;
        Scanner input=new Scanner(System.in);
    System.out.println("Enter the first digit");
        int a=input.nextInt();

        System.out.println("Enter the last digit");
        int b=input.nextInt();
        
        for(int i=1;i<=a||i<=b;i++)
        {  
          if(a%i==0 && b%i==0)
          {
          hcf=i;
         
          }
        }
        System.out.println(hcf);
    }
}