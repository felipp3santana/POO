package br.upis.col;

import java.util.Comparator;

import br.upis.Data;

public class SortData implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		if(o1.ehMenor(o2)) return -1;
		if(o1.ehMenor(o2)) return 0;
		return 1;
	}

}
