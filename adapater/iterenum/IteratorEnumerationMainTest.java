package iterenum;

import java.util.*;

public class IteratorEnumerationMainTest {
	public IteratorEnumerationMainTest() {
		String[] names = { "Seoul", "Busan", "Incheon", "Ulsan", "Daejeon" };
		Vector<String> v = new Vector<String>(Arrays.asList(names));
		Enumeration<String> enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		System.out.println();
		Iterator<String> iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
