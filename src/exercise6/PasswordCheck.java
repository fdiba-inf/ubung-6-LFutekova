package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean onlyLettersOrDigits = true;
        int digitCounter = 0;
        int characterCount = 0;

        System.out.print("Enter Password: ");

        while(true){
            String password = input.next();
            char symbol = password.charAt(0);
            if(Character.isLetterOrDigit(symbol)){
                characterCount++;
                if(Character.isDigit(symbol)){
                    digitCounter++;
                }
            }else{onlyLettersOrDigits = false;}

            if(digitCounter>=2 && characterCount>=8 && onlyLettersOrDigits){
                break;
            }else if(!onlyLettersOrDigits){break;}

        }

        System.out.println("Password valid!");
    }
}
