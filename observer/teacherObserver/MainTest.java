package teacherObserver;

public class MainTest {
    public MainTest(){
        // 2 teachers and 3 students
        TennisTeacher jason = new TennisTeacher();
        SwimTeacher andy = new SwimTeacher();
        Student tom = new Tom();
        Student micky = new Micky();
        Student jerry = new Jerry();

        jason.subscribe(tom);
        jason.subscribe(jerry);
        jason.subscribe(micky);
        jason.match();
        jason.unSubscribe(jerry);
        jason.play();

        andy.subscribe(micky);
        andy.swim();
    }
}
