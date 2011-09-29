package charts;

import entities.Statistics;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChartL extends JFrame{
    LinkedList<Statistics> stats;
    
    public BarChartL(String appTitle, String chartTitle, 
            LinkedList<Statistics> stats){
        super(appTitle);
        this.stats = stats;
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new java.awt.Dimension(600, 500));
        setContentPane(panel);
        try{
            ChartUtilities.saveChartAsPNG(new File("charts/lchart.png"), chart,
                    600, 500);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private CategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Iterator<Statistics> statIt = stats.iterator();
        Statistics inStat = null;
        while(statIt.hasNext()){
            inStat = statIt.next();
            dataset.addValue(inStat.getl(), "λ",
                    inStat.getFlightCode());
        }
        return dataset;
    }
        private JFreeChart createChart(CategoryDataset dataset, String chartTitle){
            JFreeChart chart = ChartFactory.createBarChart3D(chartTitle, "Μέσος"
                    + " Ρυθμός Αφίξεων (λ)",
                    "Αφίξεις/ώρα", dataset, PlotOrientation.VERTICAL, true, true, false);
            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setForegroundAlpha(0.6f);
            NumberAxis3D axisRange = (NumberAxis3D) plot.getRangeAxis();
            axisRange.setStandardTickUnits(NumberAxis3D.createIntegerTickUnits());
            
            CategoryAxis3D domainAxis = (CategoryAxis3D) plot.getDomainAxis();
            domainAxis.setCategoryLabelPositions(
                    CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0));
            
            return chart;
        }
    }
