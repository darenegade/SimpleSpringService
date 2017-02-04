package com.tasks.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Entity
public class Department extends BaseEntity{
  String name;

  @OneToOne
  Employee head;

  @OneToMany
  Set<Employee> employees;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee getHead() {
    return head;
  }

  public void setHead(Employee head) {
    this.head = head;
  }

  public Set<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(Set<Employee> employees) {
    this.employees = employees;
  }
}
