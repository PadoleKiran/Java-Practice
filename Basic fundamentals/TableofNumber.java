// Program to print a table of any number.

import java.util.*;

class TableofNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}