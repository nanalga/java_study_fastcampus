package practice.card;

public class Card {

	private int cardNumber;
	private static int serialNumber = 10000;

	Card(){
		serialNumber++;
		cardNumber += serialNumber;
		
	}
	
	public int getcardNumber() {
		return cardNumber;
	}

	public void setcardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
		
}
