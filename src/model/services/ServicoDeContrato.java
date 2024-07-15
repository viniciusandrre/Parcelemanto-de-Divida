package model.services;

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
	
	
	
}
