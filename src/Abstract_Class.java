abstract class Parent2{
    public Parent2(){
        System.out.println("Mai parent class ka constructor hoon!!");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends Parent2{

    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstract_Class {
    public static void main(String[] args) {
        child2 c = new child2();
        c.greet();
//        Parent2 p = new Parent2(); --> error
//        child3 ch = new child3(); --> error
    }
}