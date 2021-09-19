package de.beking.spring.tutorial.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingResource {

  @GetMapping("/greeting/default")
  public String defaultGreeting() {
    return "Hello World";
  }

  @GetMapping("/greeting/personal/{name}")
  public String defaultGreeting(@PathVariable String name) {
    return "Hello " + name;
  }
}
