package practice.card;

public class CardCompany {
	
	private static CardCompany Instance = new CardCompany();
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(Instance == null) {
			Instance = new CardCompany();
		}
		return Instance;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}

}
