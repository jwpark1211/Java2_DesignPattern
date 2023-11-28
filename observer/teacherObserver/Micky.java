package teacherObserver;

public class Micky implements Student {
    
    @Override
    public void update(String msg) {
        System.out.println("Micky received: "+ msg);
    }
    
}
