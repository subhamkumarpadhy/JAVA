interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}
class SmartPhones extends MyCellPhone implements MyWifi , MyCamera{
//    public void record4KVideo(){
//        System.out.println("Taking snap and recording in 4k...");
//    }
        public void takeSnap(){
        System.out.println("Taking snap!!");
    }
        public void recordVideo(){
        System.out.println("Editing video!!");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Network");
        String[] netWorkList = {"Subham" , "Ranjan" , "Samir"};
        return netWorkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class Default_Method {
    public static void main(String[] args) {
        SmartPhones ms = new SmartPhones();
        String[] arr = ms.getNetworks();
        for (String networks: arr) {
            System.out.println(networks);
        }
        ms.record4KVideo();
    }
}
