import java.util.Scanner;

public class Q27 {
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
        int min=a[0];
        for(int i=0;i<n;i++)
        {
          if(a[i]<min)
          {
            min=a[i];
          }
        }
        System.out.println("The minimum element is "+min);
    }
}