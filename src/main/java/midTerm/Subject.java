package midTerm;

import java.util.ArrayList;
import java.util.List;

public class Subject extends Observable{
    public List<Point> data;
    public Subject(){
        data = new ArrayList<Point>();
    }
    public void add(String first, Integer value){
        Point dataPoint = new Point(value, first);
        data.add(dataPoint);
        notifyAllObservable();
    }
    public void remove(String first){
        if(data.isEmpty()) return;
        data.removeIf(point -> point.getIndex().equals(first));
        notifyAllObservable();
    }

}