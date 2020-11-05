package midTerm;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    public List<Observers> observersList = new ArrayList<Observers>();
    public void remove(Observers observer){
        observersList.remove(observer);
    }

    public void attach(Observers observer){
        observersList.add(observer);
    }

    public void notifyAllObservable(){
        for(Observers observers: observersList)
            observers.update();
    }
}
