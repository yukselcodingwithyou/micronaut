package com.yukselcoding.controller;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;


@MicronautTest
class HelloControllerTest {

    @Inject
    HelloClient client;

    @Test
    void should_Return_HelloWorld() {
        final String response = client.helloWorld().blockingGet();
        assertEquals("Hello, world.", response);
    }
}