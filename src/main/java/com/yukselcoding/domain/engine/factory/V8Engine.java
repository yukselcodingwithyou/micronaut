package com.yukselcoding.domain.engine.factory;

import com.yukselcoding.domain.engine.Engine;


class V8Engine implements Engine {
    private int cylinders = 8;

    @Override
    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String start() {
        return "Starts V8";
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
