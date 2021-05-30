package com.yukselcoding.IoC.definingbeans.engine.configuration;


import io.micronaut.context.annotation.EachBean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.exceptions.DisabledBeanException;

@Factory
public class EngineWithOnlyCylindersFactory {

    @EachBean(EngineWithOnlyCylindersConfiguration.class)
    public EngineWithOnlyCylinders buildEngineWithOnlyCylinders(EngineWithOnlyCylindersConfiguration engineWithOnlyCylindersConfiguration) {
        if(engineWithOnlyCylindersConfiguration.isEnabled()) {
            return engineWithOnlyCylindersConfiguration::getCylinders;
        } else {
            throw new DisabledBeanException("Engine With Only Cylinders configuration Disabled.");
        }
    }
}
