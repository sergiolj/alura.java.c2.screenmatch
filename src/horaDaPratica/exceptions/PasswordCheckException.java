package horaDaPratica.exceptions;

import java.util.Scanner;

public class PasswordCheckException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your new password");
        System.out.println("Must have at least 8 char with 3 numbers and 5 letters");
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        try{
            passwordValidation(password);
            System.out.println("New password accepted");
        }catch(InvalidPasswordException e){
            System.out.println("Error : "+e.getMessage());
        }

        System.out.println("End program.");
    }

    private static void passwordValidation(String password) {
        var num=0;
        var letters=0;

        for (char l: password.toCharArray()) {
            if(Character.isAlphabetic(l)) {
                letters++;
            }
        }

        for (char c: password.toCharArray()) {
            if(Character.isDigit(c)){
                num++;
            }
        }

        if (password.length() < 8) {
            throw new InvalidPasswordException("Password invalid! A valid password must have at least 8 characters");
        }
        if(num<3){
            System.out.println("Given password has only: "+num+" numbers.");
            throw new InvalidPasswordException("Password invalid! A valid password must have at least 3 numbers");
        }
        if(letters<5){
            System.out.println("Given password has only: "+letters+" letters.");
            throw new InvalidPasswordException("Password invalid! A valid password must have at least 5 letters");
        }
    }
    sc.close();
}
