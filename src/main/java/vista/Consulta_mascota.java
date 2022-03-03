package vista;


public class Consulta_mascota extends javax.swing.JFrame {

    public Consulta_mascota() {
        initComponents();
        setSize(780,700);
        this.setLocationRelativeTo(null);        

    }
                        
    private void initComponents() {

    	btn_volver = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbox_esterilizado = new javax.swing.JCheckBox();
        l_medico_esterilizado = new javax.swing.JLabel();
        l_medico_talla = new javax.swing.JLabel();
        cbox_talla = new javax.swing.JComboBox<>();
        l_medico_sexo = new javax.swing.JLabel();
        l_medico_peso = new javax.swing.JLabel();
        l_mascota_raza = new javax.swing.JLabel();
        l_mascota_fecha = new javax.swing.JLabel();
        l_mascota_chip = new javax.swing.JLabel();
        l_mascota_nombre = new javax.swing.JLabel();
        tf_mascota_nombre = new javax.swing.JTextField();
        tf_mascota_chip = new javax.swing.JTextField();
        tf_mascota_fecha = new javax.swing.JTextField();
        tf_mascota_raza = new javax.swing.JTextField();
        tf_mascota_peso = new javax.swing.JTextField();
        tf_mascota_sexo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        l_medicacion_nombre = new javax.swing.JLabel();
        tf_medicacion_nombre = new javax.swing.JTextField();
        tf_medicacion_dosis = new javax.swing.JTextField();
        l_medicacion_dosis = new javax.swing.JLabel();
        l_medicacion_comentario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_medicacion = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        l_alimentos_tipo = new javax.swing.JLabel();
        l_alimentos_cantidad = new javax.swing.JLabel();
        l_alimentos_comentarios = new javax.swing.JLabel();
        tf_alimento_tipo = new javax.swing.JTextField();
        tf_alimento_cantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_alimento = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        l_intolerancias_descripcion = new javax.swing.JLabel();
        l_intolerancias_tipo = new javax.swing.JLabel();
        tf_intolerancia_tipo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_intolerancia = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        l_vacuna_nombre = new javax.swing.JLabel();
        l_vacuna_fecha = new javax.swing.JLabel();
        tf_vacuna_nombre = new javax.swing.JTextField();
        tf_vacuna_fecha = new javax.swing.JTextField();
        btn_volver = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();            

        tf_mascota_nombre.setEditable(false);
        tf_mascota_chip.setEditable(false);
        tf_mascota_fecha.setEditable(false);
        tf_mascota_raza.setEditable(false);
        tf_mascota_peso.setEditable(false);
        tf_mascota_sexo.setEditable(false);        
        tf_medicacion_nombre.setEditable(false);
        tf_medicacion_dosis.setEditable(false);
        cbox_talla.setEditable(false);
        cbox_esterilizado.setEnabled(false);
        jt_medicacion.setEditable(false);
        tf_vacuna_nombre.setEditable(false);
        tf_vacuna_fecha.setEditable(false);
        tf_medicacion_nombre.setEditable(false);
        tf_medicacion_dosis.setEditable(false);
        jt_alimento.setEditable(false);
        tf_intolerancia_tipo.setEditable(false);
        jt_intolerancia.setEditable(false);
        tf_alimento_tipo.setEditable(false);
        tf_alimento_cantidad.setEditable(false);      
                
        setResizable(false);
        setTitle("Consulta de datos mascota");        

        btn_volver.setText("VOLVER");

        btn_editar.setText("EDITAR DATOS");        

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS GENERALES"));

        cbox_esterilizado.setText("SI");

        l_medico_esterilizado.setText("Esterilizado:");

        l_medico_talla.setText("Talla:");

        cbox_talla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Talla S", "Talla M", "Talla L", "Talla XL", " ", " " }));

        l_medico_sexo.setText("Sexo:");

        l_medico_peso.setText("Peso:");

        l_mascota_raza.setText("Raza:");

        l_mascota_fecha.setText("Fecha nacimiento:");

        l_mascota_chip.setText("Microchip:");

        l_mascota_nombre.setText("Nombre:");

        tf_mascota_nombre.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_mascota_nombre.setMinimumSize(new java.awt.Dimension(160, 160));

        tf_mascota_chip.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_mascota_chip.setMinimumSize(new java.awt.Dimension(160, 160));

        tf_mascota_fecha.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_mascota_fecha.setMinimumSize(new java.awt.Dimension(160, 160));

        tf_mascota_raza.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_mascota_raza.setMinimumSize(new java.awt.Dimension(160, 160));

        tf_mascota_peso.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_mascota_peso.setMinimumSize(new java.awt.Dimension(160, 160));

        tf_mascota_sexo.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_mascota_sexo.setMinimumSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_mascota_chip)
                    .addComponent(l_mascota_nombre)
                    .addComponent(l_mascota_fecha)
                    .addComponent(l_mascota_raza)
                    .addComponent(l_medico_peso)
                    .addComponent(l_medico_sexo)
                    .addComponent(l_medico_talla)
                    .addComponent(l_medico_esterilizado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbox_talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_esterilizado))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tf_mascota_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_mascota_chip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_mascota_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_mascota_raza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_mascota_peso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_mascota_sexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_mascota_nombre)
                            .addComponent(tf_mascota_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_mascota_chip)
                            .addComponent(tf_mascota_chip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_mascota_fecha)
                            .addComponent(tf_mascota_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_mascota_raza)
                            .addComponent(tf_mascota_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_medico_peso))
                    .addComponent(tf_mascota_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_medico_sexo)
                    .addComponent(tf_mascota_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_medico_talla)
                    .addComponent(cbox_talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_medico_esterilizado)
                    .addComponent(cbox_esterilizado))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("MEDICACIÓN"));

        l_medicacion_nombre.setText("Nombre:");

        tf_medicacion_nombre.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_medicacion_nombre.setMinimumSize(new java.awt.Dimension(160, 160));

        tf_medicacion_dosis.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_medicacion_dosis.setMinimumSize(new java.awt.Dimension(160, 160));

        l_medicacion_dosis.setText("Dosis diaria:");

        l_medicacion_comentario.setText("Comentarios:");

        jt_medicacion.setColumns(20);
        jt_medicacion.setRows(5);
        jt_medicacion.setMaximumSize(new java.awt.Dimension(170, 110));
        jt_medicacion.setMinimumSize(new java.awt.Dimension(170, 110));
        jScrollPane1.setViewportView(jt_medicacion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_medicacion_dosis)
                    .addComponent(l_medicacion_nombre)
                    .addComponent(l_medicacion_comentario))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(tf_medicacion_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_medicacion_dosis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_medicacion_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_medicacion_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_medicacion_dosis)
                    .addComponent(tf_medicacion_dosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(l_medicacion_comentario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ALIMENTACIÓN"));

        l_alimentos_tipo.setText("Tipo de alimento:");

        l_alimentos_cantidad.setText("Cantidad diaria:");

        l_alimentos_comentarios.setText("Comentarios:");

        tf_alimento_tipo.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_alimento_tipo.setMinimumSize(new java.awt.Dimension(160, 160));

        tf_alimento_cantidad.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_alimento_cantidad.setMinimumSize(new java.awt.Dimension(160, 160));

        jt_alimento.setColumns(20);
        jt_alimento.setRows(5);
        jt_alimento.setMaximumSize(new java.awt.Dimension(170, 110));
        jt_alimento.setMinimumSize(new java.awt.Dimension(170, 110));
        jScrollPane2.setViewportView(jt_alimento);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_alimentos_comentarios)
                    .addComponent(l_alimentos_cantidad)
                    .addComponent(l_alimentos_tipo))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_alimento_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_alimento_cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_alimentos_tipo)
                    .addComponent(tf_alimento_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_alimentos_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_alimento_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(l_alimentos_comentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(37, 37, 37))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("INTOLERANCIAS"));

        l_intolerancias_descripcion.setText("Descripción:");

        l_intolerancias_tipo.setText("Tipo de intolerancia:");

        tf_intolerancia_tipo.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_intolerancia_tipo.setMinimumSize(new java.awt.Dimension(160, 160));

        jt_intolerancia.setColumns(20);
        jt_intolerancia.setRows(5);
        jt_intolerancia.setMaximumSize(new java.awt.Dimension(170, 110));
        jt_intolerancia.setMinimumSize(new java.awt.Dimension(170, 110));
        jScrollPane3.setViewportView(jt_intolerancia);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_intolerancias_descripcion)
                    .addComponent(l_intolerancias_tipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_intolerancia_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_intolerancias_tipo)
                    .addComponent(tf_intolerancia_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(l_intolerancias_descripcion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("VACUNA RABIA"));

        l_vacuna_nombre.setText("Nombre:");

        l_vacuna_fecha.setText("Fecha inoculación:");

        tf_vacuna_nombre.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_vacuna_nombre.setMinimumSize(new java.awt.Dimension(160, 160));

        tf_vacuna_fecha.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_vacuna_fecha.setMinimumSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_vacuna_fecha)
                    .addComponent(l_vacuna_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_vacuna_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_vacuna_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_vacuna_nombre)
                    .addComponent(tf_vacuna_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_vacuna_fecha)
                    .addComponent(tf_vacuna_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_volver.setText("VOLVER");

        btn_editar.setText("EDITAR DATOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_volver)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_editar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver)
                    .addComponent(btn_editar))
                .addGap(44, 44, 44))
        );

        pack();
    }
    
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JCheckBox cbox_esterilizado;
    private javax.swing.JComboBox<String> cbox_talla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jt_alimento;
    private javax.swing.JTextArea jt_intolerancia;
    private javax.swing.JTextArea jt_medicacion;
    private javax.swing.JLabel l_alimentos_cantidad;
    private javax.swing.JLabel l_alimentos_comentarios;
    private javax.swing.JLabel l_alimentos_tipo;
    private javax.swing.JLabel l_intolerancias_descripcion;
    private javax.swing.JLabel l_intolerancias_tipo;
    private javax.swing.JLabel l_mascota_chip;
    private javax.swing.JLabel l_mascota_fecha;
    private javax.swing.JLabel l_mascota_nombre;
    private javax.swing.JLabel l_mascota_raza;
    private javax.swing.JLabel l_medicacion_comentario;
    private javax.swing.JLabel l_medicacion_dosis;
    private javax.swing.JLabel l_medicacion_nombre;
    private javax.swing.JLabel l_medico_esterilizado;
    private javax.swing.JLabel l_medico_peso;
    private javax.swing.JLabel l_medico_sexo;
    private javax.swing.JLabel l_medico_talla;
    private javax.swing.JLabel l_vacuna_fecha;
    private javax.swing.JLabel l_vacuna_nombre;
    private javax.swing.JTextField tf_alimento_cantidad;
    private javax.swing.JTextField tf_alimento_tipo;
    private javax.swing.JTextField tf_intolerancia_tipo;
    private javax.swing.JTextField tf_mascota_chip;
    private javax.swing.JTextField tf_mascota_fecha;
    private javax.swing.JTextField tf_mascota_nombre;
    private javax.swing.JTextField tf_mascota_peso;
    private javax.swing.JTextField tf_mascota_raza;
    private javax.swing.JTextField tf_mascota_sexo;
    private javax.swing.JTextField tf_medicacion_dosis;
    private javax.swing.JTextField tf_medicacion_nombre;
    private javax.swing.JTextField tf_vacuna_fecha;
    private javax.swing.JTextField tf_vacuna_nombre;
}
