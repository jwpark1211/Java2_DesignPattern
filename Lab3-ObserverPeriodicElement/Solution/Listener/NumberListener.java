package Solution.Listener;

import template.PeriodicElement;

public class NumberListener implements PeriodicTableListener{
    int number = 0;
    public NumberListener(int number) { this.number = number; }
    @Override
    public void update(PeriodicElement e) {
        //e의 number과 NumberListener의 number값이 같으면 출력 
        if(e.getNumber() == this.number){
            System.out.println("# NumberListener [ Number : "+ number+" ]");
        }
    }
}

