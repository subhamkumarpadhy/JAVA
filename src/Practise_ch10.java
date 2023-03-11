//class circle1{
//    public int radius;
//    circle1(){
//        System.out.println("I am default constructor!!");
//    }
//    circle1(int r){
//        this.radius = r;
//        System.out.println("I am a constructor!!");
//    }
//    public double area(){
//        return Math.PI * this.radius * this.radius;
//    }
//}
//class cylinder1 extends circle1{
//    public int height;
//    cylinder1(int r , int h){
//        super(r);
//        System.out.println("I am cylinder1!!");
//        this.height = h;
//    }
//    public double volume() {
//        return Math.PI * this.radius * this.radius * this.height;
//    }
//}
//public class Practise_ch10 {
//    public static void main(String[] args) {
//        circle1 objc = new circle1(5);
//        cylinder1 obj = new cylinder1(2,3);
//        double ans2 = objc.area();
//        System.out.println(ans2);
//        double ans = obj.volume();
//        System.out.println(ans);
//    }
//}

class Rectangle1{
    public int length;
    public int width;
    public int height;
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double area(){
        return this.length * this.width;
    }
    public double volume(){
        return this.length * this.width * this.height;
    }
}
class cuboid extends Rectangle1{
   public double area1(){
       return 2 * ((this.length * this.width) + (this.width * this.height) + (this.height * this.length));
   }
    public double volume1(){
        return this.length * this.width * this.height;
    }
}
public class Practise_ch10 {
    public static void main(String[] args) {
        Rectangle1 r = new cuboid();
        cuboid c = new cuboid();
        r.setLength(5);
        r.setWidth(8);
        r.setHeight(6);
        c.setLength(5);
        c.setWidth(8);
        c.setHeight(6);
        System.out.println("The area of the rectangle is :  " + r.area());
        System.out.println("The volume of the rectangle is : " + r.volume());
        System.out.println("The area of the cuboid is : " + c.area1());
        System.out.println("The volume of the cuboid is : " + c.volume1());
    }
}