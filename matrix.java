import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a1 = new int[3][3];
        int[][] a2 = new int[3][3];
        int[][] a3 = new int[3][3];

        System.out.println("Enter values fo matrix 1");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter values fo matrix 2");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a2[i][j] = sc.nextInt();
            }
        }
        
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    a3[i][j] = a1[i][0]*a2[0][j] + a1[i][1]*a2[1][j] + a1[i][2]*a2[2][j];
                }
            }
            System.out.println();
        
        // To Print Matrix M3
            for(int i=0;i<3;i++){
                
            for(int j=0;j<3;j++){
                System.out.print( a3[i][j]+" ");
            }
            System.out.println();
        }
         
    } 
}