package com.yukselcoding.IoC.definingbeans.engine.factory;


import com.yukselcoding.IoC.definingbeans.engine.Engine;

class V6Engine implements Engine {
    private int cylinders = 6;

    @Override
    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String start() {
        return "Starts V6";
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
