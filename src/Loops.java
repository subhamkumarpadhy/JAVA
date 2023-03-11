import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int i = 0 , n;
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
//        for (i = 1 ; i <= n ; i++) {
//            System.out.println(2*i+1);
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
        for (i = n ; i >= 0 ; i--)
        {
            System.out.println(i);
        }
    }
}
