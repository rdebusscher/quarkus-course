package be.rubus.training.quarkus.cdi.audited;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.function.Supplier;

@ApplicationScoped
@Path("/timing")
public class E5InterceptorResource {

    private Supplier<String> fastSupplier;
    private Supplier<String> slowSupplier;

    public E5InterceptorResource(FastSupplier fastSupplier, SlowSupplier slowSupplier) {
        this.fastSupplier = fastSupplier;
        this.slowSupplier = slowSupplier;
    }

    @Path("/fast")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String fastResponse() {
        return fastSupplier.get();
    }

    @Path("/slow")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String slowResponse() {
        return slowSupplier.get();
    }
}
