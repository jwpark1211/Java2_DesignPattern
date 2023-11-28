package teacherObserver;

import java.util.ArrayList;
import java.util.List;


public class Jerry implements Student {
    
    @Override
    public void update(String msg) {
        System.out.println("Jerry received: "+ msg);
    }
}
