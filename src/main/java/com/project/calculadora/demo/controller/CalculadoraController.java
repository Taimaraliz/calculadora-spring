package com.project.calculadora.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.calculadora.demo.mapper.CalculadoraMapper;
import com.project.calculadora.demo.model.CalculadoraDto;
import com.project.calculadora.demo.model.ResultadoDto;
import com.project.calculadora.demo.service.CalculadoraService;

@RestController
@RequestMapping
public class CalculadoraController {
	
	@Autowired(required=true)
	ModelMapper modelMapper;

	@Autowired
	CalculadoraService calculadoraService;
	
	@Autowired
	CalculadoraMapper calculadoraMapper;

	@PostMapping("/soma")
	public ResultadoDto somar(@RequestBody CalculadoraDto calculadoraDto) {
		
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.soma(calculadoraMapper.mapperCalculadora(calculadoraDto)), ResultadoDto.class);		
		
		return resultadoDto;
	}
	
	@PostMapping("/subtracao")
	public ResultadoDto subtrair(@RequestBody CalculadoraDto calculadoraDto) {
		
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.subtracao(calculadoraMapper.mapperCalculadora(calculadoraDto)), ResultadoDto.class);		
		
		return resultadoDto;
	}
	
	@PostMapping("/multiplicacao")
	public ResultadoDto multiplicar(@RequestBody CalculadoraDto calculadoraDto) {
		
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.multiplicacao(calculadoraMapper.mapperCalculadora(calculadoraDto)), ResultadoDto.class);		
		
		return resultadoDto;
	}
	
	@PostMapping("/divisao")
	public ResultadoDto dividir(@RequestBody CalculadoraDto calculadoraDto) {
		
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.divisao(calculadoraMapper.mapperCalculadora(calculadoraDto)), ResultadoDto.class);		
		
		return resultadoDto;
	}
	
	

}
