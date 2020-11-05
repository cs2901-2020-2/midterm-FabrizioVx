import midterm.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
@Test
public class testchart {

    @Test
    public void testObservable() throws IOException {
        Subject subject = new Subject();
        Observable observable = new Observable();
        subject.add("hi",10);
        BarChart bargraph = new BarChart();
        observable.attach(bargraph);
        observable.remove(bargraph);
        observable.notifyAllObservable(subject);
        Assert.assertTrue(bargraph.update(subject));
    }

    @Test public void testPieChart() throws IOException {
        Subject subject = new Subject();
        Observable observable = new Observable();
        subject.add("hallo",66);
        PieChart bargraph = new PieChart();
        observable.attach(bargraph);
        observable.remove(bargraph);
        observable.notifyAllObservable(subject);
        boolean check = bargraph.update(subject);
        Assert.assertTrue(check);
    }

    @Test
    public void testCasePoint(){
        Point point = new Point(5,"index");
        int value = point.getValue();
        Assert.assertEquals(5, value);
        Assert.assertEquals("index",point.getIndex());
    }

    @Test
    public void testSubject(){
        Subject subject = new Subject();
        subject.add("val1",1);
        subject.add("val2",2);
        subject.add("val3",3);
        subject.add("val4",4);
        subject.remove("val1");
        subject.remove("val2");
        subject.remove("val3");
        subject.remove("val4");
        Assert.assertNotNull(subject.getData());
    }
}
