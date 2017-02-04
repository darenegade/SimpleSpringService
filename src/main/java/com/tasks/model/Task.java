package com.tasks.model;

import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Organization: HM FK07.
 * Project: SimpleSpringService, com.tasks.model
 * Author(s): Rene Zarwel
 * Date: 04.02.17
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */
public class Task extends BaseEntity{
  String description;

  @OneToMany
  Set<Employee> Responsible;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
