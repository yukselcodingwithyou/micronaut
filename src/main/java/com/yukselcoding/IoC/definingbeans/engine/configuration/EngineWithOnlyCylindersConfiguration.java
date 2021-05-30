package com.yukselcoding.IoC.definingbeans.engine.configuration;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.core.util.Toggleable;

import javax.validation.constraints.NotNull;

@EachProperty("enginesWithOnlyCylinders")
public class EngineWithOnlyCylindersConfiguration implements Toggleable {

    private boolean enabled = true;
    private int cylinders;

    @NotNull
    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
