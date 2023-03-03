package be.rubus.training.quarkus.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/config-sources")
@ApplicationScoped
public class E1Resource {

    @Inject
    @ConfigProperty(name = "config.key", defaultValue = "From Code")
    String configValue;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getInjectedConfigValue() {
        return "Config value : " + configValue;
    }
}
