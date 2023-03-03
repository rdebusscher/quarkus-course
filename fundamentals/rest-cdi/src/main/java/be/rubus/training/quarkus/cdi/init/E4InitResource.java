package be.rubus.training.quarkus.cdi.init;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/init")
@ApplicationScoped
public class E4InitResource {

    private InitService initService;

    public E4InitResource(InitService initService) {
        this.initService = initService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getInitMoment() {
        return initService.getInitMoment().toString();
    }
}
