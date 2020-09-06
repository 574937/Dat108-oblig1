
package Oppgave1;

import javax.swing.JOptionPane;

public class Sender extends Thread {
	
	private Melding melding;
	
	public Sender(Melding melding) {
		this.melding = melding;
	}

	@Override
	public void run() {
		
		while (true) {
			
			String nyMelding = JOptionPanee.showInputDialog("Skriv inn melding:");
			
			synchronized(melding) {
				while(!melding.erMottatt()) {
					try {
						melding.wait();
					} catch (InterruptedException e) {
					}
				}

				melding.send(nyMelding);
				melding.notifyAll();
				
				
			}
		}
	}
}



