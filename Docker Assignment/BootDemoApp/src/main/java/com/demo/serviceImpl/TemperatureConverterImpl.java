package com.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.service.TemperatureConverter;

@Service
public class TemperatureConverterImpl implements TemperatureConverter {
	

	@Override
	public double celsiusToFahrenheit(double celsius) {
		// TODO Auto-generated method stub
		return (celsius * 9/5) + 32;
	}

	@Override
	public double fahrenheitToCelsius(double fahrenheit) {
		// TODO Auto-generated method stub
		return (fahrenheit - 32) * 5/9;
	}
	

}
