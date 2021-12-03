package com.project.calculadora.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Builder  
@NoArgsConstructor  
@AllArgsConstructor 
public class CalculadoraDto {
	
	@JsonProperty(value = "primeiro-valor")
	private int var1;
	
	@JsonProperty(value = "segundo-valor")
	private int var2;
	
	
	public int getVar1() {
		return var1;
	}
	
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	
	public int getVar2() {
		return var2;
	}
	
	public void setVar2(int var2) {
		this.var2 = var2;
	}
	
}
