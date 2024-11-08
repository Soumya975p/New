import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.println("ENter the value of n");
        int n=input.nextInt();
        int []a=new int[n];

         System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
          a[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
          if(a[i]%2!=0)
          {
            sum=sum+a[i];
          }
        }
        System.out.println("The sum of all odd elements is "+sum);
    }
}