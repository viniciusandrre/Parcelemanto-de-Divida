package model.services;

public interface ServicoDePagamentoOnline {
	public double pagamentoDaTaxa(double montante);
	public double juros(double montante, int meses);
	
}
