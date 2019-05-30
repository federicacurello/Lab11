package it.polito.tdp.bar;

import java.util.Random;

public class GruppoClienti {

	private Random rand= new Random();
	private int num_persone;
	private int intervalloPermanenzaCliente;
	private double tolleranza;
	private int tavolo;
	
	
	public GruppoClienti(int num_persone, int intervalloPermanenzaCliente, double tolleranza) {

		this.num_persone = num_persone;
		this.intervalloPermanenzaCliente = intervalloPermanenzaCliente;
		this.tolleranza = tolleranza;
	}
	
	public Random getRand() {
		return rand;
	}
	public void setRand(Random rand) {
		this.rand = rand;
	}
	public int getNum_persone() {
		return num_persone;
	}
	public void setNum_persone(int num_persone) {
		this.num_persone = num_persone;
	}
	public int getIntervalloPermanenzaCliente() {
		return intervalloPermanenzaCliente;
	}
	public void setIntervalloPermanenzaCliente(int intervalloPermanenzaCliente) {
		this.intervalloPermanenzaCliente = intervalloPermanenzaCliente;
	}
	public double getTolleranza() {
		return tolleranza;
	}
	public void setTolleranza(double tolleranza) {
		this.tolleranza = tolleranza;
	}

	public void setTavolo(int num ) {
		tavolo= num;
		
	}

	public int getTavolo() {
		return tavolo;
	}

	@Override
	public String toString() {
		return String.format("GruppoClienti [num_persone=%s al tavolo=%s]", num_persone, tavolo);
	}

	
}
