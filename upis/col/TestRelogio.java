package br.upis.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.upis.Data;
import br.upis.Horario;
import br.upis.Relogio;

public class TestRelogio {
	public static void main(String[] args) {
		
		Horario hms = new Horario((byte)23, (byte)54, (byte)30);
		Data dma = new Data(23, 2, 2032);
		
		Horario hmstest = new Horario((byte)23, (byte)54, (byte)11);
		Data dmatest = new Data(31, 1, 2019);
		
		Horario hmstest2 = new Horario((byte)13, (byte)43, (byte)11);
		Data dmatest2 = new Data(11,2, 1993);
		
		Relogio r = new Relogio(hms, dma);
		
		Relogio c = new Relogio(hmstest, dmatest);
		
		Relogio d = new Relogio(hmstest2, dmatest2);
		
		List<Relogio> relogios;
		
		relogios = new ArrayList<Relogio>();
		
		relogios.add(c);
		relogios.add(d);
		relogios.add(r);
		
		for (int i = 0; i < relogios.size(); i++) {
			System.out.println(i + "->" + relogios.get(i));
		}
		
		Collections.sort(relogios, new SortRelogio());
		
		System.out.println("======================");
		
		for (int i = 0; i < relogios.size(); i++) {
			System.out.println(i + "->" + relogios.get(i));
		}
	}
}
