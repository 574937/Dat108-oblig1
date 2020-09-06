package Oppgave2;

public class KlientKokk {


		public static void main(String[] args) throws InterruptedException {
			
			// Oppretter flere kokk-tråd
			Thread kokk1 = new Kokk();
			kokk1.setName("Kokk 1");
			Thread kokk2 = new Kokk();
			kokk2.setName("Kokk 2");
			Thread kokk3 = new Kokk();
			kokk3.setName("Kokk 3");

			// Oppretter flere servitør-tråd
			Thread servitor1 = new Servitor();
			servitor1.setName("Servitør 1");
			Thread servitor2 = new Servitor();
			servitor2.setName("Servitør 2");
			
			// starter begge trådene
			kokk1.start();
			servitor1.start();
			kokk2.start();
			kokk3.start();
			servitor2.start();

		}
}