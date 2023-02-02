package by.academy.classwork.lesson16.task1;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
