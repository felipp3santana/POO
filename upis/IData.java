package br.upis;

public interface IData {
	
	byte getDia();
	
	void setDia(byte dia);
	
	byte getMes();
	
	void setMes(byte mes);
	
	short getAno();
	
	void setAno(short ano);
	
	void incrementaDia();

	void incrementaDia(int n);
	
	void incrementaMes();
	
	void incrementaMes(int n);
	
	void incrementaAno();
	
	void incrementaAno(int n);
	
	String toString();
	
	public boolean equals(Object obj);
	
	public boolean ehMenor(Data dt);
	
	public boolean ehMaior(Data dt);
	
}
