//a.) Base Case: if(n < 3) return 1;
//b.) Recursive Call: return fib(n-1)+fib(n-2);
//c.)
public class One{
    public static int fib(int n){
        if(n < 3) return 1;
        return fib(n-1)+fib(n-2);
    }
}
