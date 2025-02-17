package day2.one.question5;

public class ParampasasingDemo {
	public static void main(String[] args) {
       
        int num1 = 5, num2 = 10;

        System.out.println("Before swapping integers:");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

        swap(num1, num2);

        System.out.println("After swapping integers:");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);  

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        System.out.println("\nBefore swapping arrays:");
        System.out.println("arr1 = " + arrayToString(arr1));
        System.out.println("arr2 = " + arrayToString(arr2));

        swap(arr1, arr2);

        System.out.println("After swapping arrays:");
        System.out.println("arr1 = " + arrayToString(arr1));  
        System.out.println("arr2 = " + arrayToString(arr2));  
    }

    public static void swap(int a, int b) {
       
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside swap method (primitives):");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void swap(int[] arr1, int[] arr2) {
       
        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;

        System.out.println("Inside swap method (arrays):");
        System.out.println("arr1 = " + arrayToString(arr1)); 
        System.out.println("arr2 = " + arrayToString(arr2)); 
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }

}
