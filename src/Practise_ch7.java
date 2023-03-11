import java.util.Scanner;

public class Practise_ch7 {
    //Question 1
//    static void multi(int n)
//    {
//        int a=1;
//        for (int i=1;i<=10;i++)
//        {
//            System.out.format("%d * %d = %d\n",n,i,(n*i));
//        }
//    }

    //Question 2
//    static void star(int n)
//    {
//        int i=1;
//        while (i<=n)
//        {
//            int j=1;
//            while (j<=i)
//            {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }

    //Question 3
//    static int sum(int n)
//    {
//        //Base condition to terminate recursion
//        if (n==1)
//        {
//            return 1;
//        }
//        else
//        {
//            return n + sum(n - 1);
//        }
//    }

    //Question 4
//    static void star(int n)
//    {
//        int i=1;
//        while (i<=n)
//        {
//            int j=i;
//            while (j<=n)
//            {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }

    //Question 5
//    static int fibo(int n)
//    {
////        if (n==1)
////        {
////            return 0;
////        }
////        else if (n==2)
////        {
////            return 1;
////        }
//        if (n == 1 || n == 2)
//        {
//            return n-1;
//        }
//        else
//        {
//            return fibo(n-1) + fibo(n-2);
//        }
//    }

    //Question 6
    static float average(float ...arr)
    {
        float sum =0;
        float avg;
        for (int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        avg = sum/arr.length;
        return avg;
    }
    public static void main(String[] args) {
        //Question 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to get it's multiplication table : ");
//        int num;
//        num = sc.nextInt();
//        System.out.println("The multiplication table of given number is :");
//        multi(num);

        //Question 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to get stars : ");
//        int num;
//        num = sc.nextInt();
//        star(num);

        //Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the index to get sum : ");
//        int num;
//        num = sc.nextInt();
//        System.out.print("The sum is : ");
//        int c = sum(num);
//        System.out.println(c);

        //Question 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to get stars : ");
//        int num;
//        num = sc.nextInt();
//        star(num);

//        Question 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the index to get fibonacci number : ");
//        int num;
//        num = sc.nextInt();
//        int a = fibo(num);
//        System.out.println("The fibonacci number at the given index is : " + a);

        //Question 6
        float result = average(4,6,3,7,4,6);
        System.out.println("The average is : " + result);
    }
}
