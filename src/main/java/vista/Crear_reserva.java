package vista;


public class Crear_reserva extends javax.swing.JFrame {

    public Crear_reserva() {
        initComponents();
        setSize(550,550);
        this.setLocationRelativeTo(null); 
    }
    
    private void initComponents() {

        l_reserva_llegada = new javax.swing.JLabel();
        l_reserva_salida = new javax.swing.JLabel();
        l_reserva_total = new javax.swing.JLabel();
        l_reserva_peluqueria = new javax.swing.JLabel();
        l_reserva_alimentacion = new javax.swing.JLabel();
        l_reserva_comentarios = new javax.swing.JLabel();
        l_reserva_precio = new javax.swing.JLabel();
        cbox_peluqueria = new javax.swing.JCheckBox();
        cbox_alimentos = new javax.swing.JCheckBox();
        tf_reserva_total_dias = new javax.swing.JTextField();
        jdate_llegada = new com.toedter.calendar.JDateChooser();
        jdate_salida = new com.toedter.calendar.JDateChooser();
        tf_precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_comentarios = new javax.swing.JTextArea();
        btn_cancelar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();        
        
        setResizable(false);
        setTitle("Creación de reserva");

        l_reserva_llegada.setText("Fecha llegada:");

        l_reserva_salida.setText("Fecha salida:");

        l_reserva_total.setText("Total de días:");

        l_reserva_peluqueria.setText("Servicio peluquería:");

        l_reserva_alimentacion.setText("Servicio alimentación:");

        l_reserva_comentarios.setText("Comentarios:");

        l_reserva_precio.setText("TOTAL:");

        cbox_peluqueria.setText("SI");

        cbox_alimentos.setText("SI");

        ta_comentarios.setColumns(20);
        ta_comentarios.setRows(5);
        jScrollPane1.setViewportView(ta_comentarios);

        btn_cancelar.setText("CANCELAR");

        btn_registrar.setText("REGISTRAR RESERVA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_reserva_llegada)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_cancelar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(l_reserva_peluqueria)
                                .addComponent(l_reserva_alimentacion)
                                .addComponent(l_reserva_total)
                                .addComponent(l_reserva_salida)
                                .addComponent(l_reserva_precio)
                                .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_reserva_comentarios)
                            .addComponent(jdate_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_alimentos)
                            .addComponent(cbox_peluqueria)
                            .addComponent(tf_reserva_total_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdate_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_registrar))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_reserva_llegada)
                    .addComponent(jdate_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_reserva_salida)
                    .addComponent(jdate_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_reserva_total)
                    .addComponent(tf_reserva_total_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_reserva_peluqueria)
                    .addComponent(cbox_peluqueria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_reserva_alimentacion)
                    .addComponent(cbox_alimentos))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_reserva_precio)
                    .addComponent(l_reserva_comentarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_cancelar))
                .addGap(62, 62, 62))
        );

        pack();
    }
    
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JCheckBox cbox_alimentos;
    private javax.swing.JCheckBox cbox_peluqueria;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdate_llegada;
    private com.toedter.calendar.JDateChooser jdate_salida;
    private javax.swing.JLabel l_reserva_alimentacion;
    private javax.swing.JLabel l_reserva_comentarios;
    private javax.swing.JLabel l_reserva_llegada;
    private javax.swing.JLabel l_reserva_peluqueria;
    private javax.swing.JLabel l_reserva_precio;
    private javax.swing.JLabel l_reserva_salida;
    private javax.swing.JLabel l_reserva_total;
    private javax.swing.JTextArea ta_comentarios;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_reserva_total_dias;
}

