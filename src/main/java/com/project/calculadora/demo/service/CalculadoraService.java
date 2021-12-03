package com.project.calculadora.demo.service;

import org.springframework.stereotype.Service;

import com.project.calculadora.demo.model.Calculadora;
import com.project.calculadora.demo.model.Resultado;

@Service
public class CalculadoraService {
	
	public Resultado soma(Calculadora calculadora) {
		
	int soma = calculadora.getVar1() + calculadora.getVar2();
	Resultado resultado = new Resultado(soma);
	return resultado;
	}
	
	public Resultado subtracao(Calculadora calculadora) {
		
	int subtrair = calculadora.getVar1() - calculadora.getVar2();
	Resultado resultado = new Resultado(subtrair);
	return resultado;
	}
	public Resultado multiplicacao(Calculadora calculadora) {
		
		int multiplicar = calculadora.getVar1() * calculadora.getVar2();
		Resultado resultado = new Resultado(multiplicar);
		return resultado;
	}
	
	public Resultado divisao(Calculadora calculadora) {
		
		int dividir = calculadora.getVar1() / calculadora.getVar2();
		Resultado resultado = new Resultado(dividir);
		return resultado;
	}
}