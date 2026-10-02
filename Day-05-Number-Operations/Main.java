import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number : ");
    int number = sc.nextInt();
    int sum = 0;
    int temp = number;
    int reverse = 0;

    if(number%2 == 0){
      System.out.println("even");
    } else {
      System.out.println("odd");
    }

    while(temp !=0){
      int digit = temp%10;
      sum = sum + digit;
      temp = temp/10;
    }
    System.out.println("sum = " + sum);

    temp=number;
    while(temp !=0){
      int digit = temp%10;
      reverse = reverse * 10 + digit;
      temp = temp/10;
    }
    System.out.println("reverse = " + reverse);

    if(number == reverse){
      System.out.println("palindrome : yes");
    } else {
      System.out.println("palindrome : no");
    }
  } 
}
