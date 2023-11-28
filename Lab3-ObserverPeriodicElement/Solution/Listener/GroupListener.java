package Solution.Listener;

import template.PeriodicElement;

public class GroupListener implements PeriodicTableListener{
    int group = 0;
    public GroupListener(int group) { this.group = group; }
    
    @Override
    public void update(PeriodicElement e) {
        //e의 group과 GroupListener의 group값이 같으면 출력 
        if(e.getGroup() == this.group){
            System.out.println("# GroupListener [ Group : "+ group+" ]");
        }
    }
}
