public class Q30 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Every alternate number in the array is:");

       
        for (int i = 0; i < 7; i += 2) {
            System.out.println(numbers[i]);
        }
    }
}