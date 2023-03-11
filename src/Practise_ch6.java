import java.util.Scanner;

public class Practise_ch6 {
    public static void main(String[] args) {
        //Question 1
//        float[] num = {0.8f,56.7f,53.4f,0.4f,34.7f};
//        float sum = 0;
//        for (int i = 0;i<5;i++)
//        {
//            sum += num[i];
//        }
//        System.out.println(sum);
        //using for each loop
//        for (float element : num)
//        {
//            sum += element;
//        }
//        System.out.println(sum);

        //Question 2
//        int a;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to check weather it is present in the array or not: ");
//        a = sc.nextInt();
//        int [] rollnum = {6,7,23,5,11,8,4,9,10,15};
//        for (int i=0;i<10;i++)
//        {
//            if (rollnum[i] == a)
//            {
//                System.out.println("Yes,the given number is present!!");
//            }
//        }
        //using for each loop
//        boolean arr = false;
//        for (float element : rollnum)
//        {
//            if (element == a)
//            {
//                arr = true;
//                break;
//            }
//        }
//        if (arr)
//        {
//            System.out.println("Yes,the given number is present!!");
//        }
//        else
//        {
//            System.out.println("Nope,the given number isn't present!!");
//        }

        //Question 3
//        float avg;
//        float sum = 0;
//        int [] marks = {56,78,90,40,86,89,70};
//        for (float element : marks)
//        {
//            sum += element;
//        }
//        System.out.println("The value of average marks is: " + sum/marks.length);

        //Question 4
//        int [][] mat1 = {{1,2,3},{4,5,6}};
//        int [][] mat2  = {{2,6,13},{3,7,1}};
//        int [][] result = {{0,0,0},{0,0,0}};
//        for (int i=0;i<mat1.length;i++)//row number of lines
//        {
//            for (int j = 0;j<mat1[i].length;j++)//column number of lines
//            {
//                System.out.format("Setting value for i = %d and j = %d\n",i,j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        //Printing the 2-d array
//        for (int i=0;i<mat1.length;i++)//row number of lines
//        {
//            for (int j = 0;j<mat1[i].length;j++)//column number of lines
//            {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println("");
//        }

        //Question 5
//        int []arr = {1,51,24,25,561,2,34,54,};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for (int i=0;i<n;i++)
//        {
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for (int element: arr)
//        {
//            System.out.print(element + " ");
//        }

        //Question 6
//        int [] arr = {11 , 21 , 3 , 44 , 74 , 697};
//        int max = arr[0];     // we can use max = Integer.MIN_VALUE
//        for (int i=0;i<arr.length;i++)
//        {
//            if (arr[i] > max)
//            {
//                max = arr[i];
//            }
//        }
//        System.out.println("The maximum term in the array is " + max);
        //using for each loop
//        for (int e : arr)
//        {
//            if (e>max)
//            {
//                max = e;
//            }
//        }
//        System.out.println("The maximum term in the array is " + max);

        //Question 7
//        int [] arr = {11 , 21 , 3 , 44 , 0 , 697};
//        int min = arr[0];    //we can use min = Integer.MAX_VALUE
//        for (int i=0;i<arr.length;i++)
//        {
//            if (arr[i] < min)
//            {
//                min = arr[i];
//            }
//        }
//        System.out.println("The minimum term in the array is " + min);
        //using for each loop
//        for (int e : arr)
//        {
//            if (e<min)
//            {
//                min = e;
//            }
//        }
//        System.out.println("The minimum term in the array is " + min);

        //Question 8
        boolean isSorted = true;
        int [] arr = {1,82,3,4,5,56,78};
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]>arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
        {
            System.out.println("The array is sorted!!");
        }
        else
        {
            System.out.println("The array is not sorted!!");
        }




















    }
}
