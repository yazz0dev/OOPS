/*Write a program to illustrate the following string manipulation methods
a. Create new strings using new
b. Getting string length
c. String concatenation
d. Character extraction
e. String comparison
f. Searching substrings
g. Modifying a string
h. Data conversion using value
*/

import java.util.Scanner;

class R13_str {
    public static void main(String[] args) {
        // a. Create new strings using new
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine(); // Read a string from user input
        // Using new keyword to create a string
        System.out.println("Using new keyword to create a string:");
        String strNew = new String(str1);
        System.out.println("New string: " + strNew);
        System.out.println("Enter second string:");
        String str2 = sc.nextLine(); // Read another string from user input
        // b. Getting string length
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        // c. String concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenated);

        // d. Character extraction
        char ch = str1.charAt(0);
        System.out.println("First character of str1: " + ch);

        // e. String comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);

        // f. Searching substrings
        int index = concatenated.indexOf("World");
        System.out.println("Index of 'World' in concatenated string: " + index);

        // g. Modifying a string
        String modifiedStr = str1.replace('H', 'J');
        System.out.println("Modified str1: " + modifiedStr);

        // h. Data conversion using valueOf
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("String representation of number: " + numStr);
    }
}