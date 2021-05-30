package com.yukselcoding.IoC.primarysecondarybeans;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class ColorPickerServiceTest {

    @Inject
    private ColorPickerService colorPickerService;

    @Test
    void should_Return_Blue_Since_PrimaryAnnotation() {
        final String result = colorPickerService.color();
        assertEquals("Blue", result);
    }

}