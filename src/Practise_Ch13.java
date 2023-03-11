// Question 1
class Th extends Thread{
    public void run(){
//        while(true) {
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println("Good Morning");
//        }
    }
}
class Th1 extends Thread{
    public void run(){
//        while(true) {
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println("Welcome");
//        }
    }
}
public class Practise_Ch13 {
    public static void main(String[] args) {
        Th y = new Th();
        Th1 h = new Th1();
        y.setPriority(8);
        h.setPriority(5);
        System.out.println(y.getPriority());;
        System.out.println(h.getPriority());
        System.out.println(y.getState());

        y.start();
        h.start();
        System.out.println(h.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
