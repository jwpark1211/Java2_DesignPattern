package teacherObserver;

import java.util.ArrayList;
import java.util.List;

public class Tom implements Student{

    @Override
    public void update(String msg) {
        System.out.println("Tom received: "+ msg);
    }
    
}
