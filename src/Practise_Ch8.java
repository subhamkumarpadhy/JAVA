//import java.util.Scanner;
////Question 1
//class Employe
//{
//    int id;
//    int salary;
//    String name;
//    public void PrintDetails()
//    {
//        System.out.print("My id is " + id);
//        System.out.println(" and My name is " + name);
////        System.out.println(" and my salary is " + salary);
//    }
//    public int getSalary()
//    {
//        return salary;
//    }
//    String setName(String name)
//    {
//        return name;
//    }
//    String getName()
//    {
//        Scanner num = new Scanner(System.in);
//        name = num.nextLine();
//        return name;
//    }
//}
//
//public class Practise_Ch8 {
//    public static void main(String[] args) {
//        Scanner var = new Scanner(System.in);
//        Employe subham = new Employe();
//        Employe ranjan = new Employe();
//        subham.id = 56;
//        subham.salary = 30;
//        subham.name = "Subham Kumar Padhy";
//        ranjan.id = 45;
//        ranjan.salary = 23;
//        ranjan.name = "Ranjan Kumar sahu";
//        subham.PrintDetails();
//        ranjan.PrintDetails();
//        String naam = subham.setName("kanha padhy");
//        System.out.println(naam);
////        int salary = ranjan.getSalary();
////        System.out.println(salary);;
//        System.out.println("Enter your name ");
//        String name = subham.getName();
//        System.out.println("Your name is " + name);
////        subham.name = var.nextLine();
////        System.out.println("your name is " + subham.name);
////        System.out.println(subham.id);
////        System.out.println(subham.name);
//    }
//

//Question 2
//class cellphone
//{
//    public void print()
//    {
//        System.out.println("Ringing...");
//        System.out.println("vibrating...");
//    }
//}
//public class Practise_Ch8
//{
//    public static void main(String[] args)
//    {
//        cellphone ph = new cellphone();
//        ph.print();
//    }
//}

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

//Question 3
//class square
//{
//    int a;
//    float area(int n)
//    {
//        return (a * a);
//    }
//    float perimeter(int n)
//    {
//        return (4 * a);
//    }
//}
//public class Practise_Ch8 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        square obj = new square();
//        System.out.println("Enter the side of a square");
//        obj.a = sc.nextInt();
//        float a  = obj.area(obj.a);
//        float p = obj.perimeter(obj.a);
//        System.out.println("The area of the square is " + a);
//        System.out.println("The perimeter of the square is " + p);
//    }
//}

//Question 4
//class rectangle
//{
//    float length;
//    float breath;
//    float perimeter(float l,float b)
//    {
//        return 2 * (l + b);
//    }
//    float area(float l , float b)
//    {
//        return l * b;
//    }
//}
//public class Practise_Ch8 {
//    public static void main(String[] args) {
//        rectangle obj = new rectangle();
//        Scanner l = new Scanner(System.in);
//        System.out.println("Enter length of the rectangle");
//        obj.length = l.nextFloat();
//        System.out.println("Enter breath of the rectangle");
//        obj.breath = l.nextFloat();
//        float area = obj.area(obj.length,obj.breath);
//        float perimeter = obj.perimeter(obj.length,obj.breath);
//        System.out.println("The area of the rectangle is " + area);
//        System.out.println("The perimeter of the rectangle is " + perimeter);
//    }
//}

//Question 6
class circle
{
    float radius;
    float area (float r)
    {
        return (22 * r * r)/7;
    }
    float perimeter(float r)
    {
        return (2 * r * 22)/7;
    }
}
public class Practise_Ch8 {
    public static void main(String[] args) {
        circle obj = new circle();
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        obj.radius = num.nextFloat();
        System.out.println("The area of the circle is " + obj.area(obj.radius));
        System.out.println("The perimeter of the circle is " + obj.perimeter(obj.radius));
    }
}
