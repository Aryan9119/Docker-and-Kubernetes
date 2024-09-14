package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.TemperatureConverter;

@RestController
public class TemperatureController {
	
	@Autowired
    private TemperatureConverter temperatureConverter;
	
	@GetMapping("/")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello, welcome to the TemperatureConversion Converter API!");
    }

	@GetMapping("/celsiusToFahrenheit")
    public ResponseEntity<Double> celsiusToFahrenheit(@RequestParam double celsius) {
		
        double fahrenheit = temperatureConverter.celsiusToFahrenheit(celsius);
        return ResponseEntity.ok(fahrenheit);
    }

    @GetMapping("/fahrenheitToCelsius")
    public ResponseEntity<Double> fahrenheitToCelsius(@RequestParam double fahrenheit) {
        double celsius = temperatureConverter.fahrenheitToCelsius(fahrenheit);
        return ResponseEntity.ok(celsius);
    }
}
