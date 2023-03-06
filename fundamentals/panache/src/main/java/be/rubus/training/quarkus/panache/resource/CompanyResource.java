package be.rubus.training.quarkus.panache.resource;

import be.rubus.training.quarkus.panache.model.Company;
import be.rubus.training.quarkus.panache.repository.CompanyRepository;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/company")
@RequestScoped
public class CompanyResource {

    private final CompanyRepository companyRepository;

    public CompanyResource(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Company getCompany(@PathParam("id") Long id) {
        return companyRepository.findById(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Company> getAllCompany() {
        return companyRepository.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Company insertCompany(Company company) {
        companyRepository.persist(company);
        return company;
    }

}
