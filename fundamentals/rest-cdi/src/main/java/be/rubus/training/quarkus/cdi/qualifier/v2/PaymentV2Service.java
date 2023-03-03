package be.rubus.training.quarkus.cdi.qualifier.v2;

import be.rubus.training.quarkus.cdi.qualifier.PaymentType;

public interface PaymentV2Service {

    String performPayment(long customerId, double amount);

    PaymentType handlesType();
}
