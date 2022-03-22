package vista;

import controlador.Eventos_consulta_mascota;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class Consulta_mascota extends javax.swing.JDialog {

    public Consulta_mascota(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(799,652);
        this.setLocationRelativeTo(null);        

    }
                        
    private void initComponents() {

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
        jt_medicacion.setLineWrap(true);
        jt_medicacion.setWrapStyleWord(true);
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBorder(new TitledBorder(null, "Alimentaci\u00F3n:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        l_alimentos_tipo = new javax.swing.JLabel();
        l_alimentos_cantidad = new javax.swing.JLabel();
        l_alimentos_comentarios = new javax.swing.JLabel();
        tf_alimento_tipo = new javax.swing.JTextField();
        tf_alimento_cantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_alimento = new javax.swing.JTextArea();
        jt_alimento.setWrapStyleWord(true);
        jt_alimento.setLineWrap(true);
        jPanel4 = new javax.swing.JPanel();
        jPanel4.setBorder(new TitledBorder(null, "Intolerancias:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        l_intolerancias_descripcion = new javax.swing.JLabel();
        l_intolerancias_tipo = new javax.swing.JLabel();
        tf_intolerancia_tipo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_intolerancia = new javax.swing.JTextArea();
        jt_intolerancia.setLineWrap(true);
        jt_intolerancia.setWrapStyleWord(true);
        jPanel5 = new javax.swing.JPanel();
        jPanel5.setBorder(new TitledBorder(null, "Vacuna rabia:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        l_vacuna_nombre = new javax.swing.JLabel();
        l_vacuna_fecha = new javax.swing.JLabel();
        tf_vacuna_nombre = new javax.swing.JTextField();
        jdate_mascota_fecha = new JDateChooser();
        jdate_mascota_rabia_fecha = new JDateChooser();

        tf_mascota_nombre.setEditable(false);
        tf_mascota_chip.setEditable(false);
        tf_mascota_raza.setEditable(false);
        tf_mascota_peso.setEditable(false);
        tf_mascota_sexo.setEditable(false);        
        tf_medicacion_nombre.setEditable(false);
        tf_medicacion_dosis.setEditable(false);
        cbox_talla.setEnabled(false);
        cbox_esterilizado.setEnabled(false);
        jt_medicacion.setEditable(false);
        tf_vacuna_nombre.setEditable(false);
        tf_medicacion_nombre.setEditable(false);
        tf_medicacion_dosis.setEditable(false);
        jt_alimento.setEditable(false);
        tf_intolerancia_tipo.setEditable(false);
        jt_intolerancia.setEditable(false);
        tf_alimento_tipo.setEditable(false);
        tf_alimento_cantidad.setEditable(false);   
        jdate_mascota_fecha.setEnabled(false);
        jdate_mascota_rabia_fecha.setEnabled(false);
                
        setResizable(false);
        setTitle("Consulta de datos mascota");        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new TitledBorder(null, "General:", TitledBorder.LEADING, TitledBorder.TOP, null, null));

        cbox_esterilizado.setText("SI");

        l_medico_esterilizado.setText("Esterilizado:");

        l_medico_talla.setText("Talla:");

        cbox_talla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Talla S", "Talla M", "Talla L", "Talla XL"}));

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

        tf_mascota_raza.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_mascota_raza.setMinimumSize(new java.awt.Dimension(160, 160));

        tf_mascota_peso.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_mascota_peso.setMinimumSize(new java.awt.Dimension(160, 160));

        tf_mascota_sexo.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_mascota_sexo.setMinimumSize(new java.awt.Dimension(160, 160));        
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_mascota_chip)
        				.addComponent(l_mascota_nombre)
        				.addComponent(l_mascota_fecha)
        				.addComponent(l_mascota_raza)
        				.addComponent(l_medico_peso)
        				.addComponent(l_medico_sexo)
        				.addComponent(l_medico_talla)
        				.addComponent(l_medico_esterilizado))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(cbox_talla, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbox_esterilizado))
        					.addGap(0, 120, Short.MAX_VALUE))
        				.addComponent(tf_mascota_nombre, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        				.addComponent(tf_mascota_chip, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        				.addComponent(tf_mascota_raza, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        				.addComponent(tf_mascota_peso, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        				.addComponent(tf_mascota_sexo, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        				.addComponent(jdate_mascota_fecha, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_mascota_nombre)
        				.addComponent(tf_mascota_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_mascota_chip)
        				.addComponent(tf_mascota_chip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_mascota_fecha)
        				.addComponent(jdate_mascota_fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(l_mascota_raza)
        						.addComponent(tf_mascota_raza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(l_medico_peso))
        				.addComponent(tf_mascota_peso, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medico_sexo)
        				.addComponent(tf_mascota_sexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(3)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medico_talla)
        				.addComponent(cbox_talla, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medico_esterilizado)
        				.addComponent(cbox_esterilizado))
        			.addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBorder(new TitledBorder(null, "Medicaci\u00F3n:", TitledBorder.LEADING, TitledBorder.TOP, null, null));

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

        l_vacuna_nombre.setText("Nombre:");

        l_vacuna_fecha.setText("Fecha inoculación:");

        tf_vacuna_nombre.setMaximumSize(new java.awt.Dimension(160, 160));
        tf_vacuna_nombre.setMinimumSize(new java.awt.Dimension(160, 160));  
        

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5Layout.setHorizontalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addGap(21)
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_vacuna_fecha)
        				.addComponent(l_vacuna_nombre))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jdate_mascota_rabia_fecha, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        				.addComponent(tf_vacuna_nombre, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_vacuna_nombre)
        				.addComponent(tf_vacuna_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(l_vacuna_fecha)
        				.addComponent(jdate_mascota_rabia_fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5.setLayout(jPanel5Layout);
        
        panel = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jPanel5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
        							.addGap(0))
        						.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(236)
        					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        );
        btn_volver = new javax.swing.JButton();
        panel.add(btn_volver);
        
                btn_volver.setText("VOLVER");
                
                        btn_volver.setText("VOLVER");
                        btn_editar = new javax.swing.JButton();   
                        panel.add(btn_editar);
                        
                                btn_editar.setText("EDITAR DATOS");        
                                
                                        btn_editar.setText("EDITAR DATOS");
                                        btn_guardar=new JButton();
                                        panel.add(btn_guardar);
                                        btn_guardar.setEnabled(false);
                                        
                                        btn_guardar.setText("GUARDAR MASCOTA");
                                        btn_guardar.addActionListener(new Eventos_consulta_mascota(this));
                                        btn_editar.addActionListener(new Eventos_consulta_mascota(this));
                        btn_volver.addActionListener(new Eventos_consulta_mascota(this));
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        addWindowListener(new Eventos_consulta_mascota(this));
    }    
    
    public javax.swing.JButton getBtn_editar() {
		return btn_editar;
	}

	public javax.swing.JButton getBtn_volver() {
		return btn_volver;
	}

	public javax.swing.JCheckBox getCbox_esterilizado() {
		return cbox_esterilizado;
	}

	public javax.swing.JComboBox<String> getCbox_talla() {
		return cbox_talla;
	}

	public javax.swing.JTextArea getJt_alimento() {
		return jt_alimento;
	}

	public javax.swing.JTextArea getJt_intolerancia() {
		return jt_intolerancia;
	}

	public javax.swing.JTextArea getJt_medicacion() {
		return jt_medicacion;
	}

	public javax.swing.JTextField getTf_alimento_cantidad() {
		return tf_alimento_cantidad;
	}

	public javax.swing.JTextField getTf_alimento_tipo() {
		return tf_alimento_tipo;
	}

	public javax.swing.JTextField getTf_intolerancia_tipo() {
		return tf_intolerancia_tipo;
	}

	public javax.swing.JTextField getTf_mascota_chip() {
		return tf_mascota_chip;
	}

	public javax.swing.JTextField getTf_mascota_nombre() {
		return tf_mascota_nombre;
	}

	public javax.swing.JTextField getTf_mascota_peso() {
		return tf_mascota_peso;
	}

	public javax.swing.JTextField getTf_mascota_raza() {
		return tf_mascota_raza;
	}

	public javax.swing.JTextField getTf_mascota_sexo() {
		return tf_mascota_sexo;
	}

	public javax.swing.JTextField getTf_medicacion_dosis() {
		return tf_medicacion_dosis;
	}

	public javax.swing.JTextField getTf_medicacion_nombre() {
		return tf_medicacion_nombre;
	}

	public javax.swing.JTextField getTf_vacuna_nombre() {
		return tf_vacuna_nombre;
	}
	
	public JDateChooser getJdate_mascota_fecha() {
		return jdate_mascota_fecha;
	}

	public JDateChooser getJdate_mascota_rabia_fecha() {
		return jdate_mascota_rabia_fecha;
	}
	
	public JButton getBtn_guardar() {
		return btn_guardar;
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
    private javax.swing.JTextField tf_mascota_nombre;
    private javax.swing.JTextField tf_mascota_peso;
    private javax.swing.JTextField tf_mascota_raza;
    private javax.swing.JTextField tf_mascota_sexo;
    private javax.swing.JTextField tf_medicacion_dosis;
    private javax.swing.JTextField tf_medicacion_nombre;
    private javax.swing.JTextField tf_vacuna_nombre;
    private JDateChooser jdate_mascota_fecha;
    private JDateChooser jdate_mascota_rabia_fecha; 
    private JButton btn_guardar;
    private JPanel panel;
}
