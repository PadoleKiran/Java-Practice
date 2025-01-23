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

// output:
// Enter your number : 2
// 2 x 1 = 2
// 2 x 2 = 4
// 2 x 3 = 6
// 2 x 4 = 8
// 2 x 5 = 10
// 2 x 6 = 12
// 2 x 7 = 14
// 2 x 8 = 16
// 2 x 9 = 18
// 2 x 10 = 20