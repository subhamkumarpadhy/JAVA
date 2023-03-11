interface SampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface {
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Inheritance_In_Interface {
    public static void main(String[] args) {
        MySampleClass Kanha = new MySampleClass();
        Kanha.meth1();
        Kanha.meth2();
        Kanha.meth3();
        Kanha.meth4();
    }
}
