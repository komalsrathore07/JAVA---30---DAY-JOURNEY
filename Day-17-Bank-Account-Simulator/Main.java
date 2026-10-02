import java.util.Scanner;
class account {
    String name;
    double balance;

    account(String name,double balance){
        this.name=name;
        this.balance=balance;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if (amount<=balance){
            balance -= amount;
        } else {
            System.out.println("insufficient balance");
        }
    }

    void display(){
        System.out.println("account holder : " + name);
        System.out.println("balance : " + balance);
    }
}
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the account holder name : ");
    String name = sc.next();

    System.out.println("enter the account balance : ");
    double balance = sc.nextDouble();

    account a = new account(name,balance);
        

    int choice;

    do{
        System.out.println("\n============BANK ACCOUNT============");
        System.out.println("1. deposit");
        System.out.println("2.withdraw");
        System.out.println("3.check balance");
        System.out.println("4.account details");
        System.out.println("5.exit");

        System.out.println("enter your choice : ");
        choice=sc.nextInt();
    

    switch(choice){
        case 1:
            System.out.println("enter the amount : ");
            double amount =sc.nextDouble();
            a.deposit(amount);
            break;

        case 2 : 
           System.out.println("enter the withdrawal amount : ");
           double withdrawamount = sc.nextDouble();
           a.withdraw(withdrawamount);
           break;

        case 3 :
            System.out.println("current balance : " + a.balance);
            break;

        case 4:
            a.display();
            break;
    }
    } while (choice!=5);
    }
