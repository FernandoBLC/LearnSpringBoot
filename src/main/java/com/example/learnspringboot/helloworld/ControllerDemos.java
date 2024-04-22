package com.example.learnspringboot.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemos {
    @RequestMapping("/test/getsentence")
        public String home() {
            return "Hola MUNDO";
        }

        @RequestMapping("/test")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("");
        }

        @PostMapping("/test/names/{name}")
    public HelloWorldBean helloWorldWithNames(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world to %s", name));
        }
}
