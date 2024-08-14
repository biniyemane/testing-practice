package org.example;

public class JavaPractiseMain {

    // Method to repeat a string n times
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(stringTimes("Hi", 2));  // Output: "HiHi"
        System.out.println(stringTimes("Hi", 3));  // Output: "HiHiHi"
        System.out.println(stringTimes("Hi", 1));  // Output: "Hi"
    }

    // Method to repeat the first 3 characters of a string n times
    public static String frontTimes(String str, int n) {
        int frontLength = Math.min(3, str.length());
        String front = str.substring(0, frontLength);

        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }

    // Method to count the number of "xx" in a string
    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }
}

