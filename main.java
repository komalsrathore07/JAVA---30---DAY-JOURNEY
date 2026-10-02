import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter you secret");
    int secret = sc.nextInt();
    
    int guess;

    System.out.print("enter your guess : ");
    guess = sc.nextInt();

    while(guess != secret){
      if(guess>secret){
        System.out.println("high");
      } else{
        System.out.println("low");
      }
      System.out.println("enter your guess : ");
      guess = sc.nextInt();

    }
    System.out.println("correct");

  }
}
