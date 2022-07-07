package practice.coffee;

public class WorkToBuyCoffeeTest {

	public static void main(String[] args) {
		
		Person kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, Menu.starCoffeeLatte);
		Lee.buybeanCoffee(beanCoffee, Menu.beanCoffeeAmericano);
		
		kim.showInfo();
		Lee.showInfo();
	}

}
