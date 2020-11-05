package midTerm;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.data.general.DefaultPieDataset;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class BarChart implements Observers{

    @Override
    public void update(Subject graph) throws IOException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Point point: graph.getData()){
            dataset.addValue(point.getValue(),point.getIndex(),"");
        }
        JFreeChart graphBarChart = ChartFactory.createBarChart(
                "   GraphBarChart","Index","Value",dataset,
                PlotOrientation.HORIZONTAL,true,true,false);
        File f = new File("PNGBarChart.png");
        BufferedImage barImage = graphBarChart.createBufferedImage(600,400,null);
        ImageIO.write(barImage,"png",f);
    }
}
