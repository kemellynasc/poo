package poo;

public class ExercicioObjeto1TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			
		
				
				ExercicioObjeto1ClasseCliente cliente1 = new ExercicioObjeto1ClasseCliente("Janderson", 554205512, 0420);
				
				cliente1.boasvindas();
				System.out.println("\nCPF do Cliente: "+cliente1.getCpfCliente());
				cliente1.setIdadeCliente(15);
				System.out.println("\nIdade do cliente: "+cliente1.getIdadeCliente());
				
				ExercicioObjeto1ClasseCliente cliente2 = new ExercicioObjeto1ClasseCliente("Luis Guerreiro", 82484848,0420);
				
				cliente2.boasvindas();
				System.out.println("\nCPF do Cliente: "+cliente2.getCpfCliente());
				cliente2.setIdadeCliente(19);
				System.out.println("\nIdade do cliente: "+cliente2.getIdadeCliente());
				
			}

	

}
