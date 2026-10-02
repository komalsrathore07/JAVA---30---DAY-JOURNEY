import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int[] numbers = {12,5,8,20,3};
        int largest = numbers[0];

        for(int i=1;i<numbers.length;i++){
            if (numbers[i]>largest){
                largest = numbers[i]; 
            }
        }
        System.out.println("largest number is : " + largest);

        int smallest = numbers[0];

        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest number is : " + smallest);

        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        System.out.println("sum of the number is : " + sum);

        double average = 0;
        average = (double)sum/numbers.length;
        System.out.println("average of the number is : " + average);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to search : ");
        int target = sc.nextInt();

        boolean found = false;
        for(int i=0;i<numbers.length;i++){
            if (numbers[i] == target){
                found = true;
                System.out.println("found at index : " + i);
            }
            }
        if(!found){
            System.out.println("not found ");
        }
        for(int i =0;i<numbers.length -1;i++){
            for(int j =0;j<numbers.length -1 - i;j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;

                }

            }
        }
        for(int number : numbers){
            System.out.print(number+" ");
        }

    }
}
