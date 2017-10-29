
package interfacegrafica;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import opencv.ExtratorImagem;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author Alexandre
 */
public class Preditor extends javax.swing.JFrame {
    
    //Classe do WEKA que armaena a base de dados
    private Instances instancias;
    
    public Preditor() {
        initComponents();
    }
    
    public void classificaNaiveBayes() throws Exception{
        NaiveBayes nb = new NaiveBayes();
        //Cração da tabela de probabilidade
        nb.buildClassifier(instancias);
        
        //Criação de novo registro
        Instance novo = new DenseInstance(instancias.numAttributes());
        novo.setDataset(instancias);
        novo.setValue(0, Float.parseFloat(lblLaranjaBart.getText()));
        novo.setValue(1, Float.parseFloat(lblAzulCalcao.getText()));
        novo.setValue(2, Float.parseFloat(lblAzulSapato.getText()));
        novo.setValue(3, Float.parseFloat(lblMarromHomer.getText()));
        novo.setValue(4, Float.parseFloat(lblAzulHomer.getText()));
        novo.setValue(5, Float.parseFloat(lblSapatoHomer.getText()));
        
        //Previsão
        double resultado[] = nb.distributionForInstance(novo);//Distribuiçao da probabilidade da instancia passada como parâmetro
        DecimalFormat df = new DecimalFormat("#,###.000");
        lblNaiveBart.setText("Bart: "+ df.format(resultado[0]));
        lblNaiveHomer.setText("Homer: "+ df.format(resultado[1]));
    }
    
    public void carregaWeka()throws Exception{
        //Caminho da base de dados
        DataSource ds = new DataSource("C:\\udemy\\machineLearningWeka\\caracteristicas.arff");
        //Atribui a base de dados para instancias
        instancias = ds.getDataSet();
        instancias.setClassIndex(6);
        //System.out.println(instancias.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSelecionarImagem = new javax.swing.JButton();
        txtCaminhoImagem = new javax.swing.JTextField();
        lblImagem = new javax.swing.JLabel();
        btnExtraiCaracteristicas = new javax.swing.JButton();
        lblCaracteristicasBart = new javax.swing.JLabel();
        lblCaracteristicasHomer = new javax.swing.JLabel();
        lblLaranjaBart = new javax.swing.JLabel();
        lblAzulCalcao = new javax.swing.JLabel();
        lblAzulSapato = new javax.swing.JLabel();
        lblAzulHomer = new javax.swing.JLabel();
        lblMarromHomer = new javax.swing.JLabel();
        lblSapatoHomer = new javax.swing.JLabel();
        btnClassificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNaiveBart = new javax.swing.JLabel();
        lblNaiveHomer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSelecionarImagem.setText("Selecionar Imagem");
        btnSelecionarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarImagemActionPerformed(evt);
            }
        });

        lblImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnExtraiCaracteristicas.setText("Extrair Características");
        btnExtraiCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtraiCaracteristicasActionPerformed(evt);
            }
        });

        lblCaracteristicasBart.setText("Características do Bart");

        lblCaracteristicasHomer.setText("Características do Homer");

        lblLaranjaBart.setText("jLabel1");

        lblAzulCalcao.setText("jLabel2");

        lblAzulSapato.setText("jLabel3");

        lblAzulHomer.setText("jLabel4");

        lblMarromHomer.setText("jLabel5");

        lblSapatoHomer.setText("jLabel6");

        btnClassificar.setText("Classificar");
        btnClassificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificarActionPerformed(evt);
            }
        });

        jLabel1.setText("Naive Bayes");

        lblNaiveBart.setText("Bart:");

        lblNaiveHomer.setText("Homer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSelecionarImagem)
                        .addGap(18, 18, 18)
                        .addComponent(txtCaminhoImagem))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnExtraiCaracteristicas)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(lblCaracteristicasBart, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(77, 77, 77))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLaranjaBart)
                                            .addComponent(lblAzulCalcao)
                                            .addComponent(lblAzulSapato))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCaracteristicasHomer)
                                    .addComponent(lblAzulHomer)
                                    .addComponent(lblMarromHomer)
                                    .addComponent(lblSapatoHomer)
                                    .addComponent(btnClassificar))
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNaiveBart)
                                    .addComponent(jLabel1)
                                    .addComponent(lblNaiveHomer))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionarImagem)
                    .addComponent(txtCaminhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExtraiCaracteristicas)
                            .addComponent(btnClassificar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCaracteristicasBart)
                            .addComponent(lblCaracteristicasHomer))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLaranjaBart)
                            .addComponent(lblAzulHomer))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAzulCalcao)
                            .addComponent(lblMarromHomer))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAzulSapato)
                            .addComponent(lblSapatoHomer))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNaiveBart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNaiveHomer)))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarImagemActionPerformed
        
        JFileChooser fc = new JFileChooser();        
        int retorno = fc.showDialog(this, "Selecione a imagem"); 
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            File arquivo = fc.getSelectedFile();
            txtCaminhoImagem.setText(arquivo.getAbsolutePath());
            
            BufferedImage imageBmp = null;
            try {
                imageBmp = ImageIO.read(arquivo);
            } catch (IOException ex) {
                Logger.getLogger(Preditor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ImageIcon imagemLabel = new ImageIcon(imageBmp);
            lblImagem.setIcon(new ImageIcon
                (imagemLabel.getImage()
                        .getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_DEFAULT)));
        }
        
    }//GEN-LAST:event_btnSelecionarImagemActionPerformed

    private void btnExtraiCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraiCaracteristicasActionPerformed
    
        ExtratorImagem extrator = new ExtratorImagem();
        float[] caracteristicas = extrator.extrairCaracteristicas(txtCaminhoImagem.getText());//Recebe o retorno do método da classe ExtratorCaracteristicas
        lblLaranjaBart.setText(String.valueOf(caracteristicas[0]));
        lblAzulCalcao.setText(String.valueOf(caracteristicas[1]));
        lblAzulSapato.setText(String.valueOf(caracteristicas[2]));
        lblAzulHomer.setText(String.valueOf(caracteristicas[3]));
        lblMarromHomer.setText(String.valueOf(caracteristicas[4]));
        lblSapatoHomer.setText(String.valueOf(caracteristicas[5]));
    }//GEN-LAST:event_btnExtraiCaracteristicasActionPerformed

    private void btnClassificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificarActionPerformed
        try {
            carregaWeka();
            classificaNaiveBayes();
        } catch (Exception ex) {
            Logger.getLogger(Preditor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClassificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Preditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClassificar;
    private javax.swing.JButton btnExtraiCaracteristicas;
    private javax.swing.JButton btnSelecionarImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAzulCalcao;
    private javax.swing.JLabel lblAzulHomer;
    private javax.swing.JLabel lblAzulSapato;
    private javax.swing.JLabel lblCaracteristicasBart;
    private javax.swing.JLabel lblCaracteristicasHomer;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblLaranjaBart;
    private javax.swing.JLabel lblMarromHomer;
    private javax.swing.JLabel lblNaiveBart;
    private javax.swing.JLabel lblNaiveHomer;
    private javax.swing.JLabel lblSapatoHomer;
    private javax.swing.JTextField txtCaminhoImagem;
    // End of variables declaration//GEN-END:variables
}
