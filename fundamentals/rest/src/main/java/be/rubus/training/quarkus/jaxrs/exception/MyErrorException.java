package be.rubus.training.quarkus.jaxrs.exception;

public class MyErrorException extends BusinessException {

    public MyErrorException(int value) {
        super(String.format("The value %s is not allowed", value));
    }
}
