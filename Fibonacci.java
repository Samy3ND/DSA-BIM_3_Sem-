class Fibonacci {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        int no = 9;for(int i=0;i<=no;i++)
        
        System.out.println(
            i + "th Fibonacci Number: " + fib(i));
        
    }
}