package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;
import template.PeriodicElementImporter;

/*LAB5, Park jeongwoon, 32201817, 2023.10.30 */
public class MainTest {
    //phase -> Class 
    public static Class<?> getClass(Phase phase){ 
        switch (phase) {
            case gas: 
                return GasElement.class;
            case liq: 
                return LiquidElement.class;
            case solid: 
                return SolidElement.class;
            case artificial: 
                return ArtificialElement.class;
            default:
                return Object.class;
        }
    }

    public static void MainTest(){
        //import List<PeriodicElement> from CSV 
        List<PeriodicElement> list = PeriodicElementImporter.loadCSV("PeriodicElements.csv");

        // create list of Element using PhaseElementFactory
        List<Element> elementList = new ArrayList<>();
        //Factory Method의 getInstance를 이용해 PeriodicElement -> Element(number, name, symbol, weight, phase)
        for(PeriodicElement pe : list){
            Element e = PhaseElementFactory.getInstance(
                pe.getNumber(), pe.getName(), pe.getSymbol(), pe.getMass(), Phase.valueOf(pe.getPhase()));
            elementList.add(e);
        }

        //UserInput을 통해 받아온 값으로 Phase init
        Phase phase= Phase.valueOf(UserInput.getString());

        //phase에 해당하는 element List 생성 
        Element[] found = elementList.stream().filter(e -> e. 
            getClass().equals(getClass(phase))).toArray(Element[]::new); 
        
        //List found의 element.name 출력 
        for(Element e : found){
            System.out.println("name: "+ e.getName());
        }
    }
}
