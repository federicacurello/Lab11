package it.polito.tdp.bar;

public class TestSimulatore {

	public static void main(String[] args) {

		Simulatore sim = new Simulatore() ;
		
		sim.init(); 
		
		sim.run(); 
		
		sim.statistiche();
		
	}

}
