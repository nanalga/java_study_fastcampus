package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("JAMES", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentA = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subwayGreen = new Subway(2);
		Taxi taxi3456 = new Taxi(3456);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentA.takeTaxi(taxi3456);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentA.showInfo();
		
		bus100.showBusInfo();
		bus200.showBusInfo();
		taxi3456.showTaxiInfo();
		
		subwayGreen.showSubwayInfo();
		

	}

}
