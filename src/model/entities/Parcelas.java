package model.entities;

import java.time.LocalDate;

public class Parcelas {
	private LocalDate dataFim;
	private Double montante;
	
	public Parcelas() {
	}

	public Parcelas(LocalDate dataFim, Double montante) {
		this.dataFim = dataFim;
		this.montante = montante;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public Double getMontante() {
		return montante;
	}

	public void setMontante(Double montante) {
		this.montante = montante;
	}
	
	@Override 
	public String toString() {
		return dataFim + " - " + String.format("%.2f",montante);
	}
	
	
}
