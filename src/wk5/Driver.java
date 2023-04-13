package wk5;


public class Driver {
    public static void main(String[] args) {
        int[] data = {1, 5, 13, 14, 15, 21, 33};
        System.out.println(binarySearch(data, 2));
        System.out.println(binarySearch(data, 1));
        System.out.println(binarySearch(data, 5));
        System.out.println(binarySearch(data, 8));
        System.out.println(binarySearch(data, 13));
        System.out.println(binarySearch(data, 15));
        System.out.println(binarySearch(data, 21));
        System.out.println(binarySearch(data, 121));
    }

    public static boolean binarySearchRec(int[] data, int target) {
        return binarySearch(data, target, 0, data.length);
    }

    public static boolean binarySearch(int[] data, int target, int front, int back) {
        return false;
    }

    // front = 5, back = 10
    public static boolean binarySearch(int[] data, int target) {
        boolean found = false;
        int front = 0;
        int back = data.length;
        while(!found && front<back) {
            int middleIndex = (back + front) / 2;
            if (data[middleIndex] == target) {
                found = true;
            } else if (data[middleIndex] > target) {
                back = middleIndex;
            } else {
                front = middleIndex+1;
            }
        }
        return found;
    }


    public static void main2(String[] args) {
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
