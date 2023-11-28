package solution;

import java.util.List;
import java.util.Stack;

import template.PeriodicElement;

public class FinderInvoker {
    //IFinderCommand
    private IFinderCommand command;
    //undo를 위한 stack 
    private Stack<IFinderCommand> stack = new Stack<>();

    //Command 지정 -> stack에 추가 
    public void setCommand(IFinderCommand command){
        this.command = command;
        stack.push(command);
    }

    //command 실행
    public List<PeriodicElement> execute (List<PeriodicElement> list){
        return command.execute(list);
    }

    //이전 상태로 되돌리기 -> stack에서 command pop 후 command.undo();
    public List<PeriodicElement> undo(){
        if(stack.empty()) return null;
        stack.pop();
        return command.undo();
    }
}
