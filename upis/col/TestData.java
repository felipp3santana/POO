package br.upis.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.upis.Data;
import br.upis.Horario;

public class TestData {
	public static void main(String[] args) {

		Data a = new Data(20,2,2011);
		
		Data b = new Data(14,11,2020);
		
		Data c = new Data(11,5,2033);
		
		List<Data> datas;
		
		datas = new ArrayList<Data>();
		
		datas.add(b);
		datas.add(c);
		datas.add(a);
		
		for(int i = 0; i < datas.size() ; i++) {
			System.out.println(i + "->" + datas.get(i));
		}
		
		Collections.sort(datas, new SortData());
		System.out.println("======================");
		
		for(int i = 0; i < datas.size() ; i++) {
			System.out.println(i + "->" + datas.get(i));
		}
		
	}
}
