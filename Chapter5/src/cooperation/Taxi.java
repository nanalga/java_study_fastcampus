package cooperation;

public class Taxi {
	
	int taxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(int taxNumber) {
		this.taxiNumber = taxNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiNumber + "의 택시의 비용은 " + money + "원 나왔습니다.");
	}

}
