package com.yukselcoding.IoC.primarysecondarybeans;

import io.micronaut.context.annotation.Primary;

import javax.inject.Singleton;

@Primary
@Singleton
public class Blue implements ColorPicker {
    @Override
    public String color() {
        return "Blue";
    }
}
