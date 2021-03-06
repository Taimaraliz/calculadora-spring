package com.project.calculadora.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Builder  
@NoArgsConstructor  
@AllArgsConstructor 
public class Calculadora {
		private int var1;
		private int var2;
		
		public Calculadora(CalculadoraDto calculadoraDto) {
			this.var1 = calculadoraDto.getVar1();
			this.var2 = calculadoraDto.getVar2();
			
		}
		
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
