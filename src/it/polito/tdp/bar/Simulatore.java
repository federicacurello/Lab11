package it.polito.tdp.bar;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;


public class Simulatore {
private PriorityQueue<Evento> queue = new PriorityQueue<>() ;
	
	// Stato del mondo
	private int tavoliTotali ;
	private int tavoliDa10p ;
	private int tavoliDa8 ;
	private int tavoliDa6 ;
	private int tavoliDa4 ;
	


	// Parametri di simulazione
		private int maxEventi= 2000;
		private Random rand= new Random();
		private int intervalloArrivoCliente = rand.nextInt(10);
		private LocalTime ora= LocalTime.now();;
		

		// Statistiche raccolte
		private int numeroClientiTotali= 0 ;
		private int numeroClientiInsoddisfatti=0 ;
		private int numeroClientiSoddisfatti=0;
		
		public void init() {
			this.tavoliTotali = 15 ;
			this.tavoliDa10p = 2 ;
			this.tavoliDa8 = 4 ;
			this.tavoliDa6 = 4 ;
			this.tavoliDa4 = 5 ;
			
			this.queue.clear();
			
			for(int i=0; i<2000; i++) {
				
				queue.add(new Evento(ora, Evento.TipoEvento.ARRIVO_GRUPPO_CLIENTI)) ;
				
				ora = ora.plusMinutes(intervalloArrivoCliente);
				
			}
			}
		public void run() {
			
			while(!queue.isEmpty()) {
				Evento ev = queue.poll() ;
				switch(ev.getTipo()) {
				
				case ARRIVO_GRUPPO_CLIENTI:
					GruppoClienti cl= new GruppoClienti( rand.nextInt(10), rand.nextInt((120-60)+1)+60, 0.0+ 0.9*rand.nextDouble());
					if( cl.getNum_persone()<= 4  ) {
						if(tavoliDa4>0 && cl.getNum_persone()>= 2 ) {
							tavoliDa4--;
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
						}
						else if (tavoliDa6>0 && cl.getNum_persone()>= 3) {
							tavoliDa6--;
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
						}
						else if (tavoliDa8>0 && cl.getNum_persone()== 4 ) {
							tavoliDa8--;
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
						}
						
						else {
							if(cl.getTolleranza()< 0.0+ 0.9*rand.nextDouble()) {
								numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
								numeroClientiInsoddisfatti= numeroClientiInsoddisfatti+ cl.getNum_persone();
							}
							else {
								numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
								numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
							}
							}
								
						}
							
							
					
					if( cl.getNum_persone()<= 6 && cl.getNum_persone()>= 3) {
						if(tavoliDa6>0 ) {
							tavoliDa4--;
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
						}
						else if (tavoliDa8>0 && cl.getNum_persone()>= 4) {
							tavoliDa8--;
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
						}
						else if (tavoliDa10p>0 && cl.getNum_persone()>= 5) {
							tavoliDa10p--;
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
						}
						else {
							if(cl.getTolleranza()< 0.0+ 0.9*rand.nextDouble()) {
								numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
								numeroClientiInsoddisfatti= numeroClientiInsoddisfatti+ cl.getNum_persone();
							}
							else {
								numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
								numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
							}
							}
							
					}
					if( cl.getNum_persone()<= 8) {
						if(tavoliDa8>0 && cl.getNum_persone()>= 4 ) {
							tavoliDa4--;
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
						}
						else if (tavoliDa10p>0 && cl.getNum_persone()>= 5) {
							tavoliDa10p--;
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
						}
						else {
							if(cl.getTolleranza()< 0.0+ 0.9*rand.nextDouble()) {
								numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
								numeroClientiInsoddisfatti= numeroClientiInsoddisfatti+ cl.getNum_persone();
							}
							else {
								numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
								numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
							}
							}
							
					}
					if( cl.getNum_persone()<= 10 ) {
						if(tavoliDa10p>0 && cl.getNum_persone()>= 5) {
							tavoliDa4--;
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
						}
						else {
							if(cl.getTolleranza()< 0.0+ 0.9*rand.nextDouble()) {
								numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
								numeroClientiInsoddisfatti= numeroClientiInsoddisfatti+ cl.getNum_persone();
							}
							else {
								numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
								numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
							}
							}
							
					}
					else {
						if(cl.getTolleranza()< 0.0+ 0.9*rand.nextDouble()) {
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiInsoddisfatti= numeroClientiInsoddisfatti+ cl.getNum_persone();
						}
						else {
							numeroClientiTotali= numeroClientiTotali+ cl.getNum_persone();
							numeroClientiSoddisfatti= numeroClientiSoddisfatti+ cl.getNum_persone();
						}
						}
					break;
				case ESCONO: 
					
				
		}
		}
		
}
}

