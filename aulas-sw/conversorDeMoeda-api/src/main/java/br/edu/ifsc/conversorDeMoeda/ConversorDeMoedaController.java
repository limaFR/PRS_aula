package br.edu.ifsc.conversorDeMoeda;



import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorDeMoedaController {
	
	
	@RequestMapping(value = "/converter_moeda/{quantia}/{tipo}/{tipoDeOperacao}")
	public double conversorDeMoeda(
			@PathVariable("quantia") double quantia, 
			@PathVariable("tipo") String tipo, 
			@PathVariable("tipoDeOperacao") String tipoDeOperacao) {
		ConversorDeMoedaDataSource dataSource = new ConversorDeMoedaDataSource();
		return dataSource.conversorDeMoeda(quantia, tipo, tipoDeOperacao);
	}
	
	@RequestMapping(value = "/cotacao_moeda")
	public List<MoedaDTO> getMoedasDTO(){
		return ConversorDeMoedaDataSource.getListaMoedasDTO();
	}
	
	@RequestMapping(value = "/converter_moeda_dto/{quantia}/{tipoDeOperacao}")
	public ConversorDeMoedaDTO conversorDeMoedaDTO(
			@PathVariable("quantia") double quantia,
			@PathVariable("tipoDeOperacao") String tipoDeOperacao) {

		double valor = quantia;
		String operacao = tipoDeOperacao;
		ConversorDeMoedaDataSource dataSource = new ConversorDeMoedaDataSource();
		double DC = dataSource.conversorDeMoeda(quantia, "DC", tipoDeOperacao);
		double DP = dataSource.conversorDeMoeda(quantia, "DP", tipoDeOperacao);;
		double DX = dataSource.conversorDeMoeda(quantia, "DX", tipoDeOperacao);
		double DT = dataSource.conversorDeMoeda(quantia, "DT", tipoDeOperacao);;
		double EU = dataSource.conversorDeMoeda(quantia, "EU", tipoDeOperacao);
		double OU = dataSource.conversorDeMoeda(quantia, "OU", tipoDeOperacao);
		return new ConversorDeMoedaDTO(valor, operacao, DC,DP, DX, DT,EU, OU);
	}
	

}
