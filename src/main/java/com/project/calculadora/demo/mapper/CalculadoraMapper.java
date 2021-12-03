package com.project.calculadora.demo.mapper;

import com.project.calculadora.demo.model.Calculadora;
import com.project.calculadora.demo.model.CalculadoraDto;

public class CalculadoraMapper {
	public static Calculadora mapperCalculadora(CalculadoraDto calculadoraDto) {
		Calculadora calculadora = new Calculadora(calculadoraDto);
		
		return calculadora;
	}

}
