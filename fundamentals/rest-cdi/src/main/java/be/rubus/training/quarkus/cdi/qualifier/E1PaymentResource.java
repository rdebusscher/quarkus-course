package be.rubus.training.quarkus.cdi.qualifier;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/pay")
public class E1PaymentResource {

    @Inject
    @PaymentTypeSelection(PaymentType.CREDIT_CARD)
    PaymentService creditCardService;

    @Inject
    @PaymentTypeSelection(PaymentType.BANK)
    PaymentService bankService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{customerId}")
    public String doGreeting(@PathParam("customerId") long customerId, @QueryParam("paymentType") PaymentType paymentType) {
        double amount = lookupAmount(customerId);
        String result;
        switch (paymentType) {
            case CREDIT_CARD -> result = creditCardService.performPayment(customerId, amount);
            case BANK -> result = bankService.performPayment(customerId, amount);
            default -> result = "Unknown";
        }
        return result;
    }

    private double lookupAmount(long customerId) {
        return 123.45; // Another CDI service that retrieves info
    }
}
