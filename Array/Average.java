// 1.Program to show sum and average of 10 element array. Accept array elements from user.

class Average {
    public static void main(String[] args) {
        int[] arr = {10,5,3,2,7,9,22,10,2,3};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        double average = sum/arr.length;
        System.out.println("Sum of array is " + sum);
        System.out.println("Average of array is " + average);
    }
}