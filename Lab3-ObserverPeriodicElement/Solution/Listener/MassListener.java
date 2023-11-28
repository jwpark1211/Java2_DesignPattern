package Solution.Listener;

import template.PeriodicElement;

public class MassListener implements PeriodicTableListener{
    int mass = 0;
    public MassListener(int mass) { this.mass = mass; }
    @Override
    public void update(PeriodicElement e) {
        //e의 weight과 MassListener의 weight값이 같으면 출력 
        if(e.getWeight() > (double)this.mass){
            System.out.println("# MassListener [ Weight : over "+ mass +" ]");
        }
    }
}
