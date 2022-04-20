package game.card;

public class Gawi extends Hand {

	@Override
	public int compare(Hand otherHand) {
		int result = 0;
		
		if(this instanceof Gawi) {
			return 0;
		} else if(otherHand instanceof Bawi) {
			return -1;
		} else if(otherHand instanceof Bo) {
			return 1;
		}
		
		return result;
	}
	
	@Override
	public Hand cheat(Hand otherHand) {
		Hand newHand = null;
		
		if(otherHand instanceof Gawi) {
			newHand = new Bawi();
		} else if(otherHand instanceof Bawi) {
			newHand = new Bo();
		} else if(otherHand instanceof Bo) {
			newHand = new Gawi();
		}
		
		return newHand;
	}

}
