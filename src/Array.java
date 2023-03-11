import java.sql.SQLOutput;

public class Array {
    public static void main(String[] args) {
        int [] marks = {98,75,97,84,74};
//        float[] marks = {98.5f,85.5f,64.5f,94.5f,78.5f};
//        System.out.println(marks.length);
//        System.out.println(marks[2]);
//        String [] students = {"Subham" , "Kanha" , "Ranjan" , "Samir" , "Manish"};
//        System.out.println(students.length);
//        System.out.println(students[4]);
//        System.out.println("Printing the array Naive way");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//        System.out.println("Printing the array using for loop");
//        for (int i=0;i<marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }
//        System.out.println("Printing the array in reverse order");
//        for (int i=marks.length-1;i>=0;i--)
//        {
//            System.out.println(marks[i]);
//        }
        System.out.println("Printing the array using for each loop");
        for (int element : marks)
        {
            System.out.println(element);
        }

        //Multidimensional array
//        int [][] flats;
//        flats = new int [2][3];
//        flats[0][0]=101;
//        flats[0][1]=102;
//        flats[0][2]=103;
//        flats[1][0]=203;
//        flats[1][1]=202;
//        flats[1][2]=203;
//        for (int i=0;i<flats.length;i++)
//        {
//            for (int j=0;j<flats[i].length;j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
    }
}
