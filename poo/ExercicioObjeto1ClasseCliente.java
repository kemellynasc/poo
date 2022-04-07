package poo;

public class ExercicioObjeto1ClasseCliente {

	private String nomeCliente;
	private int idadeCliente;
	private int cpfCliente;
	private int idRegistro;
 
 
 
 
	public ExercicioObjeto1ClasseCliente(String nomeCliente, int cpfCliente, int idRegistro) {
		
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.idRegistro = idRegistro;
	}
	
	public int getIdadeCliente() {
		
		if(this.idadeCliente <= 16) {
			System.out.println("\nCliente menor de idade");
			return idadeCliente;
		}else if(this.idadeCliente >= 18){
			System.out.println("\nCliente maior de idade");
			return idadeCliente;
		}
		
		return idadeCliente;
	}
 
 
	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}
 
 
	public String getNomeCliente() {
		return nomeCliente;
	}
 
 
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
 
 
	public int getCpfCliente() {
		return cpfCliente;
	}
 
 
	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
 
 
	public int getIdRegistro() {
		return idRegistro;
	}
 
 
	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
	}
	
	public void boasvindas() {
		System.out.println("\n____________________________________");
		System.out.println("\nOlá!");
		System.out.println("\nBem vinde, cliente:  "+nomeCliente);
		System.out.println("ID de Registro: "+idRegistro);
		
	}
	
}
