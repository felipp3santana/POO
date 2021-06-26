package br.upis;

public class HorarioNG implements IHorario{

		private int segundo;
		
		public HorarioNG() {
			setHora((byte)0);
			setMinuto((byte)0);
			setSegundo((byte)0);
		}
		
		public HorarioNG(byte hora, byte minuto, byte segundo){
			setHora(hora);
			setMinuto(minuto);
			setSegundo(segundo);
		}
		
		public HorarioNG(int hora, int minuto, int segundo) {
			this((byte)hora, (byte)minuto, (byte)segundo);
		}

		public HorarioNG(IHorario horario) {
			this(horario.getHora(), horario.getMinuto(), horario.getSegundo());
		}
		
		@Override
		public void setHora(byte segundo) {
			this.segundo += segundo * 3600;
		}
		
		@Override
		public byte getHora() {
			return (byte)((this.segundo / 3600) % 24);
		}		
	
		@Override
		public void setMinuto(byte segundo) {
			this.segundo += segundo * 60;
		}
		
		@Override
		public byte getMinuto() {
			return (byte)((this.segundo / 60) % 60);
		}
		
		@Override
		public void setSegundo(byte segundo) {
			this.segundo += segundo;
		}
		
		@Override
		public byte getSegundo() {
			return (byte)(this.segundo % 60);
		}
		
		@Override
		public String toString() {
			return getHora() + ":" + getMinuto() + ":" + getSegundo();
		}	

		@Override
		public void incrementaSegundo() {
				this.segundo++;
		}
		
		@Override
		public void incrementaSegundo(int n) {
			
		}
		
		@Override
		public void incrementaMinuto() {
				this.segundo += 60;
		}

		@Override
		public void incrementaMinuto(int n) {
			
		}
		
		@Override
		public void incrementaHora() {
				this.segundo += 3600;
		}
		
		@Override
		public void incrementaHora(int n) {
			
		}
		
		@Override
		public boolean ehUltimoHorario() {
			return segundo == 86399;
		}
		
		private boolean equalsHora(HorarioNG hr) {
			return this.getHora() == hr.getHora();
		}
		
		private boolean equalsSegundo(HorarioNG hr) {
			return this.getSegundo() == hr.getSegundo();
		}
		
		private boolean equalsMinuto(HorarioNG hr) {
			return this.getMinuto() == hr.getMinuto();
		}
		
		@Override
		public boolean equals(Object obj) {
			
			if(this == obj) 
	            return true;
			
			 if(obj == null || obj.getClass()!= this.getClass()) 
				 return false;
			
			 HorarioNG h = (HorarioNG) obj;
			 
			 return this.getHora() == h.getHora() && 
					this.getMinuto() == h.getMinuto() &&
					this.getSegundo() == h.getSegundo();
		}
		
		@Override
		public boolean ehMenor(Object obj) {
			
			HorarioNG h = (HorarioNG) obj;
			
			if(this.getHora() < h.getHora()) 
				return true;
			
			if (equalsHora(h) && this.getMinuto() < h.getMinuto())
				return true;
			
			if (equalsHora(h) && equalsMinuto(h) && this.getSegundo() < h.getSegundo())
				return true;
			
			return false;
		}
		
		@Override
		public boolean ehMaior(Object obj) {
			HorarioNG h = (HorarioNG) obj;
			
			if(this.getHora() > h.getHora()) 
				return true;
			
			if (equalsHora(h) && this.getMinuto() > h.getMinuto())
				return true;
			
			if (equalsHora(h) && equalsMinuto(h) && this.getSegundo() > h.getSegundo())
				return true;
			
			return false;
		}
		
		@Override
		public int hashCode() {
			
			return this.segundo % 86400;
		}
		
}
