import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;
public class Main{
	    public static void main(String[] args){
	        HashMap<String,Integer>students = new HashMap<>();
	        Scanner sc = new Scanner(System.in);
	
	        int choice;
	        do{
	            System.out.println("\n =======STUDENT RECORD MANAGER=======");
	            System.out.println("1. add student ");
	            System.out.println("2. view all students");
	            System.out.println("3. search Student");
	            System.out.println("4. update marks ");
	            System.out.println("5. remove student");
	            System.out.println("6. Exit");
	
	            System.out.println("Enter your choice : ");
	            choice = sc.nextInt();
	
	            if(choice == 1){
	                System.out.println("Enter the name : ");
	                String name = sc.next();
	                System.out.println("Enter the marks : ");
	                int marks = sc.nextInt();
	
	                students.put(name,marks);
	                System.out.println("Student added successfully");
	            }
	
	            if(choice == 2){
	                Iterator<Map.Entry<String,Integer>>it=students.entrySet().iterator();
	                while(it.hasNext()){
	                    Map.Entry<String,Integer>entry=it.next();
	
	                    System.out.println(entry.getKey() + "-->" + entry.getValue());
	                }
	            }
	
	            if (choice == 3){
	                System.out.println("enter the name to search : ");
	                String name = sc.next();
	
	                if(students.containsKey(name)){
	                    System.out.println("Student found");
	                } else {
	                    System.out.println("Student not Found ");
	                }
	
	                if(students.containsKey(name)){
	                    System.out.println("marks : " + students.get(name));
	                } else {
	                    System.out.println("Student not found ");
	                }
	            }
	
	            if(choice == 4){
	                System.out.println("enter the student name : ");
	                String name = sc.next();
	
	                if(students.containsKey(name)){
	                    System.out.println("enter the new marks : ");
	                    int newMarks = sc.nextInt();
	
	                    students.put(name,newMarks);
	                    System.out.println("Marks updated succesfullly");
	                } else {
	                    System.out.println("Student not found");
	                }
	            }
	
	            if (choice == 5){
	                System.out.println("enter the name to remove : ");
	                String name = sc.next();
	
	                if(students.containsKey(name)){
	                    students.remove(name);
	
	                    System.out.println("Student removed succesfully");
	                } else {
	                    System.out.println("Student not found ");
	                }
	            }
	        } while (choice!=6);
	    }
	}
