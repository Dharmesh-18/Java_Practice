class MyEmployee{
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}

public class J18_GetterSetter_AccessModifiers {

    public static void main(String[] args) {

        MyEmployee e1 = new MyEmployee();
        e1.setId(5);
        e1.setName("Goal");

        System.out.println(e1.getId());
        System.out.println(e1.getName());


    }
}
