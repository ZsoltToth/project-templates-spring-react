package hu.uni.eku.tzs.service.exceptions;

public class CampingSlotALreadyReservedException extends Exception{

    public CampingSlotALreadyReservedException() {
    }

    public CampingSlotALreadyReservedException(String message) {
        super(message);
    }

    public CampingSlotALreadyReservedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CampingSlotALreadyReservedException(Throwable cause) {
        super(cause);
    }

    public CampingSlotALreadyReservedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
