package vista;


public class Guardado_ok extends javax.swing.JFrame {

    public Guardado_ok() {
        initComponents();
        setSize(350,200);
        this.setLocationRelativeTo(null); 
    }                        
    private void initComponents() {

        l_guardado = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Guardado correcto");

        l_guardado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_guardado.setText("DATOS GUARDADOS CORRECTAMENTE.");

        btn_ok.setText("OK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(l_guardado)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btn_ok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(l_guardado)
                .addGap(32, 32, 32)
                .addComponent(btn_ok)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }
    
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel l_guardado;          
}
