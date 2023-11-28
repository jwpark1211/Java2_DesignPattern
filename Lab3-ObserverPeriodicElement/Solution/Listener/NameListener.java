package Solution.Listener;

import template.PeriodicElement;

public class NameListener implements PeriodicTableListener{
    String name = "";
    public NameListener(String name) { this.name = name; }
    @Override
    public void update(PeriodicElement e) {
        //e의 name과 NameListener의 name값이 같으면 출력 
        if(e.getName() == this.name){
            System.out.println("# NameListener [ Name : "+ name+" ]");
        }
    }
}

