package com.yukselcoding.IoC.definingbeans.vehicle.injectionpoint;

import com.yukselcoding.IoC.definingbeans.engine.Engine;
import com.yukselcoding.IoC.definingbeans.engine.annotations.Cylinders;

import javax.inject.Singleton;

@Singleton
public class VehicleWithInjectionPoint {

    private final Engine engine;

    public VehicleWithInjectionPoint(@Cylinders(6) Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }
}
