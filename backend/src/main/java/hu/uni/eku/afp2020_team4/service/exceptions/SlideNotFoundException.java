package hu.uni.eku.afp2020_team4.service.exceptions;

public class SlideNotFoundException extends Exception {
    public SlideNotFoundException() {
    }

    public SlideNotFoundException(String message) {
        super(message);
    }

    public SlideNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SlideNotFoundException(Throwable cause) {
        super(cause);
    }

    public SlideNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
