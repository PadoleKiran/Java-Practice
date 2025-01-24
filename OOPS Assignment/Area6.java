import java.util.Scanner;

// Create a class to calculate Area of circle with one data member to store the radius.
// 	a. constructor - Initialize radius from user
// 	b. calculateArea - to calculate area
// 	3. display- to display area
class Area{
    private float PI = 3.14f;
    int radius;
    Area(int radius){
        this.radius = radius;
        System.out.print("This is default default constructor");
    }
    float calculateArea(){
        return PI * radius * radius;
    }
    void display(){
        System.out.println("Area of circle is " + calculateArea());
    }
}

public class Area6 {
    public static void main(String[] area){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of radius :");
        int radius = sc.nextInt();

        Area area1 = new Area(radius);
        area1.display();
    }
    
}


// Enter value of radius :5
// This is default default constructorArea of circle is 78.5