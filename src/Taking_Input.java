import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your total marks ");
//        int total = sc.nextInt();
        System.out.println("Enter your marks in MATH out of 100 ");
        float a = sc.nextFloat();
        System.out.println("Enter your marks in SCIENCE out of 100 ");
        float b = sc.nextFloat();
        System.out.println("Enter your marks in ENGLISH out of 100 ");
        float c = sc.nextFloat();
        System.out.println("Enter your marks in HINDI out of 100 ");
        float d = sc.nextFloat();
        System.out.println("Enter your marks in ODIA out of 100 ");
        float e = sc.nextFloat();
        float percentage = ((a + b + c + d + e) / 5.0f);
        System.out.println("The percentage of the student is " + percentage);
    }
}
