package vista;


public class Consulta_cliente extends javax.swing.JFrame {

    public Consulta_cliente() {
        initComponents();
        setSize(600,400);
        this.setLocationRelativeTo(null); 
    }
    
    private void initComponents() {

        l_cliente_nombre = new javax.swing.JLabel();
        l_cliente_apellidos = new javax.swing.JLabel();
        l_cliente_telefono = new javax.swing.JLabel();
        l_cliente_correo = new javax.swing.JLabel();
        l_cliente_direccion = new javax.swing.JLabel();
        l_cliente_socio = new javax.swing.JLabel();
        tf_cliente_nombre = new javax.swing.JTextField();
        tf_cliente_apellidos = new javax.swing.JTextField();
        tf_cliente_telefono = new javax.swing.JTextField();
        tf_cliente_correo = new javax.swing.JTextField();
        tf_cliente_direccion = new javax.swing.JTextField();
        cbox_socio = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_mascotas = new javax.swing.JList<>();
        btn_mascota_datos = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();               
        
        tf_cliente_nombre.setEditable(false);
        tf_cliente_apellidos.setEditable(false);
        tf_cliente_telefono.setEditable(false);
        tf_cliente_correo.setEditable(false);
        tf_cliente_direccion.setEditable(false);
        cbox_socio.setEnabled(false);
        
        setResizable(false);
        setTitle("Consulta de datos cliente");
        
        l_cliente_nombre.setText("Nombre:");

        l_cliente_apellidos.setText("Apellidos:");

        l_cliente_telefono.setText("Teléfono:");

        l_cliente_correo.setText("Correo:");

        l_cliente_direccion.setText("Dirección:");

        l_cliente_socio.setText("Socio:");

        cbox_socio.setText("SI");

        list_mascotas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mascota 1", "Mascota 2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_mascotas);

        btn_mascota_datos.setText("DATOS MASCOTA");

        btn_editar.setText("EDITAR DATOS CLIENTE");

        btn_volver.setText("VOLVER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_cliente_nombre)
                    .addComponent(l_cliente_apellidos)
                    .addComponent(l_cliente_telefono)
                    .addComponent(l_cliente_correo)
                    .addComponent(l_cliente_direccion)
                    .addComponent(l_cliente_socio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_cliente_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cliente_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cliente_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cliente_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_socio)
                    .addComponent(btn_editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mascota_datos)
                    .addComponent(btn_volver))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_cliente_nombre)
                            .addComponent(tf_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_cliente_apellidos)
                            .addComponent(tf_cliente_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_cliente_telefono)
                            .addComponent(tf_cliente_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_cliente_correo)
                            .addComponent(tf_cliente_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_cliente_direccion)
                            .addComponent(tf_cliente_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(l_cliente_socio)
                        .addComponent(cbox_socio))
                    .addComponent(btn_mascota_datos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar)
                    .addComponent(btn_volver))
                .addGap(27, 27, 27))
        );

        pack();
    }
    
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_mascota_datos;
    private javax.swing.JButton btn_volver;
    private javax.swing.JCheckBox cbox_socio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_cliente_apellidos;
    private javax.swing.JLabel l_cliente_correo;
    private javax.swing.JLabel l_cliente_direccion;
    private javax.swing.JLabel l_cliente_nombre;
    private javax.swing.JLabel l_cliente_socio;
    private javax.swing.JLabel l_cliente_telefono;
    private javax.swing.JList<String> list_mascotas;
    private javax.swing.JTextField tf_cliente_apellidos;
    private javax.swing.JTextField tf_cliente_correo;
    private javax.swing.JTextField tf_cliente_direccion;
    private javax.swing.JTextField tf_cliente_nombre;
    private javax.swing.JTextField tf_cliente_telefono;
}
