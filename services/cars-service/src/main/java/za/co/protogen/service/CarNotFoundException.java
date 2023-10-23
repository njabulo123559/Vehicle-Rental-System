package za.co.protogen.service;

public class CarNotFoundException extends Throwable {
    public CarNotFoundException(String message) {
        super(message);
    }
}
