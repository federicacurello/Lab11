package it.polito.tdp.bar;

import java.time.LocalTime;


public class Evento implements Comparable<Evento> {
	
	

	public enum TipoEvento {
		ARRIVO_GRUPPO_CLIENTI,
		ESCONO,
	}
	
	private LocalTime time ;
	private TipoEvento tipo ;
	
	
	
	@Override
	public int compareTo(Evento altro) {
		
		return this.time.compareTo(altro.time);
	}
	
public Evento(LocalTime time, TipoEvento tipo) {
		super();
		this.time = time;
		this.tipo = tipo;
		
	}

public LocalTime getTime() {
	return time;
}

public void setTime(LocalTime time) {
	this.time = time;
}

public TipoEvento getTipo() {
	return tipo;
}

public void setTipo(TipoEvento tipo) {
	this.tipo = tipo;
}

}