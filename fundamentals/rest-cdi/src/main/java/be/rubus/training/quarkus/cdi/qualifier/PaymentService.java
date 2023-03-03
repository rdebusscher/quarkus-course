package be.rubus.training.quarkus.cdi.qualifier;

public interface PaymentService {

    String performPayment(long customerId, double amount);
}
