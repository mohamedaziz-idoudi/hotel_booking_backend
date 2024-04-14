package idoudi.hotelbooking.lakesidehotel.exception;



public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
