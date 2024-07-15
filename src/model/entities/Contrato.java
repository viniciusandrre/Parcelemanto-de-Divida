package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private Integer numero;
	private LocalDate dataInicio;
	private Double valorTotal;
	
	private List<Parcelas> parcelas = new ArrayList<>();
	
	public Contrato() {
	}

	public Contrato(Integer numero, LocalDate dataInicio, Double valorTotal) {
		this.numero = numero;
		this.dataInicio = dataInicio;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcelas> parcelas) {
		this.parcelas = parcelas;
	}
	
	
	
}	
