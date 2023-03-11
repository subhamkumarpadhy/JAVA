interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface BlowHorn{
    void blowHornk3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle , BlowHorn {
    void blowHorn(){
        System.out.println("Hello i'm subham");
    }
    public void applyBreak(int decrement)
    {
        System.out.println("Applying Break");
    }
    public void speedUp(int increment)
    {
        System.out.println("Speeding up!!");
    }
    public void blowHornk3g(){
        System.out.println("woo woo woo!!");
    }
    public void blowHornmhn(){
        System.out.println("Hip Hip Hip!!");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle subham = new AvonCycle();
        subham.applyBreak(5);
        //you can create properties in Interfaces
        System.out.println(subham.a);
        //you cannot modify the properties in Interfaces as they are final
//        subham.a = 657;
//        System.out.println(subham.a);

        subham.blowHornk3g();
        subham.blowHornmhn();
    }
}
