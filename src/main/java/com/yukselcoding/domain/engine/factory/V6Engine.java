package com.yukselcoding.domain.engine.factory;


import com.yukselcoding.domain.engine.Engine;

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
