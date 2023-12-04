package br.edu.ifsc.salario;

public class Salario {
	
	private double salarioBruto;
	
	

	public Salario(double salarioBruto) {
		super();
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double calcularIRPF() {
		double irpf = 0.0;
		if( salarioBruto > 4664.68) {
			irpf = (0.275 * salarioBruto) - 869.36;
		}
		else if( salarioBruto >= 3751.06) {
			irpf = (0.225 * salarioBruto) - 636.136;
		}
		else if( salarioBruto >= 2826.66) {
			irpf = (0.15 * salarioBruto) - 354.80;
		}
		else if( salarioBruto >= 1903.99) {
			irpf = (0.15 * salarioBruto) - 142.80;
		}
		
		return  irpf;	
	}
	
	
	public double calcularINSS() {
		
		double inss = 0.075 * salarioBruto;
		if( salarioBruto >= 3134.41) {
			inss = 0.14 * salarioBruto;
		}
		else if( salarioBruto >= 2089.61) {
			inss = 0.12 * salarioBruto;
		}
		else if( salarioBruto >= 1045.01) {
			inss = 0.09 * salarioBruto;
		}
		return inss;
	}
	
	public double calcularSalarioLiquido() {
		double irpf = calcularIRPF();
		double inss = calcularINSS();
		double salarioLiquido = salarioBruto - irpf - inss;
		return  salarioLiquido;
	}

}
