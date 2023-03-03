package be.rubus.training.quarkus.cdi.qualifier.v2;

import be.rubus.training.quarkus.cdi.qualifier.PaymentType;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/pay-v2")
public class E1BisPaymentResource {

    private final Instance<PaymentV2Service> paymentServices;

    @Inject
    public E1BisPaymentResource(@Any Instance<PaymentV2Service> paymentServices) {
        this.paymentServices = paymentServices;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{customerId}")
    public String doGreeting(@PathParam("customerId") long customerId, @QueryParam("paymentType") PaymentType paymentType) {
        double amount = lookupAmount(customerId);
        PaymentV2Service paymentService = findPaymentService(paymentType);

        return paymentService.performPayment(customerId, amount);

    }

    private PaymentV2Service findPaymentService(PaymentType paymentType) {
        return paymentServices.stream()
                .filter(ps -> ps.handlesType() == paymentType)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("This should be a better exception"));
    }

    private double lookupAmount(long customerId) {
        return 123.45; // Another CDI service tat retrieves info
    }
}
