package com.zoo;

import javax.persistence.Entity;

/**
 * Organization: HM FK07.
 * Project: Spring, com.zoo
 * Author(s): Rene Zarwel
 * Date: 07.11.16
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */
@Entity
public class Animal extends BaseEntity{

  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
