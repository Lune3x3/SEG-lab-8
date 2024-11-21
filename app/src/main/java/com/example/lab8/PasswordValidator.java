package com.example.lab8;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null) return false;

        char[] pswrd = password.toCharArray();

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean longEnough = pswrd.length > 9;

        for (char c : pswrd) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            if (Character.isDigit(c)) hasNumber = true;

            // If both conditions are met, the password is valid
            if (hasUpperCase && hasLowerCase && hasNumber && longEnough) return true;
        }
        return false;
    }
}