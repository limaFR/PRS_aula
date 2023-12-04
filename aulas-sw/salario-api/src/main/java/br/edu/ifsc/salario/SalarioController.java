package br.edu.ifsc.salario;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalarioController {
	

	
	@RequestMapping(value = "/salario_liquido/{salarioBruto}")
		public double calcularSalarioLiquido( @PathVariable("salarioBruto") double salarioBruto){
		Salario salario = new Salario(salarioBruto);
		
		return salario.calcularSalarioLiquido();
	
	}
	
	@RequestMapping(value = "/salario_liquido_dto/{salarioBruto}")
	public SalarioDTO calcularSalarioLiquidoDTO(@PathVariable("salarioBruto") double salarioBruto) {
		Salario salario = new Salario(salarioBruto);
		double irpf = salario.calcularIRPF();
		double inss = salario.calcularINSS();
		double salarioLiquido = salario.calcularSalarioLiquido();
		return new SalarioDTO(salarioBruto, irpf, inss, salarioLiquido);
	}

}
