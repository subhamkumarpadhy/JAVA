class Base1{
    Base1(){
        System.out.println("I am a constructor!!");
    }
    Base1(int n){
        System.out.println("I am a constructor with integer value " + n);
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(5);
        System.out.println("I am a derived class constructor!!");
    }
    Derived1(int a , int b){
        super(a);
        System.out.println("I am a derived class constructor with value of " + b);
    }
}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a child of derived constructor!!");
    }
    childOfDerived(int x , int y , int z){
        super(x,y);
        System.out.println("I am a child of derived class constructor with value of " + z);
    }
}
public class Constructor_In_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1(4,9);
        childOfDerived cd = new childOfDerived(12,14,16);
    }
}
