package it.polito.tdp.bar;

import java.time.LocalTime;


public class Evento implements Comparable<Evento> {
	
	

	public enum TipoEvento {
		ARRIVO_GRUPPO_CLIENTI,
		ESCONO,
	}
	
	private GruppoClienti clienti;
	private LocalTime time ;
	private TipoEvento tipo ;
	
public Evento(GruppoClienti clienti, LocalTime time, TipoEvento tipo) {
		super();
		this.clienti = clienti;
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


public GruppoClienti getClienti() {
	return clienti;
}


public void setClienti(GruppoClienti clienti) {
	this.clienti = clienti;
}

@Override
	public int compareTo(Evento altro) {
		
		return this.time.compareTo(altro.time);
	}
	
@Override
public String toString() {
	return String.format("Evento [clienti=%s, time=%s, tipo=%s]", clienti, time, tipo);
}


}