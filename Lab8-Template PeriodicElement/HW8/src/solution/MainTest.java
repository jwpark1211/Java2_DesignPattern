package solution;

import java.util.Arrays;
import java.util.List;

import template.PeriodicElement;
import template.PeriodicElementImporter;

// Park Jeong woon (Lab8, Dankook University, Department of Software) 2023/11/27
public class MainTest {
    public static void Main(){
        //csv로부터 PeriodicElement List 추출 
        List<PeriodicElement> list = PeriodicElementImporter.loadCSV("PeriodicElements.csv");
        //list.forEach(System.out::println);
        // find PE by number, name, symbol, weight, period, group, phase, type
        System.out.println("\n** PeriodicElement **");
        //Finders 정리
        List<AbstractFinder<PeriodicElement>> finders = Arrays.asList(
            new NumberFinder(), new NameFinder(), new SymbolFinder(), new WeightFinder(),
            new PeriodFinder(), new GroupFinder(), new PhaseFinder(), new TypeFinder());
        for (var finder : finders) {
            //input 받고 조건 일치하는 원소 List 출력
            String input = finder.getUserInput();
            System.out.println("You entered: " + input);
            List<PeriodicElement> found = finder.find(list);
            found.forEach(System.out::println);
        }
        System.out.println("\n\n");

        System.out.println("** ChemicalCompound **");
        //json으로부터 ChemicalCompound List 추출
        List<ChemicalCompound> list2 = ChemicalCompoundJSONImporter
            .importFile("ChemicalCompounds.json");
        //list2.forEach(System.out::println);
        // find CC by name, symbol, weight, phase, element (using symbol)
        //finders 정리 
        List<AbstractFinder<ChemicalCompound>> finders2 = Arrays.asList(
            new ChemicalCompoundNameFinder(), new ChemicalCompoundSymbolFinder(),
            new ChemicalCompoundWeightFinder(), new ChemicalCompoundPhaseFinder(),
            new ChemicalCompoundElementFinder());
        for (var finder2 : finders2) {
            //input 받고 조건 일치하는 원소 List 출력
            String input2 = finder2.getUserInput();
            System.out.println("You entered: " + input2);
            List<ChemicalCompound> found2 = finder2.find(list2);
            found2.forEach(System.out::println);
        }
    }
}
