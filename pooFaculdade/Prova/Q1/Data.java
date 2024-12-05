package Q1;

import java.time.LocalDate;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data() {
		LocalDate hoje = LocalDate.now();
		this.dia = hoje.getDayOfMonth();
		this.mes = hoje.getMonthValue();
		this.ano = hoje.getYear();

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		return "Data = " + this.dia + "/" + this.mes + "/" + this.ano;
	}

	public void avancaDias(int dias) {
		LocalDate dataAtual = LocalDate.of(ano, mes, dia);
		LocalDate novaData = dataAtual.plusDays(dias);
		this.dia = novaData.getDayOfMonth();
		this.mes = novaData.getMonthValue();
		this.ano = novaData.getYear();
	}

	public void retrocedeDias(int dias) {
		LocalDate dataAtual = LocalDate.of(ano, mes, dia);
		LocalDate novaData = dataAtual.minusDays(dias);
		this.dia = novaData.getDayOfMonth();
		this.mes = novaData.getMonthValue();
		this.ano = novaData.getYear();
	}

}
