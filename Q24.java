import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []a=new int[5];

         System.out.println("Enter the array elements");
        for(int i=0;i<5;i++)
        {
          a[i]=input.nextInt();
        }
        for(int i=0;i<5;i++)
        {
          System.out.println(a[i]);
        }
        int sum=0;
        for(int i=0;i<5;i++)
        {
          sum=sum+a[i];
        }
        System.err.println("The sum of the elements is "+sum);
        float average=0;
        for(int i=0;i<5;i++)
        {
           average=sum/5;
        }
        System.err.println("The average of the elements is "+average);
    }
    
}
