package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;
import template.PeriodicElementImporter;

// Jeong woon Park (Lab6, Dankook University, Department of Software) 2023/11/12
public class MainTest {
    public static List<PeriodicElement> deepcopy(List<PeriodicElement> list) {
        List<PeriodicElement> copy = new ArrayList<>(); 
        for (PeriodicElement e : list) {
            copy.add(e);
        }
        return copy;
    }
    
    public static void Run() {
        //csv에서 값 load
        List<PeriodicElement> list= PeriodicElementImporter.loadCSV("PeriodicElements.csv");
        UserInput userInput = new UserInput();

        // incremental finder database에 추가
        FinderCommandDatabase database = new FinderCommandDatabase();
        database.addCommand("number", new NumberFinderCommand());
        database.addCommand("group", new GroupFinderCommand());
        database.addCommand("phase",new PhaseFinderCommand());
        database.addCommand("name", new NameFinderCommand());
        database.addCommand("symbol", new SymbolFinderCommand());
        database.addCommand("period", new PeriodFinderCommand());
        database.addCommand("weight", new WeightFinderCommand());

        //foundlist 초기화
        List<PeriodicElement> foundList= deepcopy(list);
        String commandName = null; IFinderCommand command = null;

        // invoker class
        FinderInvoker invoker = new FinderInvoker();
        do {
            //어떤 command를 이용할 것인지 입력 받기 
            System.out.print("Please enter command [e.g. number|name|symbol|weight|period|group|phase]" 
            +"or [undo]: ");
            commandName = userInput.getString();
            command = database.getCommand(commandName); //database에서 해당 command 객체 리턴
            // undo가 입력되면foundList= invoker.undo()
            if(commandName.equals("undo")) {
                foundList = invoker.undo();
                // undo시 empty stack이라면foundList= null, 그러면다시deepcopy(list)
                if (foundList == null) foundList = deepcopy(list);
                //undo한 결과를 출력
                foundList.forEach(System.out::println);
            }else if(command != null){
                //command를 invoker에 세팅 후 실행 (출력)
                invoker.setCommand(command);
                foundList=invoker.execute(foundList);
                foundList.forEach(System.out::println);
            }
            //반복 여부 확인
        } while(userInput.getExitKey());
    }
}