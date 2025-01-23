// 1. 
//  Create a class Math with following requirements
// - A class level data member called PI set to 3.14.
// - A class level public method called getCircleArea, which takes as input an integer parameter called radius. This function should return area of the circle as a double

import java.util.*;
class Math{
    
    private float PI = 3.14f;

    public double getCircleArea(int radius){
        return PI * radius * radius;
    } 
} 

public class AreaofCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of radius : ");
        int radius = sc.nextInt();

        Math math = new Math();
        double area = math.getCircleArea(radius);
        System.out.println("Area of circle is " + area);
    }
}

// output : 
// Enter value of radius : 5
// Area of circle is 78.5