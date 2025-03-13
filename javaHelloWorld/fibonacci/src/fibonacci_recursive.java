public class fibonacci_recursive {
    //recursive metotlar ile fibonacci serisi bulan program
    // 1 1 2 3 5 8 13 21...
    //f(1) = 1
    //f(2) = 1
    //...
    //GENEL FORMÜL: f(n) = f(n-1) + f(n-2)
    //f(6) = f(5) + f(4)
    //...

    static  int fib(int n){
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib (n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));

    }
}
