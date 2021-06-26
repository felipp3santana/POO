package br.upis;

public class TesteHorario {
	
	public static void main(String[] args) {
				
		HorarioNG h = new HorarioNG(1,1,1);
		HorarioNG j = new HorarioNG(1,1,1);
		
		if(h.ehMenor(j)) {
			System.out.println("\n==========\n" + h + " é menor que " + j);
			
			System.out.println("MENOR" + "\n==========\n");}
		else {	
			System.out.println("\n==========\n" + h + " é maior ou igual a " + j);
		
			System.out.println("MAIOR OU IGUAL " + "\n==========\n");}
		
		
		/*if(h.ehMaior(j)){
			System.out.println("\n==========\n" + h + " é maior que " + j);
			
			System.out.println("MAIOR" + "\n==========\n");
		}
		else {
			System.out.println("\n==========\n" + h + " é menor ou igual a " + j);
		
			System.out.println("MENOR OU IGUAL" + "\n==========\n");}*/	
		
		if(h.equals(j)) { 
			System.out.println("\n==========\n" + h + " é igual a " + j);
			
			System.out.println("IGUAIS" + "\n==========\n");
		}else {
			System.out.println("\n==========\n" + h + " é diferente de " + j);
			
			System.out.println("DIFERENTES" + "\n==========\n");
		}

		int i = 0;
		while(i < 2) {
			
			h.incrementaSegundo();
			System.out.println(h);
			System.out.println(h.hashCode());
			i++;
		}
		
	}
}
