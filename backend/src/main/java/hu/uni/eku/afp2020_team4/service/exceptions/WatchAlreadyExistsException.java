package hu.uni.eku.afp2020_team4.service.exceptions;

public class WatchAlreadyExistsException extends Exception {
    public WatchAlreadyExistsException() {
    }

    public WatchAlreadyExistsException(String message) {
        super(message);
    }

    public WatchAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public WatchAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public WatchAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
