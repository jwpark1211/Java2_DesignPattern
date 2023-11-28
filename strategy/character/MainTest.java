package character;

public class MainTest {

	public MainTest() {
		System.out.println("strategy - character move/attack behavior by friendly, defensive...");

		Character[] characters = {
				new Character("Warrior", new Run(), new Sword()),
				new Character("Magician", new Fly(), new Fireball()),
				new Character("Archer", new Walk(), new Archer()),
				new Character("Monster", new Jump(), new Ax())
		};
		for (var character : characters) {
			System.out.println(character.getName());
			character.move();
			character.attack();
			System.out.println(character);
		}
        // Change the character's move behavior at runtime
        characters[0].setMoveBehavior(new Walk());
        characters[0].move();
        characters[0].attack();
        System.out.println(characters[0]);
	}
}
