package VendaDeProducao;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class JInternalFrameGraficoFinaceiro extends javax.swing.JInternalFrame {

    public JInternalFrameGraficoFinaceiro() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Grafico");
        setSize(630, 530);

        setVisible(true);

        criarGraficoBarras();
        //criarGraficoDeLinhas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     public void criarGraficoBarras(){
        
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        
        ControleVendaProducao controleVendaProducao = new ControleVendaProducao();

        for (VendaProducao p : controleVendaProducao.buscarTodasAsVenda()) {
            barra.setValue(p.getValorTotalVenda(), p.getNomeProducao(), "");
        }

        // Grafico 3D
        JFreeChart grafico = ChartFactory.createBarChart3D("Vendas de Produções", "Produção", "Valor", barra, PlotOrientation.VERTICAL, true, true , false);
        ChartPanel painel = new ChartPanel(grafico);
        
        // Mudar cor da barra
        CategoryPlot barraItem = grafico.getCategoryPlot();
        
        //                                                            Barra,  Cor
        barraItem.getRenderer().setSeriesPaint(0, Color.cyan);
        
        add(painel);
    }
     
    /*
    public void criarGraficoDeLinhas() {
        
        ControleVendaProducao controleVendaProducao = new ControleVendaProducao();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (VendaProducao p : controleVendaProducao.buscarTodasAsVenda()) {
            dataset.addValue(p.getValorTotalVenda(), p.getNomeProducao(), "");
        }

        JFreeChart chart = ChartFactory.createLineChart("Line Chart Example", "Category", "Value", dataset);

        ChartPanel painel = new ChartPanel(chart);
        add(painel);
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
