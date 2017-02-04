package com.tasks.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Organization: HM FK07.
 * Project: SimpleSpringService, com.tasks.controller
 * Author(s): Rene Zarwel
 * Date: 04.02.17
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */
@RestController
public class EndpointController {

  @PostMapping("/hello_service")
  public String helloService(@RequestBody Name name){
    return "Hello " + name.getName();
  }

}
