package vista;


public class Datos_medicos extends javax.swing.JFrame {

    public Datos_medicos() {
        initComponents();setSize(450,600);
        this.setLocationRelativeTo(null); 
    }                         
    private void initComponents() {
        
        l_medico_titulo = new javax.swing.JLabel();
        l_medico_peso = new javax.swing.JLabel();
        l_medico_sexo = new javax.swing.JLabel();
        l_medico_talla = new javax.swing.JLabel();
        l_medico_esterilizado = new javax.swing.JLabel();
        cbox_esterilizado = new javax.swing.JCheckBox();
        cbox_talla = new javax.swing.JComboBox<>();
        tf_mascota_sexo = new javax.swing.JTextField();
        tf_mascota_peso = new javax.swing.JTextField();
        l_vacunas = new javax.swing.JLabel();
        l_vacuna_nombre = new javax.swing.JLabel();
        l_vacuna_fecha = new javax.swing.JLabel();
        tf_vacuna_nombre = new javax.swing.JTextField();
        tf_vacuna_fecha = new javax.swing.JTextField();
        l_medicacion = new javax.swing.JLabel();
        l_medicacion_nombre = new javax.swing.JLabel();
        l_medicacion_dosis = new javax.swing.JLabel();
        l_medicacion_comentario = new javax.swing.JLabel();
        tf_medicacion_nombre = new javax.swing.JTextField();
        tf_medicacion_dosis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_medicacion_comentarios = new javax.swing.JTextArea();
        btn_atras = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Datos médicos");

        l_medico_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_medico_titulo.setText("Datos médicos:");

        l_medico_peso.setText("Peso:");

        l_medico_sexo.setText("Sexo:");

        l_medico_talla.setText("Talla:");

        l_medico_esterilizado.setText("Esterilizado:");

        cbox_esterilizado.setText("SI");

        cbox_talla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Talla S", "Talla M", "Talla L", "Talla XL" }));

        l_vacunas.setText("Vacuna rabia:");

        l_vacuna_nombre.setText("Nombre:");

        l_vacuna_fecha.setText("Fecha inoculación:");

        l_medicacion.setText("Medicación:");

        l_medicacion_nombre.setText("Nombre:");

        l_medicacion_dosis.setText("Dosis diaria:");

        l_medicacion_comentario.setText("Comentarios:");

        ta_medicacion_comentarios.setColumns(20);
        ta_medicacion_comentarios.setRows(5);
        jScrollPane1.setViewportView(ta_medicacion_comentarios);

        btn_atras.setText("ATRAS");

        btn_guardar.setText("GUARDAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(l_medico_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_atras)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(l_medico_esterilizado)
                                .addComponent(l_medico_talla)
                                .addComponent(l_medico_peso)
                                .addComponent(l_medico_sexo)
                                .addComponent(l_vacunas)
                                .addComponent(l_vacuna_nombre)
                                .addComponent(l_vacuna_fecha)
                                .addComponent(l_medicacion)
                                .addComponent(l_medicacion_nombre)
                                .addComponent(l_medicacion_dosis)
                                .addComponent(l_medicacion_comentario)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_mascota_sexo)
                                    .addComponent(cbox_talla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbox_esterilizado)
                                    .addComponent(tf_mascota_peso)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_guardar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_vacuna_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                            .addComponent(tf_vacuna_nombre)
                                            .addComponent(tf_medicacion_nombre)
                                            .addComponent(tf_medicacion_dosis))))))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(l_medico_titulo)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_medico_peso)
                    .addComponent(tf_mascota_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_medico_sexo)
                    .addComponent(tf_mascota_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_medico_talla)
                    .addComponent(cbox_talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_medico_esterilizado)
                    .addComponent(cbox_esterilizado))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_vacunas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l_vacuna_nombre)
                            .addComponent(tf_vacuna_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_vacuna_fecha))
                    .addComponent(tf_vacuna_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(l_medicacion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_medicacion_nombre)
                    .addComponent(tf_medicacion_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_medicacion_dosis)
                    .addComponent(tf_medicacion_dosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_medicacion_comentario)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras)
                    .addComponent(btn_guardar))
                .addGap(25, 25, 25))
        );

        pack();
    }
    
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JCheckBox cbox_esterilizado;
    private javax.swing.JComboBox<String> cbox_talla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_medicacion;
    private javax.swing.JLabel l_medicacion_comentario;
    private javax.swing.JLabel l_medicacion_dosis;
    private javax.swing.JLabel l_medicacion_nombre;
    private javax.swing.JLabel l_medico_esterilizado;
    private javax.swing.JLabel l_medico_peso;
    private javax.swing.JLabel l_medico_sexo;
    private javax.swing.JLabel l_medico_talla;
    private javax.swing.JLabel l_medico_titulo;
    private javax.swing.JLabel l_vacuna_fecha;
    private javax.swing.JLabel l_vacuna_nombre;
    private javax.swing.JLabel l_vacunas;
    private javax.swing.JTextArea ta_medicacion_comentarios;
    private javax.swing.JTextField tf_mascota_peso;
    private javax.swing.JTextField tf_mascota_sexo;
    private javax.swing.JTextField tf_medicacion_dosis;
    private javax.swing.JTextField tf_medicacion_nombre;
    private javax.swing.JTextField tf_vacuna_fecha;
    private javax.swing.JTextField tf_vacuna_nombre; 
}
