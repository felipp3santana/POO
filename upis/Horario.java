package br.upis;

public class Horario implements IHorario {

		private byte hora; 		// {0 .. 23}
		private byte minuto; 	// {0 .. 59}
		private byte segundo; 	// {0 .. 59}
		
		public Horario() {
			setHora((byte)0);
			setMinuto((byte)0);
			setSegundo((byte)0);
		}
		
		public Horario(byte hora, byte minuto, byte segundo){
			setHora(hora);
			setMinuto(minuto);
			setSegundo(segundo);
		}
		
		public Horario(int hora, int minuto, int segundo) {
			this((byte)hora, (byte)minuto, (byte)segundo);
		}
		
		public Horario(IHorario horario) {
			this(horario.getHora(), horario.getMinuto(), horario.getSegundo());
		}
		
		@Override
		public void setHora(byte hora) {
			
			if(hora >= 0 && hora <= 23) {
				this.hora = hora;
			}
		}
		
		@Override
		public byte getHora() {
			return this.hora;
		}		
	
		@Override
		public void setMinuto(byte minuto) {
			if(minuto >= 0 && minuto <= 59) {
				this.minuto = minuto;
			}
		}
		
		@Override
		public byte getMinuto() {
			return this.minuto;
		}
		
		@Override
		public void setSegundo(byte segundo) {
			if(segundo >= 0 && segundo <= 59) {
				this.segundo = segundo;
			}
		}
		
		@Override
		public byte getSegundo() {
			return this.segundo;
		}
		
		@Override
		public String toString() {
			return getHora() + ":" + getMinuto() + ":" + getSegundo();
		}	

		@Override
		public void incrementaSegundo() {
			
			byte s = (byte)(segundo + 1);
			
			if(s == 60) {
				segundo = 0;
				incrementaMinuto();
			}else {
				segundo = s;
			}
		}
		
		@Override
		public void incrementaSegundo(int n) {
			
			int s = segundo + n;
			
			if (n >= 0) {
				if(s > 59) {
					segundo = (byte)(s % 60);
					incrementaMinuto(s / 60);
				}else {
					segundo = (byte) s;
				}
			}
		}
		
		@Override
		public void incrementaMinuto() {
			byte m = (byte)(minuto + 1);
			
			if(m == 60) {
				minuto = 0;
				incrementaHora();
			}else {
				minuto = m;
			}
		}
		
		@Override
		public void incrementaMinuto(int n) {
			int m = minuto + n;
			
			if (n >= 0) {
				if(m > 59) {
					minuto = (byte)(m % 60);
					incrementaHora(m / 60);
				}else {
					minuto = (byte)m;
				}
			}
		}

		@Override
		public void incrementaHora() {
			byte h = (byte)(hora + 1);
			
			if(h == 24) {
				hora = 0;
			}else {
				hora = h;
			}			
		}
		
		@Override
		public void incrementaHora(int n) {
			int h = hora + n;
			
			if (n >= 0) {
				if(h > 23) {
					hora = (byte)(h % 24);
				}else {
					hora = (byte)h;
				}	
			}
		}
		
		@Override
		public boolean ehUltimoHorario() {
			return hora == 23 && minuto == 59 && segundo == 59;
		}
		
		private boolean equalsHora(Horario hr) {
			return this.getHora() == hr.getHora();
		}
		
		private boolean equalsSegundo(Horario hr) {
			return this.getSegundo() == hr.getSegundo();
		}
		
		private boolean equalsMinuto(Horario hr) {
			return this.getMinuto() == hr.getMinuto();
		}

		@Override
		public boolean equals(Object obj) {
			
			if(this == obj) 
	            return true;
			
			 if(obj == null || obj.getClass()!= this.getClass()) 
				 return false;
			
			 Horario h = (Horario) obj;
			 
			 return this.getHora() == h.getHora() && 
					this.getMinuto() == h.getMinuto() &&
					this.getSegundo() == h.getSegundo();
		}
		
		@Override
		public boolean ehMenor(Object obj) {
			
			Horario h = (Horario) obj;
			
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
			
			Horario h = (Horario) obj;
			
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
			
			int hash = this.segundo + (this.minuto * 60) + (this.hora * 3600);
			
			return hash % 86400;
		}

}
