package br.upis;

public class TesteData {
	public static void main(String[] args) {
		
		Data dt = new Data(2,1,1);
		Data dtsecond = new Data();
		
		if(dt.ehMenor(dtsecond)) {
			System.out.println("\n==========\n" + dt + " � menor que " + dtsecond);
		
			System.out.println("MENOR" + "\n==========\n");}
		else {	
			System.out.println("\n==========\n" + dt + " � maior ou igual a " + dtsecond);
	
			System.out.println("MAIOR OU IGUAL " + "\n==========\n");}
		
		/*if(dt.ehMaior(dtsecond)) {
			System.out.println("\n==========\n" + dt + " � maior que " + dtsecond);
		
			System.out.println("MAIOR" + "\n==========\n");}
		else {	
			System.out.println("\n==========\n" + dt + " � menor ou igual a " + dtsecond);
	
			System.out.println("MENOR OU IGUAL " + "\n==========\n");}*/
		
		
		
		if(dt.equals(dtsecond)) { 
			System.out.println("\n==========\n" + dt + " � igual a " + dtsecond);
		
			System.out.println("IGUAIS" + "\n==========\n");
		}else {
			System.out.println("\n==========\n" + dt + " � diferente de " + dtsecond);
		
			System.out.println("DIFERENTES" + "\n==========\n");
		}
	
		int i = 0;
		while(i < 2) {
			
			System.out.println(dt);
			dt.incrementaDia();
			i++;
		}
		
	}
}
