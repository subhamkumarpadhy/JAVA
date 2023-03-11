////By expanding Thread class
//class MyThread1 extends Thread{
//    @Override
//    public void run(){
//        int i = 0;
//        while (i<40){
//            System.out.println("I am cooking for my family.");
//            i++;
//        }
//    }
//}
//class MyThread2 extends Thread{
//    @Override
//    public void run(){
//        int i = 0;
//        while (i<40){
//            System.out.println("I am chatting with my BFF.");
//            i++;
//        }
//    }
//}
//public class Multithreading {
//    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//        t1.start();
//        t2.start();
//    }
//}

//My implementing Runnable interface
class MyThreadRunnable1 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am thread 1 not thread 1.");
            i++;
        }
    }
}class MyThreadRunnable2 implements Runnable{
    public void run() {
        int j = 0;
        while (j < 100) {
            System.out.println("I am thread 2 not thread 2.");
            j++;
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
