interface MyCamera {
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

interface MyWifi {
    String[] getNetworks();

    void connectToNetworks(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling : " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }
}

class MySmartphone extends MyCellPhone implements MyWifi, MyCamera {
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

    public void connectToNetworks(String network) {
        System.out.println("Connecting to : " + network);
    }

//    public void record4kVideo() {  // override nhi krte to interface me predefined vala run hota
//        System.out.println("I am overridden recording of 4k video..");
//    }

}

public class J27_Interface_Example_Default_Methods {

    public static void main(String[] args) {

        MySmartphone ms1 = new MySmartphone();

        String[] networks = ms1.getNetworks();
        for (String network : networks) {
            System.out.println(network);
        }

//        ms1.greet();  // throws error greet being private in MyCamera..

        ms1.record4kVideo();



    }
}
