
public class Card {
	private int rank;
	private String suit; 
	private boolean isFlipped = false;
	
	public Card(int v, String n) {
		rank = v;
		suit = n;
	}
	
	public int getRank() {
		return rank;
	}
	
	@Override
	public String toString() {
		String output;
		if(isFlipped) {
			output="[?][?]";
		} 
		else {
			output = suit;
		}
		return output;
	}
	
	public void flip() {
		isFlipped = !isFlipped;
	}
	
	public boolean isFlipped() {
		return isFlipped;
	}

	public int getValue() {
		return rank;
	}
}
