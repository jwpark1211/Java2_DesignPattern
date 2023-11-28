package solution;

import java.util.List;

import template.PeriodicElement;
import template.PeriodicElementImporter;

// Jeong woon Park (Lab2, Dankook University, Department of Software) 2023/09/21
public class MainTest {
    //IPeriodicElementFinder를 상속받은 하위 객체들의 모음
    private IPeriodicElementFinder[] finders = {
        new NumberFinder(), new NameFinder(), new GroupFinder(), 
        new PeriodFinder(), new SymbolFinder()};

   public MainTest(){
        //csv 파일에서 데이터 load 후 출력 
        List<PeriodicElement> list = 
            PeriodicElementImporter.loadCSV("PeriodicElements.csv");
        System.out.println("\nlist all");
        list.forEach(System.out::println);
        System.out.println("\n");
        
        //finders의 find 메소드를 순차적으로 출력 
        System.out.println("------------ find PeriodicElement ------------\n");
        for(IPeriodicElementFinder finder: finders){
            PeriodicElementFinder f = new PeriodicElementFinder(finder);
            f.find(list);
        }
    }
}
