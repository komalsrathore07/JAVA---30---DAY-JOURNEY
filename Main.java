import java.util.Scanner;

public class Main{

    static int calculatetotal(int marks1,int marks2,int marks3){
        return (marks1+marks2+marks3);
    } 
    static double calculateaverage(int total){
        return (total/3.0);
    }
    static String calculategrade(double average){
        if (average>=80){
            return ("A");
        }   else if (average>=60){
            return ("B");
        } else if (average>=40){
            return ("C");
        } else {
            return ("F");
        }
    }

    public static void main(String[] args){
        int total = 0;
        double average = 0;
        String grade = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your name : ");
    String name = sc.next();

    System.out.println("enter your marks in java : ");
    int marks1 = sc.nextInt();

    System.out.println("enter your marks in maths : ");
    int marks2 = sc.nextInt();

    System.out.println("enter your marks in physics : ");
    int marks3 = sc.nextInt();

    total = calculatetotal(marks1,marks2,marks3);
    System.out.println("total : " + total);

    average = calculateaverage(total);
    System.out.println("average : " + average);

    grade = calculategrade(average);
    System.out.println("grade : " + grade);

    }
}
