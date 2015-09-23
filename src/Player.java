import java.util.ArrayList;


public class Player {

	private String name;
	private ArrayList <Card> hand;
	
	public Player(String x, ArrayList<Card> y) {
		name = x;
		hand = y;
	}

	public void printHand() {
		for (int i = 0; i < hand.size(); i++)
			System.out.println(hand.get(i).toString());
		System.out.println("Hand size is " + hand.size());
		
	}
	
	//returns null if card selection is not valid, otherwise returns a card at location pos
	public Card discardCard(int pos) {
		if (pos >= hand.size() || pos < 0)
			return null;
		Card temp = hand.get(pos);
		hand.remove(pos);
		return temp;
	}
	
	//add a card to the array list
	public void addCard(Card newOne) {
		hand.add(newOne);
	}
	
	//get players name
	public String getName() {
		return name;
	}
}
