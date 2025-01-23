// Print all prime numbers between two given numbers.

import java.util.*;

class PrimeNumberBetweenTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int lastNumber = sc.nextInt();

        System.out.println("Prime Numbers are : ");
        for(int i = firstNumber; i <= lastNumber; i++){
            if(i==0 || i==1)
            {
                continue;
                // break;
            }

            // if(i%2 != 0)
            // {
            //     System.out.print(" " +i);
            // }

            boolean prime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                // System.out.print(j);
                if(i%j==0){
                    prime = false;
                    break;
                    // continue;
                }
            }

            if(prime){
                System.out.print(" " +i );
            }
        }

    }
}