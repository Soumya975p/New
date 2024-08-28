public class getset {
    private String s1 = "Name";

    public String get() {
        return s1;  
    }

    public String set(String x) {
        s1 = x;
        return s1;
    }

    public static void main(String[] args) {
        getset o1 = new getset();
        System.out.print(o1.get());
    }
}

