package solution;

import template.PeriodicElement;

public class Compound {
    private PeriodicElement PeriodicElement; 
    private int count;

    /* constructor */
    public Compound(PeriodicElement periodicElement, int count) {
        this.PeriodicElement = periodicElement;
        this.count = count;
    }
    /* getter & setter */
    public PeriodicElement getPeriodicElement() {
        return PeriodicElement;
    }
    public void setPeriodicElement(PeriodicElement periodicElement) {
        this.PeriodicElement = periodicElement;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    /* toString */
    @Override
    public String toString() {
        return "Compound{" +
                "count='" + count + '\'' +
                ", name='" + PeriodicElement.getName() + '\'' +
                '}';
    }
}

