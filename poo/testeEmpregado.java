package poo;

public class testeEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		empregado[] lista = new empregado[3];
		
		lista[0] = new empregado("Beatriz Alves",5000);
		lista[1] = new empregado("Lucas Sena",20000);
		lista[2] = new empregado("Jose Santos",13000);
		
		for(empregado roda:lista)
		{
			roda.imprimir();
		}
		
		System.out.println("\n**********************************************");
		
		for(empregado roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

	}


