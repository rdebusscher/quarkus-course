package be.rubus.training.quarkus.jaxrs.json;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jsonp")
public class E2JSONPResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getPerson() {
        return Json.createObjectBuilder()
                .add("name", "Jane Doe")
                .add("age", 31)
                .build();
    }


}
