package character;

public class Walk implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("is moving by walking");
	}
}
