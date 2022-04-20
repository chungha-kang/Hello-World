package game.player;

import java.util.Random;

import game.card.Bawi;
import game.card.Bo;
import game.card.Gawi;
import game.card.Hand;
import game.record.Record;

public class ComPlayer implements Player {
	
	Random rd = new Random();
	private String name = "Computer";
	private Hand hand;
	private Record record;

	@Override
	public void randomCardHand() {
		int rand = rd.nextInt(3);
		switch(rand) {
			case 0:
				hand = new Gawi(); break;
			case 1:
				hand = new Bawi(); break;
			case 2:
				hand = new Bo(); break;
		}
	}

	@Override
	public int versus(Hand h) {
		int result = hand.compare(h);
		switch(result) {
			case -1:
			record.addLose(); break;
			case 0:
				record.addDraw(); break;
			case 1:
				record.wait(); break;
		}
		return result;
	}

	public String getName() {
		return this.getName();
	}
	
	public Hand getHand() {
		return this.hand;
	}

}
