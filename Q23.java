class Q23 {
    public static void main(String[] args) {
     int k=1;   
      for(int i=0;i<=4;i+=2)
      {
        for(int j=0;j<=i;j++)
        {
          System.out.print(k);
          k++;
        }

          System.out.println();
      }

            

          

            for (int i = 1; i <= 4; i++) {
                for (int j = 4 - i; j > 0; j--) {
                    System.out.print(" ");
                }

                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
    
                System.out.println();
        }
    }
}
    