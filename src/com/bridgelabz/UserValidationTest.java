package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidationTest {
    public static void main(String[] args) throws Exception {
        UserValidation user = new UserValidation();
        Regex regexValidation = (a,b)-> Pattern.matches(a,b);

        try {
            if (  regexValidation.validate(UserValidation.name,"Prathmesh")) {
                System.out.println("Entered name correctly.");
            }else {
                throw new InvalidNameException("Enter name in wrong manner.");
            }
        }catch (InvalidNameException e){
            System.out.println("Exception is : "+e);
        }
        try {
            if (regexValidation.validate(UserValidation.passwordRule,"Pass!@wya12i")) {
                System.out.println("Entered password correctly.");
            }else {
                throw new InvalidPasswordException("Enter password in wrong manner.");
            }
        }catch (InvalidPasswordException e){
            System.out.println("Exception is : "+e);
        }
        try {
            if (regexValidation.validate(UserValidation.mobileNumber,"9930517261")) {
                System.out.println("Entered number correctly.");
            }else {
                throw new InvalidPhoneNumber("Enter number in wrong manner.");
            }
        }catch (InvalidPhoneNumber e){
            System.out.println("Exception is : "+e);
        }
        try {
            if (regexValidation.validate(UserValidation.emailPattern,"Prathemsh21@gmail.ocm")) {
                System.out.println("Entered email correctly.");
            }else {
                throw new InvalidEmailException("Enter email in wrong manner.");
            }
        }catch (InvalidEmailException e){
            System.out.println("Exception is : "+e);
        }
    }
}
