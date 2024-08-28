public class object{
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        object o1 = new object();
        int result = o1.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}