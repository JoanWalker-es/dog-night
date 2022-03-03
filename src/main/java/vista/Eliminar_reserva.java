package vista;


public class Eliminar_reserva extends javax.swing.JFrame {

    public Eliminar_reserva() {
        initComponents();
        setSize(400,200);
        this.setLocationRelativeTo(null); 
    }
                        
    private void initComponents() {

        l_mensaje = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
       
        setResizable(false);
        setTitle("Eliminar reserva");

        l_mensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_mensaje.setText("¿SEGURO DE DESEAS ELIMINAR LA RESERVA?");

        btn_cancelar.setText("CANCELAR");

        btn_aceptar.setText("ACEPTAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btn_cancelar)
                        .addGap(47, 47, 47)
                        .addComponent(btn_aceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(l_mensaje)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(l_mensaje)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_aceptar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }
    
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel l_mensaje;          
}
