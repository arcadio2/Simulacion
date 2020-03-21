package simulacion;

import Val.validar;




public class Sala extends javax.swing.JFrame {
    acceso1 uno;
    acceso2 dos;
    sincronizar tres; 
    int can;
    static int cont1;
    int idk;
    public Sala() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static void ol(int cont1, int cantidad){
        Sala.cont1=cont1; 
        System.out.println(cont1);
        
        if (cont1==cantidad/2) {
            System.out.println("hola");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        poner2 = new javax.swing.JPanel();
        puerta1 = new javax.swing.JButton();
        puerta2 = new javax.swing.JButton();
        Entrada = new javax.swing.JButton();
        out1 = new javax.swing.JLabel();
        out2 = new javax.swing.JLabel();
        Start = new javax.swing.JToggleButton();
        num = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();
        ventas = new javax.swing.JLabel();
        restantes = new javax.swing.JLabel();
        poner1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        poner2.setBackground(new java.awt.Color(255, 255, 255));
        poner2.setForeground(new java.awt.Color(255, 255, 255));

        puerta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajera.png"))); // NOI18N
        puerta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puerta1ActionPerformed(evt);
            }
        });

        puerta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajera.png"))); // NOI18N
        puerta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puerta2ActionPerformed(evt);
            }
        });

        Entrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estadio.jpg"))); // NOI18N

        out1.setText("Persona");

        out2.setText("Persona");

        Start.setText("Comenzar");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresa la cantidad:");

        ventas.setText("Cantidad de ventas:   ");

        restantes.setText("Restantes:");

        javax.swing.GroupLayout poner2Layout = new javax.swing.GroupLayout(poner2);
        poner2.setLayout(poner2Layout);
        poner2Layout.setHorizontalGroup(
            poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poner2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(poner2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(poner2Layout.createSequentialGroup()
                        .addGroup(poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(poner2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(poner1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(puerta2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(puerta1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(poner2Layout.createSequentialGroup()
                                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Start)))
                        .addContainerGap(110, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, poner2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(poner2Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restantes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(poner2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(out1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(out2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        poner2Layout.setVerticalGroup(
            poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poner2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(restantes)
                .addGap(72, 72, 72)
                .addComponent(ventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(poner2Layout.createSequentialGroup()
                        .addGroup(poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(out2)
                            .addComponent(out1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(poner2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(puerta1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(puerta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, poner2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(poner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aviso, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addGroup(poner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Start)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(poner2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void puerta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puerta1ActionPerformed

    }//GEN-LAST:event_puerta1ActionPerformed

    private void puerta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puerta2ActionPerformed

    }//GEN-LAST:event_puerta2ActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
       
        validar obj = new validar();
        if (!obj.validarnum(num.getText())) {
            can = Integer.parseInt(num.getText());
            if (obj.valcant(can)) {
                uno = new acceso1(can);
                uno.actualizar(out1);
                uno.enviari(poner1); 
                dos = new acceso2(can);
                dos.ventas(ventas);
                dos.actualizar(out2);
                uno.restantes(restantes); 
                uno.imagen(Entrada);
                uno.start();
                dos.start();
                if (uno.isAlive() || dos.isAlive()) {
                    Start.setEnabled(false);
                    num.setEnabled(false);
                } else {
                    Start.setEnabled(true);
                }
            }else{
                aviso.setText("Minimo 10, maximo 1000");
            }

        } else {
            aviso.setText("Sólo campos numericos");
        }


    }//GEN-LAST:event_StartActionPerformed
    
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
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrada;
    private javax.swing.JToggleButton Start;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField num;
    private javax.swing.JLabel out1;
    private javax.swing.JLabel out2;
    private javax.swing.JLabel poner1;
    private javax.swing.JPanel poner2;
    private javax.swing.JButton puerta1;
    private javax.swing.JButton puerta2;
    private javax.swing.JLabel restantes;
    private javax.swing.JLabel ventas;
    // End of variables declaration//GEN-END:variables
}
