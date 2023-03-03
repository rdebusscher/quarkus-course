package be.rubus.training.quarkus.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/converted")
@ApplicationScoped
public class E2Resource {

    @Inject
    @ConfigProperty(name = "age.minimal")
    int minimumAge;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getConverterExample() {
        return "Specified minimum age : " + minimumAge;
    }

}
