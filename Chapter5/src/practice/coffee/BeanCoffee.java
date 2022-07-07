package practice.coffee;

public class BeanCoffee {

	String beanAmericano = "콩 다방 아메리카노";
	String beanLatte = "콩 다방 라떼";
	
	public String order(int beanCoffeeMenu) {
		if (beanCoffeeMenu == 4000) {
			return beanAmericano;
		} else 
		
		return beanLatte;
	}

}
