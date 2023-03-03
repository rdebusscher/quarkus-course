package be.rubus.training.quarkus.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/complex")
@ApplicationScoped
public class E3Resource {

    @Inject
    @ConfigProperty(name = "complex-value")
    String value;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getInjectedConfigValue() {
        return "Result of resolved value :  " + value;
    }

}
