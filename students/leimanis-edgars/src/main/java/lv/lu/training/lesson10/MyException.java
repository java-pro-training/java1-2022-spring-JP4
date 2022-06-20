package lv.lu.training.lesson10;

public class MyException extends RuntimeException{

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
