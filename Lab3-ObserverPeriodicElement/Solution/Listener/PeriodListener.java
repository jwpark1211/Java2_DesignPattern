package Solution.Listener;

import template.PeriodicElement;

public class PeriodListener implements PeriodicTableListener{
    int period = 0;
    public PeriodListener(int period) { this.period = period; }
    @Override
    public void update(PeriodicElement e) {
        //e의 period과 periodListener의 period값이 같으면 출력 
        if(e.getPeriod() == this.period){
            System.out.println("# PeriodListener [ Period : "+ period +" ]");
        }
    }
}

