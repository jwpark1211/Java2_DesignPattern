package solution;

import java.util.HashMap;
import java.util.Map;

public class FinderCommandDatabase {
    //command class들을 이름별로 저장 
    private Map<String, IFinderCommand> commands = new HashMap<>();

    //command class 추가 
    public void addCommand(String name, IFinderCommand command){
        commands.put(name, command);
    }

    //command return
    public IFinderCommand getCommand(String name){
        return commands.get(name);
    }
}
