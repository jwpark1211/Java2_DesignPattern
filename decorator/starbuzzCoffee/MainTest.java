package starbuzzCoffee;

public class MainTest {

	public MainTest() {
		// Espresso
		Beverage b = new Espresso();
		System.out.println(b.getDescription() + " $" + b.cost());

		// DarkRoast + Mocha 2 shots + Whip
		b = new DarkRoast();
		b = new Mocha(b);
		b = new Mocha(b);
		b = new Whip(b);
		System.out.println(b.getDescription() + " $" + b.cost());
		
		// HouseBlend
		b = new HouseBlend();
		b = new Soy(b);
		b = new Milk(b);
		b = new Mocha(b);
		b = new Whip(b);
		System.out.println(b.getDescription() + " $" + b.cost());		
	}

}
