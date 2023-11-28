package SRP;

public class MainTest {
	// SRP - Single Responsibility Principle
	// 각 클래스는 단 한 개의 책임을 가져야 한다.
	// 클래스의 변경하는 이유는 단 한 개여야 한다.
	public MainTest() {
		// SRP violation
		System.out.println("SRP violation");
		BookManager manager = new BookManager();
		manager.loadFromFile(); // SRP violation
		manager.show();
		manager.loadFromDB(); // SRP violation
		manager.show();

		// SRP 
		//SRP violation과 다르게 SRP로 하면 loader, viewer등에 각자 책임을 부여하게 구현 
		// Loader와 Viewer는 abstract class와 interface로 구현 
		//SRP violation에서는 book manager가 모든 것을 담당한다. (책임이 분리되지 않음)
		System.out.println("SRP");
		BookManager2 manager2 = new BookManager2();
		manager2.setLoader(new BookDataLoaderFromFile2());
		manager2.setViewer(new BookDataViewerConsole2());
		manager2.load();
		manager2.show();
		manager2.setLoader(new BookDataLoaderFromDB2());
		manager2.load();
		manager2.show();
	}

}
