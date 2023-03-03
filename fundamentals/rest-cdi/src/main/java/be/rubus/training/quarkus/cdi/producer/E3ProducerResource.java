package be.rubus.training.quarkus.cdi.producer;

import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/log")
@ApplicationScoped
public class E3ProducerResource {

    private Logger logger;

    public E3ProducerResource(Logger logger) {
        this.logger = logger;
    }

    @POST
    public void handlePayload(String payload) {
        logger.info("Received {} as body of the request", payload);
    }
}
