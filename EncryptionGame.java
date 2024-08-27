/* There is an encryption game going on. You will be given a number. If a digit is prime, it will take a vowel. Otherwise it will take a consonant value.
By this process, you have to make the string the lexicographically smallest possible. For a given number, print the output as a string.;

Input Format:
An integer n denoting the number.
Output Format:
The encrypted word.

Sample Input: 123421
Sample Output: baecab */

import java.util.*;
class EncryptionGame { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be encrypted");
        String n = sc.nextLine();

        String encryptedWord = encryptNumber(n);

        System.out.println(encryptedWord);
        sc.close();
    }

    public static String encryptNumber(String n) {
        char[] digitToChar = {
            'b', // 0
            'b', // 1
            'a', // 2
            'e', // 3
            'c', // 4
            'i', // 5
            'd', // 6
            'o', // 7
            'f', // 8
            'g'  // 9
        };
        StringBuilder encryptedWord = new StringBuilder();

        for(char digit: n.toCharArray()) {
            encryptedWord.append(digitToChar[digit - '0']);
        }
        return encryptedWord.toString();
    }
}