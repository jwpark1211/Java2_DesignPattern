package solution;

import java.util.List;

import template.PeriodicElement;

public class PeriodicElementFinder {
    //field
    private IPeriodicElementFinder finder = null;


    //constructor
    public PeriodicElementFinder(IPeriodicElementFinder finder) {
        this.finder = finder;
    }

    //method1 - setFinder()
    public void setFinder(IPeriodicElementFinder finder){
        this.finder = finder;
    }

    //method2 - find()
    public void find(List<PeriodicElement> list) {
        finder.find(list);
    }
}

