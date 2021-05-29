package com.yukselcoding.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    @Get(uri = "/world", produces = MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello, world.";
    }
}
