package Oppgave1;


public class Mottaker extends Thread {

	private Melding melding;
	
	public Mottaker(Melding melding) {
		this.melding = melding;
	}

	@Override
	public void run() {
		
		while (true) {
			
			synchronized(melding) {
				while(melding.erMottatt()) {
					try {
						melding.wait();
					} catch (InterruptedException e) {
					}
				}
				String mottattMelding = melding.motta();
				melding.notifyAll();
				
			}
			try {
				while (melding.motta() != null) {
				sleep(300);
				System.out.println(melding.motta());
				
				}
				
			} catch (InterruptedException e) {
			}
		}
	}

}
