package com.tasks.model;

import javax.persistence.Entity;

/**
 * Organization: HM FK07.
 * Project: SimpleSpringService, com.tasks.model
 * Author(s): Rene Zarwel
 * Date: 04.02.17
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */
@Entity
public class Employee extends BaseEntity {

  String Name;

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }
}
