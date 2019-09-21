/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diuprac2;

import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class Practica2 extends javax.swing.JFrame {
    public int [][] mat = new int[10][10];
    /**
     * Creates new form Practica2
     */
    public Practica2() {
        initComponents();
        minVText.setToolTipText("Introduzca un valor numérico entero menor al máximo");
        maxVText.setToolTipText("Introduzca un valor numérico entero mayor al mínimo");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conPanel = new javax.swing.JPanel();
        minVText = new javax.swing.JTextField();
        maxVText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        barraDes = new javax.swing.JSlider();
        resPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración"));

        minVText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                minVTextFocusGained(evt);
            }
        });
        minVText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minVTextActionPerformed(evt);
            }
        });

        maxVText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                maxVTextFocusGained(evt);
            }
        });
        maxVText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxVTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Mínimo");

        jLabel2.setText("Máximo");

        barraDes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraDesStateChanged(evt);
            }
        });

        javax.swing.GroupLayout conPanelLayout = new javax.swing.GroupLayout(conPanel);
        conPanel.setLayout(conPanelLayout);
        conPanelLayout.setHorizontalGroup(
            conPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(87, 87, 87))
            .addGroup(conPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(conPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraDes, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                    .addGroup(conPanelLayout.createSequentialGroup()
                        .addComponent(minVText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maxVText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        conPanelLayout.setVerticalGroup(
            conPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(conPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minVText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxVText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(barraDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        resPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        areaTexto.setEditable(false);
        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        javax.swing.GroupLayout resPanelLayout = new javax.swing.GroupLayout(resPanel);
        resPanel.setLayout(resPanelLayout);
        resPanelLayout.setHorizontalGroup(
            resPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        resPanelLayout.setVerticalGroup(
            resPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Miguel Herrera Álvarez");

        jLabel3.setText("Víctor Herrera Delgado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(resPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minVTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minVTextActionPerformed
        // TODO add your handling code here:
        barraDes.requestFocus();
        recreaMatriz();
    }//GEN-LAST:event_minVTextActionPerformed

    private void maxVTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxVTextActionPerformed
        // TODO add your handling code here:
        barraDes.requestFocus();
        recreaMatriz();
            
    }//GEN-LAST:event_maxVTextActionPerformed

    private void barraDesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraDesStateChanged
        // TODO add your handling code here:
        if (valida()){
            actualizaMatriz();
        }
    }//GEN-LAST:event_barraDesStateChanged

    private void minVTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_minVTextFocusGained
        // TODO add your handling code here:
        minVText.setForeground(Color.black);
    }//GEN-LAST:event_minVTextFocusGained

    private void maxVTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_maxVTextFocusGained
        // TODO add your handling code here:
        maxVText.setForeground(Color.black);
    }//GEN-LAST:event_maxVTextFocusGained
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Practica2 frame = new Practica2();
        frame.setTitle("Filtrador de matrices");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JSlider barraDes;
    private javax.swing.JPanel conPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maxVText;
    private javax.swing.JTextField minVText;
    private javax.swing.JPanel resPanel;
    // End of variables declaration//GEN-END:variables

    private void actualizaMatriz() {
        int barValue = barraDes.getValue();
        String texto = "\n\t";
        for (int i = 0 ; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if(0!=j) texto += "\t";
                if(mat[i][j] <= barValue){
                    texto += "-";
                }else {
                    texto +=  mat[i][j] ;
                }
            }
            texto += "\n\n\t";
        }
        areaTexto.setText(texto);
    }

    private void recreaMatriz() {
        if (valida()){
            maxVText.setForeground(Color.black);
            minVText.setForeground(Color.black);
            int minValue = parseInt(minVText.getText());
            int maxValue = parseInt(maxVText.getText());
            Random r = new Random();
            for (int i = 0 ; i < 10; i++){
                for (int j = 0; j < 10; j++){
                    mat[i][j] = r.nextInt((maxValue - minValue) + 1) + minValue;//(int )(Math.random() * maxValue + minValue);
                }
            }
            barraDes.setLabelTable(null); //Esta funcion impide que el jslider se sobrecargue de labels con diferencias Max-Min muy grandes
            if ((maxValue - minValue) <= 10){
                barraDes.setMajorTickSpacing(1);
                barraDes.setMinorTickSpacing(1);
            }else{
                barraDes.setMajorTickSpacing(((maxValue - minValue)/10));
                barraDes.setMinorTickSpacing(((maxValue - minValue)/10));
            }
            
            barraDes.setPaintTicks(true);
            barraDes.setPaintLabels(true);
            barraDes.setMinimum(minValue);
            barraDes.setValue(minValue);
            barraDes.setMaximum(maxValue);
            actualizaMatriz();
            
            
        } else {
            barraDes.setPaintTicks(false);
            barraDes.setPaintLabels(false);
            areaTexto.setText("");
        }
    }

    private boolean valida() {
        String rex = "[-]?\\d+";
        if(!minVText.getText().matches(rex) || 
                !maxVText.getText().matches(rex)){
            System.err.println("Introduzca solo valores numéricos y siendo el mínimo menor que el máximo\n");
            if (!minVText.getText().matches(rex)){
                minVText.setForeground(Color.red);
            }
            if (!maxVText.getText().matches(rex)){
                maxVText.setForeground(Color.red);
            }

            return false;
        } 
        //COMPROBAR QUE EL MÁXIMO SEA MAYOR QUE EL MÍNIMO
        if (Integer.parseInt(maxVText.getText()) <= Integer.parseInt(minVText.getText())){
            System.err.println("Introduzca solo valores numéricos y siendo el mínimo menor que el máximo\n");
            maxVText.setForeground(Color.red);
            minVText.setForeground(Color.red);
            return false;
        }
        return true;
    }
}
