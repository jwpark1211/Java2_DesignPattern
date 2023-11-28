package solution;

import java.util.List;

import template.PeriodicElement;

public abstract class FinderCommand implements IFinderCommand{
    //이전 상태의 Elements
    protected List<PeriodicElement> prevElements;

    @Override
    public List<PeriodicElement> undo(){
        //이전 상태를 return 
        return prevElements;
    }
}
