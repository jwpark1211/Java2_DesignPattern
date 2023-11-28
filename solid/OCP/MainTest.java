package OCP;

public class MainTest {
	// OCP - Open Close Principle
	// 확장에는 열려 있고, 변경에는 닫혀 있다.
	// 기존코드를 변경하지 않으면서(closed), 기능을 추가할 수 있도록(open) 설계되어야한다.
	public MainTest() {
		// OCP violation
		//다형성이 적용되지 않은 예시 -> 새로운 door가 생기면 else if문이 추가되어야 한다. 
		System.out.println("version1 - ifelseif");
		Door[] doors = {new PushDoor(), new AutomaticDoor(), new KnobDoor(), new SlidingDoor() };
		for (Door door : doors) {
			if (door instanceof AutomaticDoor) {
				((AutomaticDoor)door).pressOpen();
			} else if (door instanceof KnobDoor) {
				((KnobDoor)door).twistOpen();
			} else if (door instanceof SlidingDoor) {
				((SlidingDoor)door).slideOpen();
			} else if (door instanceof PushDoor) {
				((PushDoor)door).pushOpen();
			}	
		}
		
		// OCP
		System.out.println("\nversion2 - polymorphism");
		for (Door door : doors) {
			door.open();
		}
	}

}
