package br.edu.ifsc.flm.calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
	
/*	@RequestMapping("/somar/{valor1}/{valor2}")
	public Double somar(@PathVariable ("valor1") Double valor1, @PathVariable ("valor2")Double valor2 ) {
		
		Double resultado = valor1 + valor2;
		return resultado;
	}*/



	@RequestMapping("/somar")
	public Double somar(@RequestParam(value="valor1") Double valor1, @RequestParam(value="valor2") Double valor2 ) {
		
		Calculadora calc = new Calculadora();
		
		return calc.somar(valor1, valor2);
	}
	
	@RequestMapping("/multiplicar")
	public float multiplicar(@RequestParam(value="op1") float op1, @RequestParam(value="op2") float op2 ) {
		
		Calculadora calc = new Calculadora();
		
		return calc.multiplicar(op1, op2);
	}
	
	
	@RequestMapping("/subtrair")
	public float subtrair(@RequestParam(value="op1") float op1, @RequestParam(value="op2") float op2 ) {
		
		Calculadora calc = new Calculadora();
		
		return calc.subtrair(op1, op2);
	}
	
	
	@RequestMapping("/calcular")
	public float calcular(@RequestParam(value="op1") float op1, @RequestParam(value="op2") float op2,
			@RequestParam(value="operacao") float operacao) {
		
		Calculadora calc = new Calculadora();
		switch 
		
		return calc.subtrair(op1, op2);
	}

}
