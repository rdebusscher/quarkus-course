package be.rubus.training.quarkus.panache.resource;


import be.rubus.training.quarkus.panache.model.Employee;
import be.rubus.training.quarkus.panache.repository.EmployeeRepository;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/employee")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    private final EmployeeRepository employeeRepository;

    public EmployeeResource(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GET
    public List<Employee> getAllEmployees() {
        return employeeRepository.listAll();
    }

    @Path("/{employeeId}")
    @GET
    public Response getEmployee(@PathParam("employeeId") Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId);
        if (employee == null) {
            // Employee with Id not found so the URL doesn't exist.
            return Response.status(Response.Status.NOT_FOUND).build();
        } else {
            return Response.ok(employee).build();
        }
    }

    @Path("/{employeeId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    @Transactional
    public void updateEmployee(@PathParam("employeeId") Long employeeId, Employee newEmployee) {
        // FIXME, We have no checking if employee and company exist or not!!
        Employee employee = employeeRepository.findById(employeeId);

        employee.setFirstName(newEmployee.getFirstName());
        employee.setLastName(newEmployee.getLastName());
        employee.setGender(newEmployee.getGender());
        employee.setHireDate(newEmployee.getHireDate());
        employeeRepository.persist(employee);
    }

    @Path("/company/{companyId}")
    @GET
    public List<Employee> getEmployeesOfCompany(@PathParam("companyId") Long companyId) {
        return employeeRepository.list("company.id", companyId);
    }

}
