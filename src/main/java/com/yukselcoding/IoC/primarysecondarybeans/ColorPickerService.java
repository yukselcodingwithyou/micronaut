package com.yukselcoding.IoC.primarysecondarybeans;

import javax.inject.Singleton;

@Singleton
public class ColorPickerService implements ColorPicker {

    private final ColorPicker colorPicker;

    public ColorPickerService(ColorPicker colorPicker) {
        this.colorPicker = colorPicker;
    }

    @Override
    public String color() {
        return colorPicker.color();
    }
}
