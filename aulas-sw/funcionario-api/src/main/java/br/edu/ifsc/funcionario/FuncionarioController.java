package br.edu.ifsc.funcionario;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {
	
	@RequestMapping(value = "/funcionario/{matricula}/{nome}/{salarioBase}/{numeroDependentes}")
	public Funcionario adicionarFuncionario( 
			@PathVariable("matricula") int matricula,
			@PathVariable("nome") String nome, 
			@PathVariable("salarioBase") double salarioBase, 
			@PathVariable("numeroDependentes") int numeroDependentes) {

		Funcionario funcionario = new Funcionario(matricula, nome, salarioBase, numeroDependentes);
		FuncionarioDataSource.novo(funcionario);
		return funcionario;
		
	}
	
	@RequestMapping(value = "/funcionarios")
	public List<Funcionario> getFuncionarios(){
		
		return FuncionarioDataSource.getListaFuncionarios();
		
	}
	
	@RequestMapping(value = "/pesquisar/{matricula}")
    public Funcionario pesquisarFuncionario(@PathVariable ("matricula") int matricula) {
		
		return FuncionarioDataSource.getFuncionarioMatricula(matricula);
	}
       
	
	@RequestMapping(value = "/Salario_liquido/{matricula}")
	public double calcularSalarioLiquido( 
			@PathVariable("matricula") int matricula) {
		
			Funcionario funcionario = FuncionarioDataSource.getFuncionarioMatricula(matricula);
		
			return funcionario.calcularSalarioLiquido();
		
	}
	 

}
