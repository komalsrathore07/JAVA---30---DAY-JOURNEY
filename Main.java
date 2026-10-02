import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        playgame();
    }
    static void playgame(){
        Scanner sc = new Scanner(System.in);

        int secret=50;
        int attempts=0;
        int guess =0;
        
        while(guess != secret){

        System.out.println("enter your guess : ");
        guess = sc.nextInt();
        attempts++;

        if (guess == secret){
            System.out.println("correct");
        } else if(guess > secret){
            System.out.println("lower");
        } else {
            System.out.println("higher");
        }
    }

        System.out.println("attempts : " + attempts);
    } 
}
