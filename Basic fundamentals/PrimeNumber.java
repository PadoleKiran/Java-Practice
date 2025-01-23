// Program to check whether number is prime or not

import java.util.*;

class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();

         if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        
        boolean prime = true;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i == 0){
                prime = false;
                break;
            }

        }

        if(prime){
            System.out.print(number + " is prime number");
        }
        else {
            System.out.print(number + " is not prime number");
        }
    }
}