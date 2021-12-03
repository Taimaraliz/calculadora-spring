package com.project.calculadora.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.calculadora.demo.mapper.CalculadoraMapper;

@Configuration
public class BeanConfig {
	
	    @Bean
	    public ModelMapper modelMapper() {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper;
	    }
	    
	    @Bean
	    public CalculadoraMapper calculadoraMapper() {
	        CalculadoraMapper calculadoraMapper = new CalculadoraMapper();
	        return calculadoraMapper;
	    }
}
