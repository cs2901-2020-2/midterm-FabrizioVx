package midterm;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PieChart implements Observers {

    @Override
    public boolean update(Subject graph) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for(Point point: graph.getData()){
            dataset.setValue(point.getIndex(),point.getValue());
        }
        JFreeChart graphPieChart = ChartFactory.createPieChart(
                "GraphPieChart",dataset, true,true,false);
        File f = new File("PNGPieChart.png");
        BufferedImage pieImage = graphPieChart.createBufferedImage(600,400,null);
        try {
            ImageIO.write(pieImage,"png",f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return f.exists();
    }
}
