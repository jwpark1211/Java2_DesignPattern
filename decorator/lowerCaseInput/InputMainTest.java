package lowerCaseInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputMainTest {

	public InputMainTest() throws IOException {
		//FileInputStream을 BufferedInputStream에, 그리고 이것을 LowerCaseInputStream에 넣었다는 점이 중요하다.
		//이를 통하여 InputStream이 Decorator 패턴을 구현하였다는 점을 확인할 수 있다. 
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
		int c = 0;
		while ((c = in.read()) >= 0 ) {
			System.out.print((char)c);
		}
		System.out.println();
		in.close();
	}

}
