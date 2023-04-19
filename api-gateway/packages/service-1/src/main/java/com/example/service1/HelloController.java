package com.example.service1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/first-service")
public class HelloController {

  @GetMapping("/")
  public String greeting() {
    return "Hello World!";
  }
}
