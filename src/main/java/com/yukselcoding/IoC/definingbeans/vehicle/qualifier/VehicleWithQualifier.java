package com.yukselcoding.IoC.definingbeans.vehicle.qualifier;


import com.yukselcoding.IoC.definingbeans.engine.annotations.V8;
import com.yukselcoding.IoC.definingbeans.engine.Engine;

import javax.inject.Singleton;

@Singleton
public class VehicleWithQualifier {

    private final Engine engine;

    public VehicleWithQualifier(@V8 Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }
}
