package vista;

import controlador.Eventos_seleccion_cliente;

public class Seleccion_cliente extends javax.swing.JDialog {

    public Seleccion_cliente(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(500,500);
        this.setLocationRelativeTo(null); 
    }
                         
    private void initComponents() {

        cbox_clientes = new javax.swing.JComboBox<>();
        l_cliente = new javax.swing.JLabel();
        l_cliente_nombre = new javax.swing.JLabel();
        l_cliente_apellidos = new javax.swing.JLabel();
        l_cliente_telefono = new javax.swing.JLabel();
        l_cliente_correo = new javax.swing.JLabel();
        l_cliente_mascota = new javax.swing.JLabel();
        tf_cliente_nombre = new javax.swing.JTextField();
        tf_cliente_apellidos = new javax.swing.JTextField();
        tf_cliente_telefono = new javax.swing.JTextField();
        tf_cliente_correo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_cliente_mascotas = new javax.swing.JList<>();
        btn_atras = new javax.swing.JButton();
        btn_consulta = new javax.swing.JButton();
        btn_reserva = new javax.swing.JButton();
        
        tf_cliente_nombre.setEditable(false);
        tf_cliente_apellidos.setEditable(false);
        tf_cliente_telefono.setEditable(false);
        tf_cliente_correo.setEditable(false);
        
        setResizable(false);
        setTitle("Selección de cliente");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbox_clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente 1", "Cliente 2", "Cliente 3" }));

        l_cliente.setText("Cliente seleccionado:");

        l_cliente_nombre.setText("Nombre:");

        l_cliente_apellidos.setText("Apellidos:");

        l_cliente_telefono.setText("Teléfono:");

        l_cliente_correo.setText("Correo:");

        l_cliente_mascota.setText("Mascotas:");

        list_cliente_mascotas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mascota 1", "Mascota 2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_cliente_mascotas);

        btn_atras.setText("ATRAS");

        btn_consulta.setText("CONSULTA DATOS");

        btn_reserva.setText("RESERVA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(cbox_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l_cliente_telefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(l_cliente_nombre))
                                    .addComponent(l_cliente_apellidos)
                                    .addComponent(l_cliente_correo)
                                    .addComponent(l_cliente_mascota))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cliente_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cliente_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cliente_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(l_cliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btn_atras)
                        .addGap(18, 18, 18)
                        .addComponent(btn_consulta)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reserva)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(cbox_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(l_cliente)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_cliente_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cliente_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_cliente_apellidos))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_cliente_telefono)
                    .addComponent(tf_cliente_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_cliente_correo)
                    .addComponent(tf_cliente_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_cliente_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras)
                    .addComponent(btn_consulta)
                    .addComponent(btn_reserva))
                .addGap(83, 83, 83))
        );

        pack();
        
        //EVENTOS DE CLASE:
        btn_atras.addActionListener(new Eventos_seleccion_cliente(this));
    }   
    
    public javax.swing.JButton getBtn_atras() {
		return btn_atras;
	}

	public javax.swing.JButton getBtn_consulta() {
		return btn_consulta;
	}

	public javax.swing.JButton getBtn_reserva() {
		return btn_reserva;
	}

	public javax.swing.JComboBox<String> getCbox_clientes() {
		return cbox_clientes;
	}

	public javax.swing.JList<String> getList_cliente_mascotas() {
		return list_cliente_mascotas;
	}

	public javax.swing.JTextField getTf_cliente_apellidos() {
		return tf_cliente_apellidos;
	}

	public javax.swing.JTextField getTf_cliente_correo() {
		return tf_cliente_correo;
	}

	public javax.swing.JTextField getTf_cliente_nombre() {
		return tf_cliente_nombre;
	}

	public javax.swing.JTextField getTf_cliente_telefono() {
		return tf_cliente_telefono;
	}



	private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_consulta;
    private javax.swing.JButton btn_reserva;
    private javax.swing.JComboBox<String> cbox_clientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_cliente;
    private javax.swing.JLabel l_cliente_apellidos;
    private javax.swing.JLabel l_cliente_correo;
    private javax.swing.JLabel l_cliente_mascota;
    private javax.swing.JLabel l_cliente_nombre;
    private javax.swing.JLabel l_cliente_telefono;
    private javax.swing.JList<String> list_cliente_mascotas;
    private javax.swing.JTextField tf_cliente_apellidos;
    private javax.swing.JTextField tf_cliente_correo;
    private javax.swing.JTextField tf_cliente_nombre;
    private javax.swing.JTextField tf_cliente_telefono;
}

