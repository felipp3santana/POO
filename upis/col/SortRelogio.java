package br.upis.col;

import br.upis.Relogio;

import java.util.Comparator;


public class SortRelogio implements Comparator<Relogio>{

	@Override
	public int compare(Relogio o1, Relogio o2) {
		if(o1.ehMenor(o2)) return -1;
		if(o1.equals(o2)) return 0;
		return 0;
	}

}
