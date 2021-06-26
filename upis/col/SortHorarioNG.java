package br.upis.col;

import java.util.Comparator;

import br.upis.HorarioNG;

public class SortHorarioNG implements Comparator<HorarioNG> {

	@Override
	public int compare(HorarioNG o1, HorarioNG o2) {
		if(o1.ehMenor(o2)) return -1;
		if(o1.equals(o2)) return 0;
		return 1;
	}

	
}