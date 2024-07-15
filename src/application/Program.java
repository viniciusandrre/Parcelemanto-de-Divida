package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcelas;
import model.services.ServicoDeContrato;
import model.services.ServicoDoPaypayl;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Contrato:");
		System.out.print("Numero do Contrato: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate dataInicio = LocalDate.parse(sc.nextLine(),dtf);
		System.out.print("Valor do Contrato: ");
		double valorTotal = sc.nextDouble();
		
		Contrato con = new Contrato(numero, dataInicio, valorTotal);
		
		System.out.print("Entre com o Numero de Parcelas: ");
		int p = sc.nextInt();
		
		ServicoDeContrato servicoDeContrato = new ServicoDeContrato(new ServicoDoPaypayl());
		
		servicoDeContrato.processamentoDeDeContrato(con, p);
		
		
		System.out.println("Parcelas:");
		
		for(Parcelas parcelas: con.getParcelas()) {
			System.out.println(parcelas);
		}

	}

}
