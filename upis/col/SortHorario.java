package br.upis.col;

import java.util.Comparator;

import br.upis.Horario;

public class SortHorario implements Comparator<Horario> {

	@Override
	public int compare(Horario o1, Horario o2) {
		if(o1.ehMenor(o2)) return -1;
		if(o1.equals(o2)) return 0;
		return 1;
	}

	
}
