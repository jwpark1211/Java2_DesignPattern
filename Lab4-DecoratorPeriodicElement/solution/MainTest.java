package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;
import template.PeriodicElementImporter;

// Jeong woon Park (Lab4, Dankook University, Department of Software) 2023/10/15
public class MainTest {
   public MainTest(){
        //csv 파일에서 데이터 load 후 출력 
        List<PeriodicElement> list = 
            PeriodicElementImporter.loadCSV("PeriodicElements.csv");

        /*List<PeriodicElement> -> List<Element> 생성 
        -> List<IElement> 생성 -> Elements.csv 생성*/
        List<Element> elementList = new ArrayList<>();
        List<IElement> Ielement1List = new ArrayList<>();
        List<IElement> Ielement2List = new ArrayList<>();
        for(PeriodicElement e : list){
            Element element = new Element(e.getNumber(), e.getName());
            elementList.add(element);
            //Elements1 List 생성
            IElement iElement1 = element; 
            //IElement 객체 생성 후 데코레이터 패턴을 이용하여 차례로 감싼다.
            iElement1 = new WeightDecorator(e.getMass(),iElement1);
            iElement1 = new SymbolDecorator(e.getSymbol(),iElement1);
            Ielement1List.add(iElement1);

            //Elements2 List 생성
            IElement iElement2 = element;
            //IElement 객체 생성 후 데코레이터 패턴을 이용하여 차례로 감싼다. 
            iElement2 = new SymbolDecorator(e.getSymbol(), iElement2);
            iElement2 = new WeightDecorator(e.getMass(),iElement2);
            iElement2 = new PeriodDecorator(e.getPeriod(), iElement2);
            iElement2 = new GroupDecorator(e.getGroup(), iElement2);
            iElement2 = new PhaseDecorator(e.getPhase(), iElement2);
            iElement2 = new TypeDecorator(e.getType(),iElement2);
            Ielement2List.add(iElement2);
        }
        //Elements1.csv 생성
        PeriodicElementImporter.saveElementsCSV(Ielement1List,
                 "Elements1","#AtomicNumber,Element,AtomicMass,Symbol");
        //Elements2.csv 생성
        PeriodicElementImporter.saveElementsCSV(Ielement2List, "Elements2",
                 "#AtomicNumber,Element,Symbol,AtomicMass,Period,Group,Phase,Type");
   }
}
