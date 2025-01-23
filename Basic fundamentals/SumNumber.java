// Calculate sum of first 20 integers. ( input -> 20, output -> total sum of 1 to 20 numbers )
import java.util.*;

class SumNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=number;i++){
            sum = sum + i;
        }

        System.out.print("Sum of " + number + " is : " + sum);
    }
}