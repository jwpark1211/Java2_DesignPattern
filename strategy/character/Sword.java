package character;

public class Sword implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("is attacking with Sword");
	}
}
