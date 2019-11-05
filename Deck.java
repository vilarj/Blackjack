import java.util.Random;

public class Deck extends CardCollection{
	Random rand = new Random();

	public Deck() {
		super(52);
		populate();
	}

	public void deal(Hand h) {
		int r = rand.nextInt(cards.size());
		Card c = cards.get(r);
		h.addCard(c);
		this.removeCard(c);
	}

	public void shuffle() {
		cards.clear();
		populate();
	}


	private void populate() {
		String[] suit=new String[4];
		//ArrayList<Integer> list[] = new int[13];
		int[] list = new int[13];
		String[] name = new String[13];
		suit[0] = "♦";
		suit[1] = "♥";
		suit[2] = "♣";
		suit[3] = "♠";

		list[0] = 2; name[0] = "2";
		list[1] = 3; name[1] = "3";
		list[2] = 4; name[2] = "4";
		list[3] = 5; name[3] = "5";
		list[4] = 6; name[4] = "6";
		list[5] = 7; name[5] = "7";
		list[6] = 8; name[6] = "8";
		list[7] = 9; name[7] = "9";
		list[8] = 10; name[8] = "10";
		list[9] = 10; name[9] = "J";
		list[10] = 10; name[10] = "Q";
		list[11] = 10; name[11] = "K";
		list[12] = 1; name[12] = "A";

		//suit loop
		for(int i = 0; i < suit.length; i++) {
			//list loop
			for(int j = 0; j < list.length; j++) {
				String s = name[j] + suit[i];
				Card c = new Card(list[j],s);
				addCard(c);
				//addCard(new Card(list[j],name[j]+suit[i]));
			}
		}
	}
}
