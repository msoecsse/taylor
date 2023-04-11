package wk5;

public class Driver {
    public static void main(String[] args) {
        //recurse(5);
        System.out.println(fib(8));
        /*
        f(8) = f(7)                                           + f(6)
             = f(6)        + f(5)        + f(5)        + f(4)
             = f(5) + f(4) + f(4) + f(3) + f(4) + f(3) +
         */
    }

    private static int fib(int n) {
        if(n<0) {
            throw new IllegalArgumentException("Fibs don't do negs");
        }
        if(n<2) {
            System.out.println(n);
        }
        return n < 2 ? n : fib(n-1) + fib(n-2);
    }

    private static void recurse(int i) {
        if(i<=10) {
            System.out.println(i);
            recurse(i+1);
        }
    }
}
