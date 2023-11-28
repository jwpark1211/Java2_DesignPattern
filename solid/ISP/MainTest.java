package ISP;

public class MainTest {
	// ISP - Interface Segregation Principle
	// 한 클래스는 자신이 사용하지않는 인터페이스는 구현하지 말아야 한다. 
	// 하나의 일반적인 인터페이스보다 여러개의 구체적인 인터페이스가 낫다.
	public MainTest() {
		// example of ISP violation
		//AllinOne으로 모든 기능이 있고, 이를 상속받는 모든 프린터는 반드시 모든 기능을 구현해야 한다. 
		System.out.println("example of ISP violation");
		AllInOnePrinter a = new AllInOnePrinter();
		a.print();
		a.fax();
		a.scan();
		EconomicPrinter b = new EconomicPrinter();
		b.print();
		
		// example of ISP
		// interface를 여러 개로 분할 사용함으로써 상속받는 프린터는 필요한 기능만을 구현할 수 있도록 한다. 
		System.out.println("example of ISP");
		AllInOnePrinter2 a2 = new AllInOnePrinter2();
		a2.print();
		a2.fax();
		a2.scan();
		EconomicPrinter2 b2 = new EconomicPrinter2();
		b2.print();
	}

}
