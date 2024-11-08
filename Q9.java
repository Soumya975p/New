import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     System.out.println("Enter the value of n");
     int n= input.nextInt();
      int p=1;
     
    for(int i=1;i<=n;i++)
    {
        p=p*i;
    }
     System.out.println(p);
        
    }
    
}
