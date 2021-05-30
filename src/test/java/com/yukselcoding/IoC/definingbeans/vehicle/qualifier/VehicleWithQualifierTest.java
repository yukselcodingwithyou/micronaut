package com.yukselcoding.IoC.definingbeans.vehicle.qualifier;

import com.yukselcoding.IoC.definingbeans.vehicle.qualifier.VehicleWithQualifier;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class VehicleWithQualifierTest {

    @Inject
    VehicleWithQualifier vehicleWithQualifier;

    @Test
    void should_Start_V8Engine() {
        final String startedV8 = vehicleWithQualifier.start();
        assertEquals("Starts V8", startedV8);
    }
}