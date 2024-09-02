import java.util.Scanner;
import java.util.*;

public class sort {
    public static void main(String[] args) {
    
    // array creation
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array : ");
    for(int i=0;i<5;i++){
        arr[i] = sc.nextInt();
    }
    
    // array sort
    for(int j=0;j<4;j++){
        for(int i=0; i<4;i++){
            if(arr[i]>arr[i+1]){
            int temp;
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]=temp;
            i--;
            }
        }
    }

    //array print
    System.out.println("Sorted Array : ");
    for(int i=0;i<5;i++){
        System.out.print(arr[i]+" ");
    }


    }
}