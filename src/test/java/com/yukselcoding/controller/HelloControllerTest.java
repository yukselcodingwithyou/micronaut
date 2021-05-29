package com.yukselcoding.controller;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;


@MicronautTest
class HelloControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client("/hello")
    HttpClient client;

    @Test
    void should_Return_HelloWorld() {
        final String response = client.toBlocking().retrieve("/world");
        assertEquals("Hello, world.", response);
    }
}