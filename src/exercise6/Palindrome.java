package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        boolean palindrome = false;

        assert number > 0;

        int tempNum = number;
        int digitCounter = 0;
        int reversedNum = 0;

        while(tempNum != 0){
            tempNum /= 10;
            digitCounter++;
        }

        for (int i = digitCounter; i >= 0; i--) {
            int digit = number % 10;
            reversedNum += digit * Math.pow(10,digitCounter);
        }

        if(number == reversedNum){
            palindrome = true;
        }

        System.out.println("Palindrome: " + palindrome);
    }
}
