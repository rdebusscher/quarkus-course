package be.rubus.training.quarkus.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/cdi")
@ApplicationScoped  // Only 1 instance, optimal memory pressure (when not 'injecting' URL parameters in fields)
public class E0IntegrationResource {

    private MyService myService;

    @Inject
    public E0IntegrationResource(MyService myService) {
        this.myService = myService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String doGreeting(@PathParam("name") String someValue, @QueryParam("language") String language) {
        return myService.getGreeting(someValue, language);
    }
}
