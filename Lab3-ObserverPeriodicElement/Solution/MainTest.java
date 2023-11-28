package Solution;

import java.util.List;

import Solution.Listener.GroupListener;
import Solution.Listener.MassListener;
import Solution.Listener.NameListener;
import Solution.Listener.NumberListener;
import Solution.Listener.PeriodListener;
import Solution.Listener.PeriodicTableListener;
import Solution.Listener.PhaseListener;
import Solution.Listener.SymbolListener;
import template.PeriodicElement;
import template.PeriodicElementImporter;
import template.Phase;

// Jeong woon Park (Lab3, Dankook University, Department of Software) 2023/09/28
public class MainTest {
    public MainTest() {
        // load
		List<PeriodicElement> list = PeriodicElementImporter.loadCSV("PeriodicElements.csv");
		//System.out.println("\nlist all");
		//list.forEach(System.out::println);
		
		// Create the periodic table 
		PeriodicTable periodicTable = new PeriodicTable();

		// Add the observer to the periodic table
		System.out.print("GroupListener: Please enter [group#] of PeriodicTable to be updated[1~18]: ");
        //group(1~18) 값 랜덤하게 입력 후 periodicTable에 추가
		int group = UserInput.getIntegerBetween(1, 18);
		System.out.println(group);
        PeriodicTableListener groupListner = new GroupListener(group);
        periodicTable.addListener(groupListner);

        System.out.print("NameListener: Please enter [name#] of PeriodicTable to be updated: ");
        //name 값 랜덤하게 입력 후 periodicTable에 추가
		String name = UserInput.getPeriodicElementName(list);
		System.out.println(name);
        PeriodicTableListener nameListner = new NameListener(name);
        periodicTable.addListener(nameListner);
		
        System.out.print("NumberListener: Please enter [number#] of PeriodicTable to be updated[1~118]: ");
        //number(1~118) 값 랜덤하게 입력 후 periodicTable에 추가
        int number = UserInput.getIntegerBetween(1, 118);
        System.out.println(number);
        PeriodicTableListener numberListener = new NumberListener(number);
        periodicTable.addListener(numberListener);

        System.out.print("PeriodListener: Please enter [period#] of PeriodicTable to be updated[1~7]: ");
        //period(1~7) 값 랜덤하게 입력 후 periodicTable에 추가
        int period = UserInput.getIntegerBetween(1, 7);
        System.out.println(period);
        PeriodicTableListener periodListener = new PeriodListener(period);
        periodicTable.addListener(periodListener);

        System.out.print("SymbolListener: Please enter [symbol#] of PeriodicTable to be updated: ");
        //symbol 값 랜덤하게 입력 후 periodicTable에 추가
        String symbol = UserInput.getPeriodicElementSymbol(list);
        System.out.println(symbol);
        PeriodicTableListener symbolListener = new SymbolListener(symbol);
        periodicTable.addListener(symbolListener);

        System.out.print("PhaseListener: Please enter [phase#] of PeriodicTable to be updated: ");
        //phase 값 랜덤하게 입력 후 periodicTable에 추가
        Phase phase = UserInput.getPeriodicElementPhase();
        System.out.println(phase);
        PeriodicTableListener phaseListener = new PhaseListener(phase);
        periodicTable.addListener(phaseListener);

        System.out.print("AtomicMassListener: Please enter [atomic mass#] of PeriodicTable to be updated: ");
        //atomicMass(50~200) 값 랜덤하게 입력 후 periodicTable에 추가
        int atomicMass = UserInput.getIntegerBetween(50, 200);
        System.out.println(atomicMass);
        PeriodicTableListener massListener = new MassListener(atomicMass);
        periodicTable.addListener(massListener);


        // Add elements to the periodic table every 1 second
        System.out.println();
        for (PeriodicElement pe : list) {
            //해당 pe 정보 출력 
            System.out.println(pe.toString());
            //1초 sleep -> exception
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //periodicTable에 element 추가 
            periodicTable.addElement(pe);
            System.out.println();
        } 

        // removeListener …*/
        periodicTable.removeListener(groupListner);
        periodicTable.removeListener(nameListner);
        periodicTable.removeListener(numberListener);
        periodicTable.removeListener(periodListener);
        periodicTable.removeListener(phaseListener);
        periodicTable.removeListener(symbolListener);
        periodicTable.removeListener(massListener);
    }
}
