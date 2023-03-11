//class Base{
//    int x;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        System.out.println("I am in base and setting X now");
//        this.x = x;
//    }
//
//    public void Base(){
//        System.out.println("I am a constructor");
//    }
//}
//class Derived extends Base{
//    int y;
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        //Creating an object of base class
//        Base b = new Base();
//        b.setX(5);
//        System.out.println(b.getX());
//        //Creating an object of derived class
//        Derived d = new Derived();
//        d.setY(9);
//        System.out.println(d.getY());
//    }
//}
class Animal{
    int speak;
    int legsCount;

    public int getSpeak() {
        return speak;
    }

    public void setSpeak(int speak) {
        System.out.print("The number of animals can speak is : ");
        this.speak = speak;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        System.out.print("The total number of legs of the animals is : ");
        this.legsCount = legsCount;
    }
}
class Dog extends Animal{
    int Bark;

    public int getBark() {
        return Bark;
    }

    public void setBark(int bark) {
        System.out.print("The number of animals can bark is : ");
        Bark = bark;
    }
}
public class Inheritance{
    public static void main(String[] args) {
        //Creating object of Animal class
        Animal A = new Animal();
        A.setSpeak(4);
        System.out.println(A.getSpeak());
        A.setLegsCount(16);
        System.out.println(A.getLegsCount());
        //Creating object of Dog class
        Dog d = new Dog();
        d.setBark(2);
        System.out.println(d.getBark());
    }
}
