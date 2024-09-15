package hu.uni.eku.tzs.service.exceptions;

public class CustomerNotExistsException extends Exception{

    public CustomerNotExistsException() {
    }

    public CustomerNotExistsException(String message) {
        super(message);
    }

    public CustomerNotExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerNotExistsException(Throwable cause) {
        super(cause);
    }

    public CustomerNotExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
