package com.yukselcoding.IoC.definingbeans.engine.factory;

import com.yukselcoding.IoC.definingbeans.engine.Engine;


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
