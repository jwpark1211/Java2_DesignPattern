package teacherObserver;

//subject
public interface Teacher {
    void subscribe(Student s);
    void unSubscribe(Student s);
    void notifyStudents(String msg);
}
