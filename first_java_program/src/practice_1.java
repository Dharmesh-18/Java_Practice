import java.util.Scanner;
public class practice_1 {
    public static void main(String[] args) {
        int hindi, maths, english, science, physical_education;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Hindi:");
        hindi = sc.nextInt();
        System.out.println("Enter the marks of English");
        english= sc.nextInt();
        System.out.println("Enter the marks of Maths:");
        maths= sc.nextInt();
        System.out.println("Enter the marks of Science:");
        science = sc.nextInt();
        System.out.println("Enter the marks of Physical Education:");
        physical_education = sc.nextInt();

        float total = hindi + english + science + maths + physical_education;
        float percent = total/5;
        System.out.println("You have got "+ percent + "%  marks.");
    }
}
