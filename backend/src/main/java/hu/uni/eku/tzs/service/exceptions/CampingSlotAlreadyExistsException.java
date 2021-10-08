package hu.uni.eku.tzs.service.exceptions;

public class CampingSlotAlreadyExistsException extends Exception{

    public CampingSlotAlreadyExistsException() {
    }

    public CampingSlotAlreadyExistsException(String message) {
        super(message);
    }

    public CampingSlotAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public CampingSlotAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public CampingSlotAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
