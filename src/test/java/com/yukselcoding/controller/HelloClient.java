package com.yukselcoding.controller;


import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client("/hello")
public interface HelloClient {
    @Get(uri = "/world", consumes = MediaType.TEXT_PLAIN)
    Single<String> helloWorld();
}
