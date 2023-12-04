package br.edu.ifsc.conversorDeMoeda;

import java.util.ArrayList;
import java.util.List;

public class ConversorDeMoedaDataSource {
	
	private static List<Moeda> ListaMoedas = new ArrayList<>();
	
	public static void criarLista() {
		
		ListaMoedas.add(new Moeda("DC", 5.6061, 5.6066));
		ListaMoedas.add(new Moeda("DP", 5.69, 5.79));
		ListaMoedas.add(new Moeda("DX", 5.6058, 5.6064));
		ListaMoedas.add(new Moeda("DT", 5.5430, 5.7530));
		ListaMoedas.add(new Moeda("EU", 6.5630, 6.8070));
		ListaMoedas.add(new Moeda("OU", 346.70, 353.22));	
	}
	
	public static List<Moeda> getListaMoedas(){
		return ListaMoedas;
	}
	
	public double conversorDeMoeda(double quantia, String tipo, String tipoDeOperacao) {
		Moeda moeda = pesquisarMoedaPorTipo(tipo);
		if (moeda != null) {
			 if ("compra".equalsIgnoreCase(tipoDeOperacao)) {
				 return quantia * moeda.getTaxaDeCompra();
			 }else if ("venda".equalsIgnoreCase(tipoDeOperacao)) {
				 return quantia / moeda.getTaxaDeVenda();
			 }
			 else {
				 return 0.0;
			 }
		} else {
			return 0.0;
		}
		
	}
	
	private Moeda pesquisarMoedaPorTipo(String tipo) {
		for (Moeda moeda : ListaMoedas) {
			if (moeda.getTipo().equalsIgnoreCase(tipo)) {
				return moeda;
			}
		}return null;
	}
	
	public static List<MoedaDTO> getListaMoedasDTO(){
		List<MoedaDTO> moedasDTO =new ArrayList<>();
		for(Moeda m : ListaMoedas) {
			MoedaDTO mDTO = new MoedaDTO(m.getTipo(), m.getTaxaDeCompra(), m.getTaxaDeVenda());
			moedasDTO.add(mDTO);
		}
		return moedasDTO;
	}
	
	

}
