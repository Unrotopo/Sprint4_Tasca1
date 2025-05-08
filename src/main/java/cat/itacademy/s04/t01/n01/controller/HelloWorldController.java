package cat.itacademy.s04.t01.n01.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldController {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }

    @GetMapping("/HelloWorld")
    public String sayHello(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". You are running a Maven project";
    }

    @GetMapping("HelloWorld2")
    public String sayHello2(@PathVariable String name) {
        return "Hello, " + name + ". You are running a Maven project";
    }
}
