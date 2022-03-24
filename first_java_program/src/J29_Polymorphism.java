interface MyCamera2 {
    void takeSnap();

    void recordVideo();  // will be forced to be implemented in implementing classes..

    private void greet(){
        System.out.println("Good Morning.. ");
    }

    default void record4kVideo() {  // (default) will not be forced to be implemented in implementing classes..
        greet();  // bahar to access nhi kr skte but interface k andar we can access the private ones also
//        and interface me function body sirf default wale me hi bna skte hain isliye to use private methods we first need to have default methods..
        System.out.println("Recording in 4k..");
    }


}

interface MyWifi2 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling : " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }
}

class MySmartphone2 extends MyCellPhone implements MyWifi2, MyCamera2 {
    public void Intro(){
        System.out.println("I am a smartphone..");
    }

    public void takeSnap() {
        System.out.println("Taking Snap..");
    }

    public void recordVideo() {
        System.out.println("Recording Video..");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of Networks..");
        String[] networkList = {"Goal", "Moal", "Soal"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to : " + network);
    }

//    public void record4kVideo() {  // override nhi krte to interface me predefined vala run hota
//        System.out.println("I am overridden recording of 4k video..");
//    }

}

public class J29_Polymorphism {

    public static void main(String[] args) {

        MyCamera2 cam2 = new MySmartphone2();  // This is a Smartphone but use it as a camera only (only camera methods accessible, not the smartphone ones)

//        cam2.takeSnap();
//        cam2.record4kVideo();
//        cam2.Intro(); // Trying to access method of smartphone will not work..

        MyWifi2 wifi2 = new MySmartphone2(); // This is a Smartphone but use it as a wifi only..
//        wifi2.takeSnap(); // throws error bcz works as wifi only ( access only wifi methods neither camera not smartphone me defined ones)
//        wifi2.getNetworks(); // works perfectly fine bcz jiska object hai usi ka methods use kr rha hail..

        MySmartphone2 ms2 = new MySmartphone2(); // this is a fully functional smartphone which can access all the methods of smartphone
        ms2.Intro();
        ms2.connectToNetwork("warbreaker");
        ms2.callNumber(934834);
        ms2.pickCall();

    }
}

