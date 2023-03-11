import java.util.Scanner;

public class Practise_Ch14 {

    public static void main(String[] args) {
        // Question 1
//        int a = 0 // Logical error
//        int age = 78;
//        int year_born = 2000 - 78;// Logical error
//        System.out.println(6/0); // Run time error
        // Question 2
//            try {
//                System.out.println(6/0);
//            }
//            catch (ArithmeticException subham){
//                System.out.println("HaHa");
//            }
//            catch (IllegalArgumentException ranjan){
//                System.out.println("HeHe");
//            }
        //Question 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        int index;
        int i = 0;
        Scanner sc = new Scanner((System.in));
        while (flag && i < 5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i>=5){
            System.out.println("Error");
        }
    }
}
