package Oppgave2;


import java.util.concurrent.ThreadLocalRandom;

public class Servitor extends Thread {
	
	// Et objekt av klassen SettInOgTaUt som har både leggTilBurger
	// og taBurger.
	// Rutsjebane rb = new Rutsjebane();
	// Tilfeldig antall sekunder i millisekunder
	int tilfeldigSekunder = ThreadLocalRandom.current().nextInt(500, 2000);

	@Override
	public void run() {
		
		try {
			Kokk.rb.taBurger();
		} catch (InterruptedException e) {
		}
	}

}