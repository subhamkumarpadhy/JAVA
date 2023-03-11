import java.util.Scanner;

public class Recursion {
    static int factorial_recursive(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial_recursive(n - 1);
        }
    }
    static int factorial_iterative(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            int product = 1;
            for (int i=1;i<=n;i++)
            {
                product *= i;
            }
            return product;
        }
    }

        public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int g;
            System.out.println("Enter the number you want the factorial of ");
        g = num.nextInt();
        System.out.println("The value of factorial of entered number by recursive method is : " + factorial_recursive(g));
        System.out.println("The value of factorial of entered number iterative method is : " + factorial_iterative(g));
    }
}
