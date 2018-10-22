package com.example.springboot.jerseyandjpa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class Hello {

  @GET
  public String sayPlainTextHello() {
    return "Hello Jersey";
  }

 
}