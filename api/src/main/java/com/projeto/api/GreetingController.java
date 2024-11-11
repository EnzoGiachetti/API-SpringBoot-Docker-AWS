package com.projeto.api;


import org.springframework.web.bind.annotation.*;


import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Olá, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "Mundo")
            String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    };

}
