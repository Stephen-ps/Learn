package JavaBasic.Exception.CustomException;
/**
 * @author: Steven
 * @date: 2021/5/5
 */
public class RegisterException extends RuntimeException {
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
