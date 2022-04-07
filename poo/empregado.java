package poo;

import java.text.NumberFormat;

public class empregado {
	private String nome;
	private double salario;
	
	public empregado(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public void Empregado(String n,double s)
	{
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual / 100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println("\nNome: "+nome+"\t\tSalário: "+this.formatarMoeda());

	}
}
