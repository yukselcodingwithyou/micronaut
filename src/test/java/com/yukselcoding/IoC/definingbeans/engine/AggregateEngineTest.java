package com.yukselcoding.IoC.definingbeans.engine;

import com.yukselcoding.IoC.definingbeans.engine.factory.AggregateEngine;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class AggregateEngineTest {

    @Inject
    AggregateEngine aggregateEngine;

    @Test
    void should_Start_AggregateEngine() {
        final String started = aggregateEngine.start();
        assertEquals("Starts V8, Starts V6", started);
    }

    @Test
    void should_GetCylinders_AggregateEngine() {
        final int cylinders = aggregateEngine.getCylinders();
        assertEquals(14, cylinders);
    }
}