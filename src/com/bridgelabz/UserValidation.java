package com.bridgelabz;


class InvalidNameException extends Exception{
    public InvalidNameException(String message){
        super(message);
    }
}
 class InvalidLastNameException extends Exception {
    public InvalidLastNameException(String message){
        super(message);
    }
}
 class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message){
        super(message);
    }
}
 class InvalidPhoneNumber extends Exception{
    public InvalidPhoneNumber(String message){
        super(message);
    }
}
class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}
public class UserValidation {
    static String name= "^[A-Z]{1}[a-z]{2,}";
    static String emailPattern = "^[A-Za-z0-9]{3,}[.]?[a-z]*@([a-z]+)[.]?[a-z]+[.]?[a-z]*$";
    static String mobileNumber = "^([0-9]{2,4})?[\s]?[0-9]{10}$";
    static String passwordRule = "^(?=.*[A-Z])(?=.*[!@#$%&*()])(?=.*[0-9])(?=\\S+$).{8,}$";

}
