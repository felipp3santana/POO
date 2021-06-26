package br.upis;

public interface IHorario {

	void setHora(byte hora);

	byte getHora();

	void setMinuto(byte minuto);

	byte getMinuto();

	void setSegundo(byte segundo);

	byte getSegundo();

	String toString();

	void incrementaSegundo();
	
	void incrementaSegundo(int n);

	void incrementaMinuto();
	
	void incrementaMinuto(int n);

	void incrementaHora();
	
	void incrementaHora(int n);

	boolean ehUltimoHorario();
	
	boolean equals(Object obj);

	boolean ehMenor(Object obj);
	
	boolean ehMaior(Object obj);
	
	int hashCode();

}
