package br.upis;

public class Data implements IData{

	private byte dia; 	// {1 .. {28, 29, 30 ou 31} }
	private byte mes; 	// {1 .. 12}
	private short ano; 	// {1 .. 9999}

	private boolean ehBissexto(short ano) {
		return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
	}

	private byte getUltimoDia(byte mes, short ano) {
		byte ud [] = {0,31,28,31,30,31,30,31,31,30,31,30,31}; 
		
		if(mes == 2 && ehBissexto(ano)) {
			return 29;
		}
		
		return ud[mes];
	}
	
	public Data() {
		setAno((byte)1);
		setMes((byte)1);
		setDia((byte)1);
	}
	
	public Data(byte dia, byte mes, short ano) {
		this();
		setAno(ano);
		setMes(mes);
		setDia(dia);
	}
	
	public Data(int dia, int mes, int ano) {
		this((byte)dia, (byte)mes, (short)ano);
	}

	public Data(Data data) {
		this(data.getDia(), data.getMes(), data.getAno());
	}

	@Override
	public byte getDia() {
		return dia;
	}

	@Override
	public void setDia(byte dia) {
		
		byte ultimoDia = getUltimoDia(mes, ano);
		
		if(dia >= 1 && dia <= ultimoDia) {
			this.dia = dia;
		}
	}

	@Override
	public byte getMes() {
		return mes;
	}

	@Override
	public void setMes(byte mes) {
		if(mes >= 1 && mes <= 12) {
			this.mes = mes;
		}
	}

	@Override
	public short getAno() {
		return ano;
	}
	
	@Override
	public void setAno(short ano) {
		if(ano >= 1 && ano <= 9999) {
			this.ano = ano;			
		}
	}
	
	@Override
	public void incrementaDia() {
		
		byte day = (byte)(this.dia + 1);
		
		if( day > getUltimoDia(mes,ano)) {
			this.dia = 1;
			incrementaMes();
		}
		else {
			setDia(day);
		}
	}
	
	@Override
	public void incrementaDia(int n) {
		int i = 0;
		while(i != n) {
			incrementaDia();
			i++;
		}
	}
	
	@Override
	public void incrementaMes() {
		
		byte month = (byte)(this.mes + 1);
		
		if( month > 12) {
			this.mes = 1;
			incrementaAno();
		}
		else {
			setMes(month);
		}
	}
	
	@Override
	public void incrementaMes(int n) {
		int month = this.mes + n;
		
		if( month > 12) {
			this.mes = (byte)(month % 12);
			incrementaAno(month/12);
		}
		else {
			setMes((byte)month);
		}
	}
	
	@Override
	public void incrementaAno() {
		
		this.ano++;
		}
	
	@Override
	public void incrementaAno(int n) {
		
		this.ano = (short)(n + this.ano);
		}
	
	@Override
	public String toString() {
		return getDia() + "/" + getMes() + "/" + getAno();
	}
	
	private boolean equalsAno(Data dt) {
		return this.getAno() == dt.getAno();
	}
	
	private boolean equalsMes(Data dt) {
		return this.getMes() == dt.getMes();
	}
	
	private boolean equalsDia(Data dt) {
		return this.getDia() == dt.getDia();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) 
            return true;
		
		 if(obj == null || obj.getClass()!= this.getClass()) 
			 return false;
		
		 Data h = (Data) obj;
		 
		 return this.getAno() == h.getAno() && 
				this.getMes() == h.getMes() &&
				this.getDia() == h.getDia();
	}
	
	public boolean ehMenor(Data dt) {
		
		if(this.getAno() < dt.getAno()) 
			return true;
		
		if (equalsAno(dt) && this.getMes() < dt.getMes())
			return true;
		
		if (equalsAno(dt) && equalsMes(dt) && this.getDia() < dt.getDia())
			return true;
		
		return false;
	}
	
	public boolean ehMaior(Data dt) {
		
		if(this.getAno() > dt.getAno()) 
			return true;
		
		if (equalsAno(dt) && this.getMes() > dt.getMes())
			return true;
		
		if (equalsAno(dt) && equalsMes(dt) && this.getDia() > dt.getDia())
			return true;
		
		return false;
	}
	
}
