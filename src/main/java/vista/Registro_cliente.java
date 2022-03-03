package vista;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import controlador.Eventos_registro_cliente;

import javax.swing.GroupLayout;


public class Registro_cliente extends javax.swing.JDialog {

    public Registro_cliente(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(500,400);
        this.setLocationRelativeTo(null); 
    }
                      
    private void initComponents() {


    	l_cliente = new javax.swing.JLabel();
        l_cliente_nombre = new javax.swing.JLabel();
        l_cliente_apellidos = new javax.swing.JLabel();
        l_cliente_telefono = new javax.swing.JLabel();
        l_cliente_correo = new javax.swing.JLabel();
        l_cliente_direccion = new javax.swing.JLabel();
        l_cliente_socio = new javax.swing.JLabel();
        cbox_socio = new javax.swing.JCheckBox();
        tf_cliente_nombre = new javax.swing.JTextField();
        tf_cliente_apellidos = new javax.swing.JTextField();
        tf_cliente_telefono = new javax.swing.JTextField();
        tf_cliente_correo = new javax.swing.JTextField();
        tf_cliente_direccion = new javax.swing.JTextField();
        btn_volver = new javax.swing.JButton();
        btn_reserva = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_mascota_add = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Registro cliente");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_cliente.setText("Datos cliente:");

        l_cliente_nombre.setText("Nombre:");

        l_cliente_apellidos.setText("Apellidos:");

        l_cliente_telefono.setText("Teléfono:");

        l_cliente_correo.setText("Correo:");

        l_cliente_direccion.setText("Dirección:");

        l_cliente_socio.setText("Socio:");

        cbox_socio.setText("SI");

        btn_volver.setText("ATRAS");

        btn_reserva.setText("RESERVA");

        btn_guardar.setText("GUARDAR DATOS");

        btn_mascota_add.setText("AÑADIR MASCOTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(100)
        					.addComponent(l_cliente))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(47)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(l_cliente_direccion)
        								.addComponent(l_cliente_correo, Alignment.TRAILING)
        								.addComponent(l_cliente_telefono, Alignment.TRAILING)
        								.addComponent(l_cliente_apellidos, Alignment.TRAILING)
        								.addComponent(l_cliente_nombre, Alignment.TRAILING))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(tf_cliente_telefono, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        								.addComponent(tf_cliente_apellidos, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createSequentialGroup()
        									.addGap(1)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(tf_cliente_direccion, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        										.addComponent(tf_cliente_correo, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(tf_cliente_nombre, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        									.addGap(72)
        									.addComponent(btn_mascota_add))))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(l_cliente_socio)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(cbox_socio))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(btn_volver)
        									.addGap(39)
        									.addComponent(btn_reserva)
        									.addGap(34)
        									.addComponent(btn_guardar)))))))
        			.addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(55)
        			.addComponent(l_cliente)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_nombre)
        				.addComponent(btn_mascota_add))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_apellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_apellidos))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_telefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_telefono))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_correo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_correo))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_direccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_direccion))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_cliente_socio)
        				.addComponent(cbox_socio))
        			.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_volver)
        				.addComponent(btn_reserva)
        				.addComponent(btn_guardar))
        			.addGap(62))
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_volver.addActionListener(new Eventos_registro_cliente(this));
    }    
                      
    public javax.swing.JButton getBtn_guardar() {
		return btn_guardar;
	}

	public javax.swing.JButton getBtn_perro_alimentacion() {
		return btn_perro_alimentacion;
	}

	public javax.swing.JButton getBtn_perro_medico() {
		return btn_perro_medico;
	}

	public javax.swing.JButton getBtn_reserva() {
		return btn_reserva;
	}

	public javax.swing.JButton getBtn_volver() {
		return btn_volver;
	}

	public javax.swing.JButton getBtn_mascota_add() {
		return btn_mascota_add;
	}

	public javax.swing.JCheckBox getCbox_socio() {
		return cbox_socio;
	}

	public javax.swing.JTextField getTf_cliente_apellidos() {
		return tf_cliente_apellidos;
	}

	public javax.swing.JTextField getTf_cliente_correo() {
		return tf_cliente_correo;
	}

	public javax.swing.JTextField getTf_cliente_direccion() {
		return tf_cliente_direccion;
	}

	public javax.swing.JTextField getTf_cliente_nombre() {
		return tf_cliente_nombre;
	}

	public javax.swing.JTextField getTf_cliente_telefono() {
		return tf_cliente_telefono;
	}

	public javax.swing.JTextField getTf_perro_chip() {
		return tf_perro_chip;
	}

	public javax.swing.JFormattedTextField getTf_perro_fecha() {
		return tf_perro_fecha;
	}

	public javax.swing.JTextField getTf_perro_nombre() {
		return tf_perro_nombre;
	}

	public javax.swing.JTextField getTf_perro_raza() {
		return tf_perro_raza;
	}



	private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_perro_alimentacion;
    private javax.swing.JButton btn_perro_medico;
    private javax.swing.JButton btn_reserva;
    private javax.swing.JButton btn_volver;
    private javax.swing.JButton btn_mascota_add;
    private javax.swing.JCheckBox cbox_socio;
    private javax.swing.JLabel l_cliente;
    private javax.swing.JLabel l_cliente_apellidos;
    private javax.swing.JLabel l_cliente_correo;
    private javax.swing.JLabel l_cliente_direccion;
    private javax.swing.JLabel l_cliente_nombre;
    private javax.swing.JLabel l_cliente_socio;
    private javax.swing.JLabel l_cliente_telefono;
    private javax.swing.JLabel l_perro;
    private javax.swing.JLabel l_perro_chip;
    private javax.swing.JLabel l_perro_fecha;
    private javax.swing.JLabel l_perro_nombre;
    private javax.swing.JLabel l_perro_raza;
    private javax.swing.JTextField tf_cliente_apellidos;
    private javax.swing.JTextField tf_cliente_correo;
    private javax.swing.JTextField tf_cliente_direccion;
    private javax.swing.JTextField tf_cliente_nombre;
    private javax.swing.JTextField tf_cliente_telefono;
    private javax.swing.JTextField tf_perro_chip;
    private javax.swing.JFormattedTextField tf_perro_fecha;
    private javax.swing.JTextField tf_perro_nombre;
    private javax.swing.JTextField tf_perro_raza;
}
