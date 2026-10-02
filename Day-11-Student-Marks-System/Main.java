public class Main{
    public static void main(String[] args){
        student s1 = new student("komal",87,79,85);
        s1.display();
    }
}
class student{
    String name;
    int javaMarks;
    int mathMarks;
    int physicsMarks;
    int totalmarks(){
        return (javaMarks+mathMarks+physicsMarks);
    }
    double average(){
        return totalmarks()/3.0;
    }
    char grade(){
        if(average()>=90){
            return 'A';
        } else if(average()>=75){
            return 'B';    
        } else if(average()>=60){
            return 'C';
        } else {
            return 'D';
        }
    }

    student(String name,int javaMarks,int mathMarks,int physicsMarks){
        this.name=name;
        this.javaMarks=javaMarks;
        this.mathMarks=mathMarks;
        this.physicsMarks=physicsMarks;
    }
    void display(){
        System.out.println("name : " + name);
        System.out.println("javaMarks : " + javaMarks);
        System.out.println("mathMarks : " + mathMarks);
        System.out.println("physicsMarks : " + physicsMarks);
        System.out.println("total : " + totalmarks());
        System.out.println("average : " + average());
        System.out.println("grade : " + grade());
    }
}
