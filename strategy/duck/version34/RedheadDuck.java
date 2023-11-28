package duck.version34;

public class RedheadDuck extends Duck implements Flyable, Quackable {	
	@Override
	public void display() {
		System.out.println("Redhead Duck\n");
	}
	
	@Override
	public void quack() {
		System.out.println("quack\n");		
	}

	@Override
	public void fly() {
		System.out.println("fly\n");
	}
}
