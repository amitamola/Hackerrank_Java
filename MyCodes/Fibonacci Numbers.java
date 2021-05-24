//https://www.educative.io/courses/learn-java-from-scratch/xVlkQ4pv05l

class Fibonacci {
    public static String test(int n) {
        String fib = "0 1 ";

        int a,b, sum;
        a = 0;
        b = 1;

        for (int i=0; i<n-2; i++)
        {
            sum = a+b;
            a = b;
            b = sum;

            fib = fib + sum + " ";
        }
        return fib;
    }
}
