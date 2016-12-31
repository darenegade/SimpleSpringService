package com.zoo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * Organization: HM FK07.
 * Project: Spring, com.zoo
 * Author(s): Rene Zarwel
 * Date: 07.11.16
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */
@RepositoryRestResource
public interface AnimalRepository extends CrudRepository<Animal, UUID> {
}
