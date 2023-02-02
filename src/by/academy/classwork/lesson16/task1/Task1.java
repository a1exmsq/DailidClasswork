package by.academy.classwork.lesson16.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    private static final Pattern VALIDATE_PATTERN = Pattern.compile("[A-Za-z0-9_]{5,20}");
    public static void main(String[] args) {
        String login;
        String password;
        String confirmPassword;

    }

    public static void validate (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        Matcher matcherLogin = VALIDATE_PATTERN.matcher(login);
        Matcher matcherPassword = VALIDATE_PATTERN.matcher(password);

        if (!matcherLogin.matches()){
            throw new WrongLoginException("Логин не совпадает с паттерном");
        }
        if (!matcherPassword.matches()){
            throw new WrongPasswordException("Пароль не совпадает с паттерном");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    public static boolean login(String login, String password, String confirmPassword){
        try {
            validate(login, password, confirmPassword);
        }
        catch (WrongLoginException | WrongPasswordException e){

        }

        return true;
    }
}
