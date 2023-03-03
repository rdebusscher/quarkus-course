package be.rubus.training.quarkus.cdi.qualifier;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@PaymentTypeSelection(PaymentType.CREDIT_CARD)
public class CreditCardService implements PaymentService {
    @Override
    public String performPayment(long customerId, double amount) {
        return String.format("Payment of %s for %s done by Credit Card", amount, customerId);
    }
}
