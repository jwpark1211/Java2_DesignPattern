package Solution;

import java.util.ArrayList;
import java.util.List;

import Solution.Listener.PeriodicTableListener;
import template.PeriodicElement;

public class PeriodicTable implements Subject{
    private List<PeriodicTableListener> listeners = new ArrayList<>();
    private PeriodicElement e;
    //element가 입력되면 Listener들에게 notify
    public void addElement(PeriodicElement element){
        this.e = element;
        notifyListeners();
    }
    //subscribe
    @Override
    public void addListener(PeriodicTableListener listener) { listeners.add(listener); }
    //unSubscribe
    @Override
    public void removeListener(PeriodicTableListener listener) { listeners.remove(listener); }
    //notify to Listeners
    @Override
    public void notifyListeners() {
        for(PeriodicTableListener listener : listeners){
            listener.update(e);
        }
    }
}
