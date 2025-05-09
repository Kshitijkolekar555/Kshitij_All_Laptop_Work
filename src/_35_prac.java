public class _35_prac {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println(fib(7));
        pattern(9);
        pattern_rev(9);
    }
    //Fibonacci series: 0 1 1 2 3 5 8 13 21 34
    static int fib(int n){
        if (n==1||n==2){
            return n-1;
        }
        else{
        return fib(n-1)+fib(n-2);}
    }
    static  void pattern(int n){
        if(n>0){
            pattern(n-1);
            for (int i = 0; i <n; i++) {
            System.out.print("* ");
            }
            System.out.println();
        }
        else {
            System.out.println("the end");
        }
    }
    static void pattern_rev(int n){
        if(n>0){
            for (int i = 0; i <n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            pattern_rev(n-1);

        }
        else{System.out.println("the end");}


    }

}
