package acfarmsystemv2.telaDeInicio;

import producao.*;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class JInternalFrameGraficoProducao extends javax.swing.JInternalFrame {

    public JInternalFrameGraficoProducao() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Grafico");
        setSize(720, 300);

        setVisible(true);

        criarGraficoBarras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(590, 340));

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

    public void criarGraficoBarras() {

        DefaultCategoryDataset barra = new DefaultCategoryDataset();

        ControleProducao controleProducao = new ControleProducao();

        for (Producao p : controleProducao.buscarTodasAsProducoes()) {
            barra.setValue(p.getQuantidadeProduzidaEmSacos(), p.getNomeProducao(), "");
        }

        // Grafico 3D
        JFreeChart grafico = ChartFactory.createBarChart3D("Sacas por producão", "Produção", "Sacas", barra, PlotOrientation.VERTICAL, true, true , false);
        //JFreeChart grafico = ChartFactory.createBarChart3D("Sacas por producão", "Produção", "Sacas", barra, PlotOrientation.HORIZONTAL, true, true, false);

        ChartPanel painel = new ChartPanel(grafico);

        // Mudar cor da barra
        CategoryPlot barraItem = grafico.getCategoryPlot();

        //                                                            Barra,  Cor
        barraItem.getRenderer().setSeriesPaint(0, Color.cyan);

        add(painel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
