package com.example.service2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/second-service")
public class HelloController {

  @GetMapping("/")
  public String greeting() {
    return "Hello World!";
  }
}
