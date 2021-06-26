package br.upis;

public class TesteData {
	public static void main(String[] args) {
		
		Data dt = new Data(2,1,1);
		Data dtsecond = new Data();
		
		if(dt.ehMenor(dtsecond)) {
			System.out.println("\n==========\n" + dt + " é menor que " + dtsecond);
		
			System.out.println("MENOR" + "\n==========\n");}
		else {	
			System.out.println("\n==========\n" + dt + " é maior ou igual a " + dtsecond);
	
			System.out.println("MAIOR OU IGUAL " + "\n==========\n");}
		
		/*if(dt.ehMaior(dtsecond)) {
			System.out.println("\n==========\n" + dt + " é maior que " + dtsecond);
		
			System.out.println("MAIOR" + "\n==========\n");}
		else {	
			System.out.println("\n==========\n" + dt + " é menor ou igual a " + dtsecond);
	
			System.out.println("MENOR OU IGUAL " + "\n==========\n");}*/
		
		
		
		if(dt.equals(dtsecond)) { 
			System.out.println("\n==========\n" + dt + " é igual a " + dtsecond);
		
			System.out.println("IGUAIS" + "\n==========\n");
		}else {
			System.out.println("\n==========\n" + dt + " é diferente de " + dtsecond);
		
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
