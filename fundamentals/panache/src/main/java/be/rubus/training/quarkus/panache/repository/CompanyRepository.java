package be.rubus.training.quarkus.panache.repository;

import be.rubus.training.quarkus.panache.model.Company;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class CompanyRepository implements PanacheRepository<Company> {
}
