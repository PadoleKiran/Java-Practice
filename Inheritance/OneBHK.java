// 1. Create class OneBHK
//  with instance variable roomArea , hallArea and price 
//  a.Create default and parameterized constructor;
//  b.Method show(): to print OneBHK data member information;
//  c. Create another class TwoBHK which has all the properties and behaviour of OneBHK
//  and a new instance variable room2Area.
//  a.Create default and parameterized constructor;
//  b.Method show(): to print all data member information;
//  Write main function in another class(Say XYZ) and store three TwoBHK
//  flat’s information and print information using show method.
//  Also print total amount of allflats.

class OneBHK {
    int roomArea = 456;
    int hallArea = 254;
    int price = 300000;

    OneBHK() {
        System.out.println("This is default constructor");
    }
    OneBHK(int roomArea, int hallArea, int price) {
        System.out.println("This is parameterized constructor");
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    void show() {
        System.out.println("This is show() method in OneBHK class");
        System.out.println("Room Area : " + roomArea + "\nHall Area : " + hallArea + "\nPrice : " + price);
        // return price;
    }
}


class TwoBHK extends OneBHK {
    int roomArea = 456;
    int hallArea = 254;
    int price = 300000;

    TwoBHK() {
        System.out.println("This is default constructor");
    }
    TwoBHK(int roomArea, int hallArea, int price) {
        System.out.println("This is paramerize constructor");
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    @Override
    void show() {
        // TODO Auto-generated method stub
        super.show();
        System.out.println("This is show() method in TwoBHK class");
        System.out.println("Room Area : " + roomArea + "\nHall Area : " + hallArea + "\nPrice : " + price);
        // return price;
    }

}

class MainClass {
    public static void main(String[] args) {
        TwoBHK twobhk1 = new TwoBHK(100,200,3000);
        TwoBHK twobhk2 = new TwoBHK(101,201,3001);
        TwoBHK twobhk3 = new TwoBHK(102,202,3003);

        twobhk1.show();
        twobhk2.show();
        twobhk3.show();

        int totalAmmount = twobhk1.price + twobhk2.price + twobhk3.price;
        System.out.println("Total Ammount is " + totalAmmount);
    }
}