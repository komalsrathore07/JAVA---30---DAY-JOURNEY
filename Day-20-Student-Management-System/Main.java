import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        ArrayList<Student>students = new ArrayList<>();

        students.add(new Student(101,"komal",85));
        students.add(new Student(102,"rahul",78));
        students.add(new Student(103,"aman",92));

        for(Student s : students){
            System.out.println(s.roll_number + " " + s.name + " " + s.marks);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your roll number : ");
        int roll_number = sc.nextInt();
        System.out.println("enter your name : ");
        String name = sc.next();
        System.out.println("enter your marks : "); 
        int marks = sc.nextInt();

        students.add(new Student(roll_number,name,marks));

        System.out.println("enter the roll number to search : ");
        int searchroll=sc.nextInt();
        boolean found = false;

        for(Student s :students){
            if(s.roll_number == searchroll){
                System.out.println("Student found");
                System.out.println("name : " + s.name);
                System.out.println("nmarks : " + s.marks);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("student not found");
        }
    }
}
class Student{
    int roll_number;
    String name;
    int marks;

    Student(int roll_number,String name,int marks){
        this.roll_number=roll_number;
        this.name=name;
        this.marks=marks;
    }
}
