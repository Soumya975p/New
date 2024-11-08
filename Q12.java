import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the marks of maths");
        int maths=input.nextInt();
        System.out.println("Enter the marks of chemistry");
        int chemistry=input.nextInt();
        System.out.println("Enter the marks of physics");
        int physics=input.nextInt();
        int Total=physics+chemistry+maths;

        if(maths>=60)
        {
            if(physics>=50)
            {
                if(chemistry>=40)
                {
                    if(Total>=200|| maths+physics>=150)
                    {
                        System.out.println("Admission is Possible");
                    }
                    

                }
            }
        }
        else{
            System.out.println("Admission Not Posiible");
            }
    }
   
    
}
