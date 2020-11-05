package midterm;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class BarChart implements Observers{

    @Override
    public boolean update(Subject graph) throws IOException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Point point: graph.getData()){
            dataset.setValue(point.getValue(),point.getIndex(),"");
        }
        JFreeChart graphBarChart = ChartFactory.createBarChart(
                "GraphBarChart","Index","Value",dataset,
                PlotOrientation.HORIZONTAL,true,true,false);
        File f = new File("PNGBarChart.png");
        BufferedImage barImage = graphBarChart.createBufferedImage(600,400,null);
        ImageIO.write(barImage,"png",f);
        return f.exists();
    }
}
