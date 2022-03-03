package vista;


public class Reserva_creada extends javax.swing.JFrame {
    
    public Reserva_creada() {
        initComponents();
        setSize(400,350);
        this.setLocationRelativeTo(null); 
    }
                       
    private void initComponents() {

        l_creada = new javax.swing.JLabel();
        l_inicio = new javax.swing.JLabel();
        l_fin = new javax.swing.JLabel();
        l_total = new javax.swing.JLabel();
        tf_inicio = new javax.swing.JTextField();
        tf_fin = new javax.swing.JTextField();
        tf_total = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        
        tf_inicio.setEditable(false);
        tf_fin.setEditable(false);
        tf_total.setEditable(false);        
        
        setResizable(false);
        setTitle("Reserva creada");        

        l_creada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_creada.setText("RESERVA CREADA CORRECTAMENTE");

        l_inicio.setText("Fecha inicio:");

        l_fin.setText("Fecha fin:");

        l_total.setText("TOTAL:");

        btn_aceptar.setText("ACEPTAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_creada)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_inicio)
                            .addComponent(l_fin)
                            .addComponent(l_total))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_aceptar))))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(l_creada)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_inicio)
                    .addComponent(tf_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_fin)
                    .addComponent(tf_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_total)
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btn_aceptar)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }
    
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel l_creada;
    private javax.swing.JLabel l_fin;
    private javax.swing.JLabel l_inicio;
    private javax.swing.JLabel l_total;
    private javax.swing.JTextField tf_fin;
    private javax.swing.JTextField tf_inicio;
    private javax.swing.JTextField tf_total;         
}
