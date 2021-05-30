package com.yukselcoding.IoC.definingbeans.vehicle.injectionpoint;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class VehicleWithInjectionPointTest {

    @Inject
    VehicleWithInjectionPoint vehicleWithInjectionPoint;

    @Test
    void should_Start_V6Engine() {
        final String startedV6 = vehicleWithInjectionPoint.start();
        assertEquals("Starts V6", startedV6);
    }
}