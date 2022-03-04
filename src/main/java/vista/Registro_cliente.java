package vista;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import controlador.Eventos_registro_cliente;

import javax.swing.GroupLayout;
import javax.swing.JTextField;


public class Registro_cliente extends javax.swing.JDialog {

    public Registro_cliente(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(500,350);
        this.setLocationRelativeTo(null); 
    }
                      
    private void initComponents() {


    	l_cliente = new javax.swing.JLabel();
        l_cliente_nombre = new javax.swing.JLabel();
        l_cliente_apellidos = new javax.swing.JLabel();
        l_cliente_telefono = new javax.swing.JLabel();
        l_cliente_correo = new javax.swing.JLabel();
        l_cliente_direccion = new javax.swing.JLabel();
        l_dni = new javax.swing.JLabel();
        tf_cliente_nombre = new javax.swing.JTextField();
        tf_cliente_apellidos = new javax.swing.JTextField();
        tf_cliente_telefono = new javax.swing.JTextField();
        tf_cliente_correo = new javax.swing.JTextField();
        btn_volver = new javax.swing.JButton();
        btn_reserva = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_mascota_add = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Registro cliente");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        btn_reserva.setEnabled(false);
        btn_mascota_add.setEnabled(false);
        

        l_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_cliente.setText("Datos cliente:");

        l_cliente_nombre.setText("Nombre:");

        l_cliente_apellidos.setText("Apellidos:");

        l_cliente_telefono.setText("Teléfono:");

        l_cliente_correo.setText("Correo:");

        l_cliente_direccion.setText("Dirección:");

        l_dni.setText("DNI:");

        btn_volver.setText("ATRAS");

        btn_reserva.setText("RESERVA");

        btn_guardar.setText("GUARDAR DATOS");

        btn_mascota_add.setText("AÑADIR MASCOTA");
        
        tf_cliente_direccion = new JTextField();
        
        tf_cliente_dni = new JTextField();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(47)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(52)
        					.addComponent(btn_volver)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(btn_reserva))
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createSequentialGroup()
        						.addGap(53)
        						.addComponent(l_cliente))
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(l_dni)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(l_cliente_direccion)
        								.addComponent(l_cliente_correo, Alignment.TRAILING)
        								.addComponent(l_cliente_telefono, Alignment.TRAILING)
        								.addComponent(l_cliente_apellidos, Alignment.TRAILING)
        								.addComponent(l_cliente_nombre, Alignment.TRAILING)))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(tf_cliente_correo)
        								.addComponent(tf_cliente_telefono)
        								.addComponent(tf_cliente_apellidos)
        								.addComponent(tf_cliente_nombre, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
        							.addComponent(tf_cliente_direccion, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
        							.addComponent(tf_cliente_dni, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))))
        			.addGap(28)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btn_mascota_add)
        				.addComponent(btn_guardar))
        			.addContainerGap(40, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(78)
        					.addComponent(btn_mascota_add))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(l_cliente)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(tf_cliente_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(l_cliente_nombre))
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
        						.addComponent(l_cliente_correo)
        						.addComponent(tf_cliente_correo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(l_cliente_direccion)
        						.addComponent(tf_cliente_direccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(44)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btn_volver)
        						.addComponent(btn_reserva)
        						.addComponent(btn_guardar)))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(tf_cliente_dni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(l_dni))))
        			.addGap(21))
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_volver.addActionListener(new Eventos_registro_cliente(this));
        btn_guardar.addActionListener(new Eventos_registro_cliente(this));
        btn_mascota_add.addActionListener(new Eventos_registro_cliente(this));
        btn_reserva.addActionListener(new Eventos_registro_cliente(this));
        addWindowListener(new Eventos_registro_cliente(this));
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

	public JTextField getTf_dni() {
		return tf_cliente_dni;
	}



	private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_perro_alimentacion;
    private javax.swing.JButton btn_perro_medico;
    private javax.swing.JButton btn_reserva;
    private javax.swing.JButton btn_volver;
    private javax.swing.JButton btn_mascota_add;
    private javax.swing.JLabel l_cliente;
    private javax.swing.JLabel l_cliente_apellidos;
    private javax.swing.JLabel l_cliente_correo;
    private javax.swing.JLabel l_cliente_direccion;
    private javax.swing.JLabel l_cliente_nombre;
    private javax.swing.JLabel l_dni;
    private javax.swing.JLabel l_cliente_telefono;
    private javax.swing.JTextField tf_cliente_apellidos;
    private javax.swing.JTextField tf_cliente_correo;
    private javax.swing.JTextField tf_cliente_nombre;
    private javax.swing.JTextField tf_cliente_telefono;
    private JTextField tf_cliente_direccion;
    private JTextField tf_cliente_dni;
}
