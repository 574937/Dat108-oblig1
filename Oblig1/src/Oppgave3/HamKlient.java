package Oppgave3;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class HamKlient {

	
	

		public static void main(String[] args) {
			BlockingQueue<Integer> burgerKo = new LinkedBlockingQueue<Integer>();
			
			Thread kokk1 = new Kokk(burgerKo);
			kokk1.setName("Kokk 1");
			Thread kokk2 = new Kokk(burgerKo);
			kokk2.setName("Kokk 2");
			Thread kokk3 = new Kokk(burgerKo);
			kokk3.setName("Kokk 3");
			
			Thread servitor1 = new Servitor(burgerKo);
			servitor1.setName("Servitør 1");
			Thread servitor2 = new Servitor(burgerKo);
			servitor2.setName("Servitør 2");
			
			kokk1.start();
			servitor1.start();
			kokk2.start();
			kokk3.start();
			servitor2.start();

			
		}

	}

