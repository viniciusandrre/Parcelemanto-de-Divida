package model.services;

public class ServicoDoPaypayl implements ServicoDePagamentoOnline {

	@Override
	public double pagamentoDaTaxa(double montante) {
		return montante * 0.02;
	}

	@Override
	public double juros(double montante, int meses) {
		return montante * 0.01 * meses;
	}

}
