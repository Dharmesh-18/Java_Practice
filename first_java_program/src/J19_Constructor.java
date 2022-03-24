class MyMainEmployee{
    private int id;
    private String name;

//    We can overload constructors just as methods, below examples depicts it well!!

    public MyMainEmployee(){
        id = 10000;
        name = "Your_Name_Here";
    }

    public MyMainEmployee(int myId, String myName){
        this.id = myId;
        this.name = myName;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){return this.name;}

}


public class J19_Constructor {

    public static void main(String[] args) {

        MyMainEmployee e1 = new MyMainEmployee(15, "Moal");
        System.out.println(e1.getId());
        System.out.println(e1.getName());

        MyMainEmployee e2 = new MyMainEmployee();
        System.out.println(e2.getId());
        System.out.println(e2.getName());


    }
}
