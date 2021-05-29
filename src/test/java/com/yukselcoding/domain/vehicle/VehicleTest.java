package com.yukselcoding.domain.vehicle;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class VehicleTest {

    @Inject
    Vehicle vehicle;

    @Test
    void should_Start_V8Engine() {
        final String startedV8 = vehicle.start();
        assertEquals("Starts V8", startedV8);
    }
}