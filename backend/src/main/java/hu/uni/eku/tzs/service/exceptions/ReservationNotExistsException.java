package hu.uni.eku.tzs.service.exceptions;

public class ReservationNotExistsException extends Exception {
    public ReservationNotExistsException() {
    }

    public ReservationNotExistsException(String message) {
        super(message);
    }

    public ReservationNotExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReservationNotExistsException(Throwable cause) {
        super(cause);
    }

    public ReservationNotExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
