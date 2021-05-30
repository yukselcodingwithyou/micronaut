package com.yukselcoding.IoC.definingbeans.engine.factory;

import com.yukselcoding.IoC.definingbeans.engine.Engine;

import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;


@Singleton
public class AggregateEngine implements Engine {

    private final List<Engine> engines;

    public AggregateEngine(List<Engine> engines) {
        this.engines = engines;
    }

    @Override
    public int getCylinders() {
        return engines.stream().map(Engine::getCylinders).mapToInt(Integer::intValue).sum();
    }

    @Override
    public String start() {
        return engines.stream().map(Engine::start).collect(Collectors.joining(", "));
    }
}
