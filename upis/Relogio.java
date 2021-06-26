package br.upis;

public class Relogio {

	private Horario hms;
	private Data dma;
	
	public Relogio(IHorario hms, Data dma) {
		this.hms = new Horario(hms);
		this.dma = new Data(dma);
	}
	
	public void tictac() {
		if(hms.ehUltimoHorario()) {
			dma.incrementaDia();
		}
		
		hms.incrementaSegundo();
	
	}
	 
	@Override
	public String toString() {
		return dma + " " + hms;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) 
            return true;
		
		 if(obj == null || obj.getClass()!= this.getClass()) 
			 return false;
		 
		Relogio h = (Relogio) obj;
		 
		 return this.hms.equals(hms) == h.hms.equals(hms) &&
				this.dma.equals(dma) == h.dma.equals(dma);
	}
	
	public boolean ehMenor(Relogio r) {
		
		if(this.dma.ehMenor(r.dma)) 
			return true;
		
		if(this.hms.ehMenor(r.hms)) 
			return true;
		
		return false;
	}
	
	public boolean ehMaior(Relogio r) {
		
		if(this.dma.ehMaior(r.dma)) 
			return true;
		
		if(this.hms.ehMaior(r.hms)) 
			return true;
		
		return false;
	}
	
}
