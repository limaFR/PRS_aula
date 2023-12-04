package br.edu.ifsc.funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {
	
	private static List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	public static void criarLista() {
		
		listaFuncionarios.add(new Funcionario(10, "Francisco", 5000.0, 0));
		listaFuncionarios.add(new Funcionario(11, "Antonio", 10000.0, 5));
		listaFuncionarios.add(new Funcionario(12, "Maria", 8000.0, 4));
		listaFuncionarios.add(new Funcionario(13, "Paquete", 6000.0, 5));
		listaFuncionarios.add(new Funcionario(14, "Manuel", 12000.0, 7));
		
	}
	
	public static List<Funcionario> getListaFuncionarios(){
		return listaFuncionarios;
	}
	
	public static void novo(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
	}
	
	public static Funcionario getFuncionarioMatricula(int matricula) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getMatricula() == matricula) {
                return funcionario;
            }
        }
        return null;
    }


}
