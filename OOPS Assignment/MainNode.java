import java.util.Scanner;

// Create a Node class with following requirements

// Two data members
// i. data : int
// ii. next : Node
// A constructor which takes an integer parameter. This constructor should set data property and leave the next set to null.
// A constructor which takes a Node parameter. This constructor should make a deep copy of the passed node
class Node {
    Node() {
        String data = null;
    }
}

public class MainNode {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        Node node = new Node();
    }
}


// not done yet