class Employee1 {

    int id;
    int salary = 100;
    String name;

    public void getDetails(){
        System.out.println("My id is : " + id);
        System.out.println("My salary is : " + salary);
        System.out.println("My name is : " + name);
    }

    public int getSalary(){
        return salary;
    }

}



public class J17_OOPS_Intro {

    public static void main(String[] args) {

        Employee1 goal = new Employee1();
        goal.id = 10;
        goal.salary = 500;
        goal.name = "goalmoal";

        Employee1 doal = new Employee1();
        doal.id = 15;
        doal.salary = 200;
        doal.name = "roalsoal";

        goal.getDetails();

        System.out.println(doal.getSalary());

    }
}
