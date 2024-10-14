package org.factoriaf5.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hola coders de la promo P4 - Gijón!";
    }

    @GetMapping(path = "/adios")
    public String goodbyeWorld() {
        return "adios!!";
    }

}
