package com.yukselcoding.domain.vehicle;


import com.yukselcoding.domain.engine.Engine;
import com.yukselcoding.domain.engine.annotations.V8;

import javax.inject.Singleton;

@Singleton
public class Vehicle {

    private final Engine engine;

    public Vehicle(@V8 Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }
}
