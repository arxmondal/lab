package com.cms.validation;

// Importing necessary packages
import com.cms.db.DbConnection;
import com.cms.operations.CreateAccount;
import com.cms.operations.StudentInfo;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    // Name Validation
    public static void nameValidation(String input) {

        // Expression to validate name
        String expression = "^[a-zA-Z\\s]+";
        // Checking name is valid or not
        if (input.matches(expression)) {
            StudentInfo.setName(input);
        }

        // If name isn't valid
        else {
            System.out.println("Invalid Input! Name can only contains alphabet and a single space");
            CreateAccount.enterName();
        }
    }


    // Phone Validation
    public static void phoneValidation(String input) {
        boolean result;
        // The given argument to compile() method
        // is regular expression. With the help of
        // regular expression we can validate mobile
        // number.
        // The number should be of 10 digits.
        // Creating a Pattern class object
         Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        // Pattern class contains matcher() method
        // to find matching between given number
        // and regular expression for which
        // object of Matcher class is created
        Matcher m = p.matcher(input);
        // Returning boolean value
        result = (m.matches());
        if (result) {
            try {
                StudentInfo.setPhone(Long.parseLong(input));
            } catch (InputMismatchException e) {
                System.out.println("Oh No! Phone number must be a 10 digit number");
                CreateAccount.enterPhoneNumber();
            } catch (Exception e) {
                System.out.println("Something Wrong happened! Please Try Again");
                CreateAccount.enterPhoneNumber();
            }
        } else {
            System.out.println("Invalid Phone Number! Please Try Again :)");
            CreateAccount.enterPhoneNumber();
        }
    }
}
