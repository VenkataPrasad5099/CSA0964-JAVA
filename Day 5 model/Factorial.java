public class Factorial {
    public static void main(String[] args) {
        int fact=5;
        System.out.println(factorial(fact));

    }
    static int factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
