package be.rubus.training.quarkus.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/config")
@ApplicationScoped
public class E0Resource {

    @Inject
    @ConfigProperty(name = "injected.value", defaultValue = "Default")
    String injectedValue;

    @Path("/injected")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getInjectedConfigValue() {
        return "Config value as Injected by Quarkus : " + injectedValue;
    }

}
