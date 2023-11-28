package template;
import java.util.List;

// Kyoung Shin Park (Dankook University, Computer Engineering) 2023/09/01

public class MainTest {

	public MainTest() {
		
		// load
		List<PeriodicElement> list = PeriodicElementImporter.loadCSV("PeriodicElements.csv");
		System.out.println("\nlist all");
		list.forEach(System.out::println);
		
		// search by number, name, symbol, period, group, phase
		

		System.out.print("done..");
	}

}
