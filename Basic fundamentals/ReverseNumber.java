//  Program to reverse a given number
import java.util.*;

class ReverseNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int number = sc.nextInt();

        int reverse = 0;


        while(number!=0){
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number/10;
        }

        System.out.println("The reverse of the given number is: " + reverse);

    }
}