package practice.coffee;

public class Person {
	
	String personName;
	int price;
	
	public Person(String personName, int price) {
		this.personName = personName;
		this.price = price;
	}

	public void buyStarCoffee(StarCoffee starCoffee, int starCoffeeMenu) {
		String menu = starCoffee.order(starCoffeeMenu);
		this.price -= starCoffeeMenu;
		
		System.out.println(personName + "님이 " + starCoffeeMenu + "으로 " + menu + "를 주문하셨습니다.");
	}
	
	public void buybeanCoffee(BeanCoffee beanCoffee, int beanCoffeeMenu ) {
		String menu = beanCoffee.order(beanCoffeeMenu);
		this.price -= beanCoffeeMenu;
		
		System.out.println(personName + "님이 " + beanCoffeeMenu + "으로 " + menu + "를 주문하셨습니다.");
	}
	
	public void showInfo() {
		System.out.println(personName + "님의 남은 금액은 " + price + "원 입니다.");
	}

}
