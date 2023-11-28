package teacherObserver;

import java.util.ArrayList;
import java.util.List;

public class TennisTeacher implements Teacher{
    private List<Student> students = new ArrayList<>();

    @Override
    public void subscribe(Student s) {
        students.add(s);
    }

    @Override
    public void unSubscribe(Student s) {
        students.remove(s);
    }

    @Override
    public void notifyStudents(String msg) {
       students.forEach(s->s.update(msg));
    }

    public void play(){
        System.out.println("TennisTeacher - regular tennis course");
        notifyStudents("regular tennis course");
    }

    public void match(){
        System.out.println("TennisTeacher - tennis match");
        notifyStudents("tennis match");
    }
    
}
