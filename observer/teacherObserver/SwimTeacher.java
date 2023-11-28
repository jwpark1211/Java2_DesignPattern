package teacherObserver;

import java.util.ArrayList;
import java.util.List;

public class SwimTeacher implements Teacher {

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

    public void swim(){
        System.out.println("SwimTeacher - free swim");
        notifyStudents("regular swimming course");
    }

    public void lesson(){
        System.out.println("SwimTeacher - swimming lesson~~");
        notifyStudents("swimming match");
    }
   
}
