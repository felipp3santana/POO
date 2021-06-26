package br.upis.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.upis.HorarioNG;

public class TestHorarioNG {
	public static void main(String[] args) {
		
		HorarioNG a = new HorarioNG(10,20,30);
		
		HorarioNG b = new HorarioNG(14,20,31);
		
		HorarioNG c = new HorarioNG(14,20,30);
		
		List<HorarioNG> horarios;
		
		horarios = new ArrayList<HorarioNG>();
		
		horarios.add(b);
		
		horarios.add(c);
		
		horarios.add(a);
		
		for(int i = 0; i < horarios.size(); i++) {
			System.out.println(i + "->" + horarios.get(i));
			
		}
		
		Collections.sort(horarios, new SortHorarioNG());
		System.out.println("======================");
		
		for(int i = 0; i < horarios.size(); i++) {
			System.out.println(i + "->" + horarios.get(i));
			
		}
		
		
		System.out.println("\nTamanho Lista? " + horarios.size());
		System.out.println("Contem C? " + horarios.contains(c));
	}
}