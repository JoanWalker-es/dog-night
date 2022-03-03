package vista;


public class Datos_alimentos extends javax.swing.JFrame {

    public Datos_alimentos() {
        initComponents();
        setSize(500,550);
        this.setLocationRelativeTo(null); 
    }                         
    private void initComponents() {

        l_alimentos = new javax.swing.JLabel();
        l_alimentos_tipo = new javax.swing.JLabel();
        l_alimentos_cantidad = new javax.swing.JLabel();
        l_alimentos_comentarios = new javax.swing.JLabel();
        tf_alimentos_tipo = new javax.swing.JTextField();
        tf_alimentos_cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_alimentos_comentarios = new javax.swing.JTextArea();
        l_intolerancias = new javax.swing.JLabel();
        l_intolerancias_tipo = new javax.swing.JLabel();
        l_intolerancias_descripcion = new javax.swing.JLabel();
        tf_intolerancia_tipo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_intolerancia_descripcion = new javax.swing.JTextArea();
        btn_atras = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Datos alimenticios");

        l_alimentos.setText("Alimentación:");

        l_alimentos_tipo.setText("Tipo de alimento:");

        l_alimentos_cantidad.setText("Cantidad_diaria:");

        l_alimentos_comentarios.setText("Comentarios:");

        ta_alimentos_comentarios.setColumns(20);
        ta_alimentos_comentarios.setRows(5);
        jScrollPane1.setViewportView(ta_alimentos_comentarios);

        l_intolerancias.setText("Intolerancias:");

        l_intolerancias_tipo.setText("Tipo de intolerancia:");

        l_intolerancias_descripcion.setText("Descripción:");

        ta_intolerancia_descripcion.setColumns(20);
        ta_intolerancia_descripcion.setRows(5);
        jScrollPane2.setViewportView(ta_intolerancia_descripcion);

        btn_atras.setText("ATRAS");

        btn_guardar.setText("GUARDAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_intolerancias)
                    .addComponent(l_alimentos)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(btn_atras)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_guardar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(l_alimentos_comentarios)
                                .addComponent(l_intolerancias_tipo)
                                .addComponent(l_alimentos_cantidad)
                                .addComponent(l_alimentos_tipo)
                                .addComponent(l_intolerancias_descripcion))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_intolerancia_tipo)
                                    .addComponent(jScrollPane1)
                                    .addComponent(tf_alimentos_cantidad)
                                    .addComponent(tf_alimentos_tipo))))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(l_alimentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_alimentos_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_alimentos_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_alimentos_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_alimentos_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_alimentos_comentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(l_intolerancias)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_intolerancias_tipo)
                    .addComponent(tf_intolerancia_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_intolerancias_descripcion)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras)
                    .addComponent(btn_guardar))
                .addGap(31, 31, 31))
        );

        pack();
    }
                    
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_alimentos;
    private javax.swing.JLabel l_alimentos_cantidad;
    private javax.swing.JLabel l_alimentos_comentarios;
    private javax.swing.JLabel l_alimentos_tipo;
    private javax.swing.JLabel l_intolerancias;
    private javax.swing.JLabel l_intolerancias_descripcion;
    private javax.swing.JLabel l_intolerancias_tipo;
    private javax.swing.JTextArea ta_alimentos_comentarios;
    private javax.swing.JTextArea ta_intolerancia_descripcion;
    private javax.swing.JTextField tf_alimentos_cantidad;
    private javax.swing.JTextField tf_alimentos_tipo;
    private javax.swing.JTextField tf_intolerancia_tipo;
}

