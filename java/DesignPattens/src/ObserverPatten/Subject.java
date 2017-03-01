package ObserverPatten;

/**
 * Created by machenfei on 2017/3/1.
 */
public interface Subject {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers();
}
