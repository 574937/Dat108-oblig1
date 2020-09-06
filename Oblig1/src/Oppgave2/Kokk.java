package Oppgave2;
import java.util.concurrent.ThreadLocalRandom;


public class Kokk extends Thread {

	// Et objekt av klassen rutsjebane som har både leggTilBurger og taBurger.
	static final Rutsjebane rb = new Rutsjebane();
	
	// Tilfeldig antall millisekunder
	int tilfeldigSekunder = ThreadLocalRandom.current().nextInt(500, 2000);
	
	@Override
	public void run() {

		try {
			rb.leggTilBurger();
		} catch (InterruptedException e) {
		}

	}
}