package practice.coffee;

public class StarCoffee {
	
	String starAmericano = "별 다방 아메리카노";
	String starLatte = "별 다방 라떼";


	public String order(int starCoffeeMenu) {
		if(starCoffeeMenu == Menu.starCoffeeAmericano) {
			return starAmericano; 
		} else {
			return starLatte;
		}
		
	}


}
