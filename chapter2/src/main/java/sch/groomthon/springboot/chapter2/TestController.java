package sch.groomthon.springboot.chapter2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  @GetMapping("/test")
  public String test() {
    return "Hello, World!";
  }
}
