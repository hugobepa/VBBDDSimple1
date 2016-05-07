
package vbbdd;

import javax.swing.DefaultComboBoxModel;


public class V extends javax.swing.JFrame {
    ConectToDB cdb = new ConectToDB();
    DefaultComboBoxModel dm; 
   
    public V() {
        initComponents();
         initCB();
        
    }

     public void initCB(){
          cdb.InsertCB();
          dm = new DefaultComboBoxModel(cdb.lista.toArray());
         //dm = new DefaultComboBoxModel(petStrings);
         CB.setModel(dm);
      }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTSalir = new javax.swing.JButton();
        CB = new javax.swing.JComboBox();
        LB = new javax.swing.JLabel();
        TFN = new javax.swing.JTextField();
        BTInsertar = new javax.swing.JButton();
        TFE = new javax.swing.JTextField();
        BTBorrar = new javax.swing.JButton();
        BTCBToLabel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTSalir.setText("Salir");
        BTSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalirActionPerformed(evt);
            }
        });

        CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LB.setText("LB");

        TFN.setText("TFN");
        TFN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNKeyTyped(evt);
            }
        });

        BTInsertar.setText("Insertar");
        BTInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInsertarActionPerformed(evt);
            }
        });

        TFE.setText("TFE");

        BTBorrar.setText("Borrar");
        BTBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBorrarActionPerformed(evt);
            }
        });

        BTCBToLabel.setText("CBtoLabel");
        BTCBToLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCBToLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFE)
                    .addComponent(TFN)
                    .addComponent(CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LB)
                    .addComponent(BTInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(BTBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BTCBToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BTSalir)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTInsertar)
                    .addComponent(BTCBToLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTBorrar))
                .addGap(0, 132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_BTSalirActionPerformed

    private void BTBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBorrarActionPerformed
        cdb.eliminarFila(this.TFN.getText());
        this.TFN.setText("");
    }//GEN-LAST:event_BTBorrarActionPerformed
        //Insertar un valor a tabla
    private void BTInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInsertarActionPerformed
        cdb.insertarFila(this.TFN.getText(),Integer.parseInt(this.TFE.getText()));
        //limpiar valores
        this.TFE.setText("");
        this.TFE.setText("");
        initCB();
    }//GEN-LAST:event_BTInsertarActionPerformed
      // un element de CB s'introdueix a un Label
    private void BTCBToLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCBToLabelActionPerformed
        //agafar valor Item CB pasarlo Label
        this.LB.setText(this.CB.getSelectedItem().toString());
    }//GEN-LAST:event_BTCBToLabelActionPerformed
     
    private void TFNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNKeyTyped
        int tecla= evt.getKeyChar();
         this.TFE.setText("");
        if(tecla==10)// si apretar ENTER
        {
          cdb.busquedaSencilla(this.TFN.getText());
         
          
              this.TFE.setText(cdb.age);
          
        }
       
        
        cdb.name=null;
        cdb.age=null;
    }//GEN-LAST:event_TFNKeyTyped

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTBorrar;
    private javax.swing.JButton BTCBToLabel;
    private javax.swing.JButton BTInsertar;
    private javax.swing.JButton BTSalir;
    private javax.swing.JComboBox CB;
    private javax.swing.JLabel LB;
    private javax.swing.JTextField TFE;
    private javax.swing.JTextField TFN;
    // End of variables declaration//GEN-END:variables
}
