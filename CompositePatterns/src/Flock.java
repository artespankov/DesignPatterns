import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();
    Observable observable;

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    public void quack(){
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable duck = iterator.next();
            duck.quack();
        }
    }

    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable observable = iterator.next();
            observable.registerObserver(observer);
        }
    }

    public void notifyObservers() {
    }
}
