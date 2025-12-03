package by.task16.exception;
/** 4. Создать своё непроверяемое исключение NotEnoughMoneyException.
  В этом классе добавьте поле String errorCode, переопределите гетеры и сетеры.*/
public class NotEnoughMoneyException extends RuntimeException {
    private String errorCode;
    public NotEnoughMoneyException(String message, String errorCode) {
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
