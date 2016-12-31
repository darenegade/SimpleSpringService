package com.zoo;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
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
@MappedSuperclass
public abstract class BaseEntity implements Cloneable, Serializable {

  @Column(name = "OID")
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Type(type = "uuid-char")
  UUID oid;

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public UUID getOid() {
    return oid;
  }

  public void setOid(UUID oid) {
    this.oid = oid;
  }
}
