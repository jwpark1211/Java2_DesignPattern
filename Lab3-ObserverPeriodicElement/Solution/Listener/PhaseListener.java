package Solution.Listener;

import template.PeriodicElement;
import template.Phase;

public class PhaseListener implements PeriodicTableListener{
    Phase phase = null;
    public PhaseListener(Phase phase) { this.phase = phase; }
    @Override
    public void update(PeriodicElement e) {
        //e의 phase과 PhaseListener의 phase값이 같으면 출력 
        if(e.getPhase() == this.phase){
            System.out.println("# PhaseListener [ Phase : "+ phase +" ]");
        }
    }
}
