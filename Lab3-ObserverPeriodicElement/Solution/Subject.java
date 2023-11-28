package Solution;

import Solution.Listener.PeriodicTableListener;

public interface Subject {
    //Listener 추가
    void addListener(PeriodicTableListener listener);
    //Listener 삭제
    void removeListener(PeriodicTableListener listener);
    //Listener들에게 update 전달
    void notifyListeners();
}
