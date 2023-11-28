package solution;

import java.util.List;

import template.PeriodicElement;

public interface IFinderCommand {
    //실행
    List<PeriodicElement> execute(List<PeriodicElement> list);
    //실행 취소
    List<PeriodicElement> undo();
}
