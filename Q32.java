public class Q32 {
    int a;
    char c;

    Q32(int x,char y)
    {
        a=x;
        c=y;
        System.out.println("Parametrized Constructor is called.");
    }

    public static void main(String[] args) {
        Q32 c1=new Q32(5,'A');
    }
    
}
