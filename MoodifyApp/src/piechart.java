/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu Mishra
 */

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class piechart extends ApplicationFrame {

    public piechart(String title,Double p,Double neg,Double neut) {
        super( title );
        DefaultPieDataset dataset = new DefaultPieDataset( );
        dataset.setValue( "Possitive" , p );
        dataset.setValue( "Negative" , neg );
        dataset.setValue( "Neutral" , neut );
        JFreeChart chart = ChartFactory.createPieChart(
                "Community Response ",   // chart title
                dataset,          // data
                true,             // include legend
                true,
                false);
        setContentPane(new ChartPanel( chart ));
    }

  /*  public static void main( String[ ] args ) {
        piechart demo = new piechart( "Community Response ",new Double(10 ),new Double(60),new Double(30));
        demo.setSize( 560 , 367 );
        RefineryUtilities.centerFrameOnScreen( demo );
        demo.setVisible( true );
    }*/
}