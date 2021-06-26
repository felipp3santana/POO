package br.upis;

public class TesteRelogio {
	public static void main(String[] args) {
		
		Horario hms = new Horario((byte)23, (byte)54, (byte)30);
		Data dma = new Data(31, 1, 2021);
		
		Horario hmstest = new Horario((byte)23, (byte)54, (byte)30);
		Data dmatest = new Data(31, 1, 2021);
		
		Relogio r = new Relogio(hms, dma);
		
		Relogio c = new Relogio(hmstest, dmatest);
		
		if(r.ehMenor(c)) {
			System.out.println("\n==========\n" + r + " é menor que " + c);
		
			System.out.println("MENOR" + "\n==========\n");}
		else {	
			System.out.println("\n==========\n" + r + " é maior ou igual a " + c);
	
			System.out.println("MAIOR OU IGUAL " + "\n==========\n");}
		
		/*if(r.ehMaior(c)) {
			System.out.println("\n==========\n" + r + " é maior que " + c);
		
			System.out.println("MAIOR" + "\n==========\n");}
		else {	
			System.out.println("\n==========\n" + r + " é menor ou igual a " + c);
	
			System.out.println("MENOR OU IGUAL " + "\n==========\n");}*/
		
		if(r.equals(c)) { 
			System.out.println("\n==========\n" + r + " é igual a " + c);
		
			System.out.println("IGUAIS" + "\n==========\n");
		}else {
			System.out.println("\n==========\n" + r + " é diferente de " + c);
		
			System.out.println("DIFERENTES" + "\n==========\n");
		}

		int a = 0;
		while(a < 5) {
			
			System.out.println(r);
			
			r.tictac();
			
			a++;
		}
	}
}

