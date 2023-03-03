package be.rubus.training.quarkus.cdi.qualifier;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@PaymentTypeSelection(PaymentType.BANK)
public class BankService implements PaymentService {
    @Override
    public String performPayment(long customerId, double amount) {
        return String.format("Payment of %s for %s done by Bank", amount, customerId);
    }
}
