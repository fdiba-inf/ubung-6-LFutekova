package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean noSymbols = true;
        int digitCounter = 0;
        do {
            System.out.print("Enter Password: ");
            String password = input.next();

            if (password.length() < 8) {
                continue;
            }

            for (int i = 0; i < password.length(); i++) {
                if(!Character.isLetterOrDigit(password.charAt(i))){
                    noSymbols = false;
                    break;
                }
                if(Character.isDigit(password.charAt(i))){
                    digitCounter++;
                }
            }

        }while(!noSymbols || digitCounter < 2);

        System.out.println("Password valid!");
    }
}
