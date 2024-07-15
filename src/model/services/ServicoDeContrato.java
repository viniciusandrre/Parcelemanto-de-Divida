package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcelas;

public class ServicoDeContrato {
	private ServicoDePagamentoOnline servicoDePagamentoOnline;

	public ServicoDeContrato(ServicoDePagamentoOnline servicoDePagamentoOnline) {
		this.servicoDePagamentoOnline = servicoDePagamentoOnline;
	}

	public ServicoDePagamentoOnline getServicoDePagamentoOnline() {
		return servicoDePagamentoOnline;
	}

	public void setServicoDePagamentoOnline(ServicoDePagamentoOnline servicoDePagamentoOnline) {
		this.servicoDePagamentoOnline = servicoDePagamentoOnline;
	}
	
	public void processamentoDeDeContrato(Contrato contrato,int meses) {
		double pagamentoBasico = contrato.getValorTotal()/meses;
				
		for(int i=1; i<=meses; i++) {
			LocalDate dataFim = contrato.getDataInicio().plusMonths(i);
			
			double taxas = servicoDePagamentoOnline.juros(pagamentoBasico, i);
			double valorComTaxa = servicoDePagamentoOnline.pagamentoDaTaxa(pagamentoBasico + taxas);
			double valorTotalComTaxas = pagamentoBasico + taxas + valorComTaxa;
			
			contrato.getParcelas().add(new Parcelas(dataFim, valorTotalComTaxas));
		}
	}
	
	
	
}
