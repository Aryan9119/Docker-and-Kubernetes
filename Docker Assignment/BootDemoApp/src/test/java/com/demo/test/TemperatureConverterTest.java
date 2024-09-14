package com.demo.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.demo.service.TemperatureConverter;
import com.demo.serviceImpl.TemperatureConverterImpl;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
public class TemperatureConverterTest {

    @Mock
    private TemperatureConverter temperatureConverter;

    @InjectMocks
    private TemperatureConverterImpl temperatureConverterImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, temperatureConverterImpl.celsiusToFahrenheit(0));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, temperatureConverterImpl.fahrenheitToCelsius(32));
    }
}
