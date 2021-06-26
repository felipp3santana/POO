package br.upis.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.upis.Horario;

public class TestHorario {
	public static void main(String[] args) {
		
		Horario a = new Horario(10,20,30);
		
		Horario b = new Horario(14,20,31);
		
		Horario c = new Horario(14,20,30);
		
		List<Horario> horarios;
		
		horarios = new ArrayList<Horario>();
		
		horarios.add(b);
		
		horarios.add(c);
		
		horarios.add(a);
		
		for(int i = 0; i < horarios.size(); i++) {
			System.out.println(i + "->" + horarios.get(i));
			
		}
		
		Collections.sort(horarios, new SortHorario());
		System.out.println("======================");
		
		for(int i = 0; i < horarios.size(); i++) {
			System.out.println(i + "->" + horarios.get(i));
			
		}
		
		
		System.out.println("\nTamanho Lista? " + horarios.size());
		System.out.println("Contem C? " + horarios.contains(c));
	}
}