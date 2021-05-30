package com.yukselcoding.IoC.definingbeans.engine.factory;


import com.yukselcoding.IoC.definingbeans.engine.Engine;
import com.yukselcoding.IoC.definingbeans.engine.annotations.Cylinders;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Prototype;
import io.micronaut.core.annotation.Order;
import io.micronaut.inject.InjectionPoint;

import javax.inject.Singleton;

@Factory
public class EngineFactory {

    @Prototype
    Engine enginePrototype(InjectionPoint<?> injectionPoint) {
        final int cylinders = injectionPoint
                .getAnnotationMetadata()
                .intValue(Cylinders.class).orElse(8);
        switch (cylinders) {
            case 6:
                return new V6Engine();
            case 8:
                return new V8Engine();
            default:
                throw new IllegalArgumentException("Unsupported number of cylinders specified: " + cylinders);
        }
    }

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
