import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class UserRegistrationProblem {

//    @Desc:- it is a class which checks fist name and validate it
//    @Param:- takes first name as the input to check
//    @Return:- return true/false on the basis of input
    public boolean ValidateFirstName(String FirstName){
        boolean isValid = FirstName.matches("[A-Z][a-z]{3,15}");
        if(!isValid){
            System.out.println("first name is not valid");
        }

        return isValid;
    }

    //    @Desc:- it is a class which checks last name and validate it
//    @Param:- takes last name as the input to check
//    @Return:- return true/false on the basis of input
    public boolean ValidateLastName(String LastName){
        boolean isValid = LastName.matches("[A-Z][a-z]{3,15}");
        if(!isValid){
            System.out.println("last name is not valid");
        }

        return isValid;
    }

    //    @Desc:- it is a class which checks email and validate it
//    @Param:- takes email as the input to check
//    @Return:- return true/false on the basis of input
    public boolean ValidateEmailId(String Email) {
        boolean isValidEmail = Email.matches("^[a-zA-Z0-9_%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        if (!isValidEmail) {
            System.out.println("Email id is not valid ");
        }
        return isValidEmail;
    }


//    it is the main method
    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration program");
//        creating an object of the class to use the functions
        UserRegistrationProblem user = new UserRegistrationProblem();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first name");
        String FirstName = sc.next();
        System.out.println("enter the last name");
        String LastName = sc.next();
        System.out.println("enter email id");
        String Email = sc.next();

//        checking the name by using the class ValidateFirstName
        user.ValidateFirstName(FirstName);
//        checking the name by using the class ValidateFirstName
        user.ValidateLastName(LastName);
        //        checking the name by using the class ValidateFirstName
        user.ValidateEmailId(Email);
    }
}