package com.tasks.repositories;

import com.tasks.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * Organization: HM FK07.
 * Project: SimpleSpringService, com.tasks.repositories
 * Author(s): Rene Zarwel
 * Date: 04.02.17
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */
@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, UUID>{
}
