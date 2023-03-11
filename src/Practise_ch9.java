import java.util.Scanner;

class cylinder
{
    Scanner sc = new Scanner(System.in);
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

//    public int setR()
//    {
//        System.out.println("Enter radius");
//        int r = sc.nextInt();
//        radius = r;
//        return r;
//    }
    public int getR()
    {
        return radius;
    }
//    public int setH()
//    {
//        System.out.println("Enter height");
//        int h = sc.nextInt();
//        height = h;
//        return h;
//    }
    public int getH()
    {
        return height;
    }

    double area(int r , int h)
    {
        double area = (2 * Math.PI * r * h)+(2 * Math.PI * r * r);
        return area;
    }
    double volume(int r , int h)
    {;
        double volume = (Math.PI * r * r * h);
        return volume;
    }
}
class Rectangle
{
    private int length;
    private int breath;

    public Rectangle(){
        this.length = 4;
        this.breath = 5;
    }

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }
    public int getBreath() {
        return breath;
    }
}
public class Practise_ch9 {
    public static void main(String[] args) {
//        cylinder set = new cylinder(9,12);
////        set.setR(9);
//        int a = set.getR();
////        set.setH(12);
//        int b = set.getH();
//        System.out.println("The radius is : " + a);
//        System.out.println("The height is : " + b);
//        double ans = set.area(a,b);
//        System.out.println("The area of the cylinder is :" + ans);
//        double ans2 = set.volume(a,b);
//        System.out.println("The volume of the cylinder is :" + ans2);
        Rectangle R = new Rectangle(8,6);
        System.out.println(R.getLength());
        System.out.println(R.getBreath());
    }
}