package br.edu.ifsc.calculoSalarioLiquido;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculoSalarioLiquidoController {
	
	@RequestMapping("/calcular_salario/{nome}/{salarioBase}/{numeroDependentes}")
	public Double calcular_salario(
			@PathVariable("nome") String nome, 
			@PathVariable("salarioBase") Double salarioBase,
			@PathVariable("numeroDependentes") int numeroDependentes ) {
		
		double irpf = 0.0;
		if( salarioBase >= 8500.00) {
			irpf = 0.275 * salarioBase;
		}  else if (salarioBase >= 5000.00) {
			irpf = 0.15 * salarioBase;
		}
		
		double salarioFamilia = 150.0 * numeroDependentes;
		
		double salarioLiquido = salarioBase - irpf + salarioFamilia;
		
		return  salarioLiquido;
		
	}
	
	

}
