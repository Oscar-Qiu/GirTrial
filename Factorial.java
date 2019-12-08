public class Factorial {


    public static long pureRecursive(int n) throws IllegalArgumentException {  // A purely recursive function that calculates the factorial of n.This function should call only itself.
        if (n <= 0) {
            throw new IllegalArgumentException();

        }
        if (n == 1) return 1;
        return pureRecursive(n - 1) * n;
    }

    public static long tailRecursive(int n) throws IllegalArgumentException {// A kickoff method for tail recursion; it should only call the tail()method
        return tail(n);
    }

    private static long tail(int n) throws IllegalArgumentException { // called by recursion kicked off method.Student can choose the parameter for this method. This method should only call itself and only via tail recursion. it should call itself on the last line with no other computation after function call.

        if (n <= 0) throw new IllegalArgumentException();
        if (n == 1) return n;

        return tail(n - 1) * n;
    }

    public static long iterative(int n) throws IllegalArgumentException {// An iterative version of the factorial calculation. This method should be an "unwound" version of the tailRecursive()method outlined above. It should not call itself or any method but should instead using a looping structure to calculate the factorial.
        long accumulate = 1;
        for (int i = 1; i <= n; i++) {
            accumulate*= i;
        }
        return accumulate;
    }

    public static void main(String[] args) throws Exception {
        // baseCase factorial(1)=1
        // Recurrence Relation  factorial(n)=n*factorial(n-1)

//System.out.println(pureRecursive(15));
//        System.out.println(tail(0));
          System.out.println(tailRecursive(13));
        System.out.println(iterative(13));
        System.out.println(tailRecursive(9));
        System.out.println(iterative(8));
        
    }
}
