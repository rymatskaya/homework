package by.task16.exception;
/**3. Создать своё непроверяемое исключение AccountNotFoundException.
 В этом классе добавьте поле String errorCode, переопределите гетеры и сетеры.*/
public class AccountNotFoundException extends RuntimeException {
    private String errorCode;
    public AccountNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
