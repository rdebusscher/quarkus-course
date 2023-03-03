package be.rubus.training.quarkus.cdi.qualifier.v2;

import be.rubus.training.quarkus.cdi.qualifier.PaymentType;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BankV2Service implements PaymentV2Service {
    @Override
    public String performPayment(long customerId, double amount) {
        return String.format("Payment(v2) of %s for %s done by Bank", amount, customerId);
    }

    @Override
    public PaymentType handlesType() {
        return PaymentType.BANK;
    }
}
