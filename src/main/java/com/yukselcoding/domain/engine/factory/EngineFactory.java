package com.yukselcoding.domain.engine.factory;


import com.yukselcoding.domain.engine.Engine;
import com.yukselcoding.domain.engine.annotations.V6;
import io.micronaut.context.annotation.Factory;
import io.micronaut.core.annotation.Order;

import javax.inject.Singleton;

@Factory
public class EngineFactory {

    @Singleton
    @Order(1)
    V8Engine v8Engine() {
        return new V8Engine();
    }

    @Singleton
    @Order(2)
    V6Engine v6Engine() {
        return new V6Engine();
    }
}
