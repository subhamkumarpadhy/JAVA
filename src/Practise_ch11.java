//Question 1 , 2
/*abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen{
     void write(){
         System.out.println("Write an essay for me!!");
     }
     void refill(){
         System.out.println("I lost my refill!!");
     }
    void changenib(){
        System.out.println("I want to change the Nib!!");
    }
}
public class Practise_ch11 {
    public static void main(String[] args) {
        FountainPen subhu = new FountainPen();
        subhu.changenib();
        subhu.refill();
        subhu.write();
    }
}
*/
//Question 3
/*interface BasicAnimal{
     void eat();
     void sleep();
}
class monkey{
    void jump(){
        System.out.println("The boy is jumping!!");
    }
    void bite(){
        System.out.println("The dog can bite!!");
    }
}
class Human extends monkey implements BasicAnimal{
    @Override
    public void sleep(){
        System.out.println("It's a natural process!!");
    }
    @Override
    public void eat(){
        System.out.println("Everyone have this feature!!");
    }
    void speak(){
        System.out.println("I can speak!!");
    }
}
public class Practise_ch11 {
    public static void main(String[] args) {
        Human dot = new Human();
        dot.eat();

        //Question 5
        monkey m1 = new Human();
//        m1.speak(); --> cannot use speak method coz the reference is monkey which does not have speak method
        m1.bite();
        m1.jump();

        BasicAnimal samir = new Human();
//        samir.speak(); --> error
        samir.eat();
        samir.sleep();
    }
}*/
//Question 4
/*abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    void internet(){
        System.out.println("I have the access to internet!!");
    }
    public void ring(){
        System.out.println("The phone is ringing!!");
    }
    public void lift(){
        System.out.println("Can you lift the phone which is ringing ?");
    }
    public void disconnect(){
        System.out.println("Could not connect to the call right now!!");
    }
}
public class Practise_ch11 {
    public static void main(String[] args) {
        SmartTelephone sm = new SmartTelephone();
        sm.internet();
        sm.disconnect();
        sm.lift();
        sm.ring();
        System.out.println();
        Telephone tle = new SmartTelephone();
//        tle.internet(); --> Error coz the reference is telephone
        tle.disconnect();
        tle.lift();
        tle.ring();
    }
}*/
//Question 6 & 7
interface TVRemote{
    void buttons();
    void battery();
}
interface SmartTVRemote extends TVRemote{
    void autoCap();
    void autoSave();
}
class TV implements TVRemote{
    public void buttons(){
        System.out.println("There are so many buttons!!");
    }
    public void battery(){
        System.out.println("There is no battery inside the remote!!");
    }
}
public class Practise_ch11 {
    public static void main(String[] args) {
    }
}