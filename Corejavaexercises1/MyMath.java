package Corejavaexercises1;

public class MyMath {
	public static boolean isPerfectNumber(int n) {
        if (n <= 0) return false;

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static long factorial(int n) {
        if (n < 0) return -1; 
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long sumOfPrimes(int n) {
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isArmstrongNumber(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    public static int reverseNumber(int n) {
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static int decimalToBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }

    public static int binaryToDecimal(int n) {
        return Integer.parseInt(String.valueOf(n), 2);
    }

    public static int getSumOfNfibos(int n) {
        int a = 0, b = 1;
        int sum = a + b;
        for (int i = 2; i < n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        return sum;
    }

    public static boolean isPalindromeNumber(int n) {
        int original = n;
        int reversed = 0;
        
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}


