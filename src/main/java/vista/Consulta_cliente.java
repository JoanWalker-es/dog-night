package vista;
import javax.swing.GroupLayout.Alignment;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import controlador.Eventos_consulta_cliente;
import modelo.Cliente;
import modelo.Mascota;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class Consulta_cliente extends javax.swing.JDialog {

    public Consulta_cliente(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(480,400);
        this.setLocationRelativeTo(null); 
    }
    
    private void initComponents() {

        l_cliente_nombre = new javax.swing.JLabel();
        l_cliente_apellidos = new javax.swing.JLabel();
        l_cliente_telefono = new javax.swing.JLabel();
        l_cliente_correo = new javax.swing.JLabel();
        l_cliente_direccion = new javax.swing.JLabel();
        tf_cliente_nombre = new javax.swing.JTextField();
        tf_cliente_apellidos = new javax.swing.JTextField();
        tf_cliente_telefono = new javax.swing.JTextField();
        tf_cliente_correo = new javax.swing.JTextField();
        btn_mascota_datos = new javax.swing.JButton();
        cb_mascotas = new JComboBox();
        btn_guardar = new JButton();
        btn_mascota_add = new JButton();
        tf_cliente_direccion = new JTextArea();
        tf_cliente_direccion.setBorder(UIManager.getBorder("FormattedTextField.border"));
        tf_cliente_direccion.setWrapStyleWord(true);
        tf_cliente_direccion.setLineWrap(true);
        
        tf_cliente_nombre.setEditable(false);
        tf_cliente_apellidos.setEditable(false);
        tf_cliente_telefono.setEditable(false);
        tf_cliente_correo.setEditable(false);
        tf_cliente_direccion.setEditable(false);
        btn_guardar.setEnabled(false);
        
        setResizable(false);
        setTitle("Consulta de datos cliente");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        l_cliente_nombre.setText("Nombre:");

        l_cliente_apellidos.setText("Apellidos:");

        l_cliente_telefono.setText("Teléfono:");

        l_cliente_correo.setText("Correo:");

        l_cliente_direccion.setText("Dirección:");

        btn_mascota_datos.setText("DATOS MASCOTA");
        
        cb_mascotas.setModel(new javax.swing.DefaultComboBoxModel<>(new Mascota[] {}));
        
        l_cliente_DNI = new JLabel();
        l_cliente_DNI.setText("DNI:");
        
        tf_cliente_DNI = new JTextField();
        tf_cliente_DNI.setEditable(false);        
        
        btn_guardar.setText("GUARDAR DATOS CLIENTE");
        
        
        btn_mascota_add.setText("NUEVA MASCOTA");        
        
        panel = new JPanel();
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(44)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(l_cliente_apellidos)
        						.addComponent(l_cliente_nombre)
        						.addComponent(l_cliente_telefono)
        						.addComponent(l_cliente_correo)
        						.addComponent(l_cliente_direccion)
        						.addComponent(l_cliente_DNI))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(tf_cliente_telefono, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(btn_mascota_datos, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
        						.addComponent(tf_cliente_apellidos, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(tf_cliente_nombre, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(cb_mascotas, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(tf_cliente_direccion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        								.addComponent(tf_cliente_correo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        								.addComponent(tf_cliente_DNI, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        								.addComponent(btn_guardar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        							.addGap(18)
        							.addComponent(btn_mascota_add, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))))
        			.addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(44)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_nombre)
        				.addComponent(cb_mascotas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_apellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_apellidos))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_telefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_telefono)
        				.addComponent(btn_mascota_datos))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(tf_cliente_correo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(l_cliente_correo))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(l_cliente_direccion)
        						.addComponent(tf_cliente_direccion, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
        					.addGap(11)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(l_cliente_DNI)
        						.addComponent(tf_cliente_DNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(btn_mascota_add))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btn_guardar)
        			.addGap(18)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(85, Short.MAX_VALUE))
        );
        btn_volver = new javax.swing.JButton();   
        panel.add(btn_volver);
        
                btn_volver.setText("VOLVER");
                btn_volver.addActionListener(new Eventos_consulta_cliente(this));
        btn_editar = new javax.swing.JButton();
        panel.add(btn_editar);
        
                btn_editar.setText("EDITAR DATOS CLIENTE");
                
                btn_reserva = new JButton("CREAR RESERVA");
                panel.add(btn_reserva);
                btn_reserva.addActionListener(new Eventos_consulta_cliente(this));
                
                //EVENTOS DE CLASE:
                btn_editar.addActionListener(new Eventos_consulta_cliente(this));
        getContentPane().setLayout(layout);

        pack();
        btn_mascota_datos.addActionListener(new Eventos_consulta_cliente(this));
        btn_guardar.addActionListener(new Eventos_consulta_cliente(this));
        btn_mascota_add.addActionListener(new Eventos_consulta_cliente(this));
        addWindowListener(new Eventos_consulta_cliente(this));
    }    
    
    public javax.swing.JButton getBtn_editar() {
		return btn_editar;
	}

	public javax.swing.JButton getBtn_mascota_datos() {
		return btn_mascota_datos;
	}

	public javax.swing.JButton getBtn_volver() {
		return btn_volver;
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

	public JButton getBtn_reserva() {
		return btn_reserva;
	}
	
	public JTextField getTf_cliente_DNI() {
		return tf_cliente_DNI;
	}

	public JComboBox getCb_mascotas() {
		return cb_mascotas;
	}

	public JButton getBtn_guardar() {
		return btn_guardar;
	}

	public JButton getBtn_mascota_add() {
		return btn_mascota_add;
	}

	public JTextArea getTf_cliente_direccion() {
		return tf_cliente_direccion;
	}





	private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_mascota_datos;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel l_cliente_apellidos;
    private javax.swing.JLabel l_cliente_correo;
    private javax.swing.JLabel l_cliente_direccion;
    private javax.swing.JLabel l_cliente_nombre;
    private javax.swing.JLabel l_cliente_telefono;
    private javax.swing.JTextField tf_cliente_apellidos;
    private javax.swing.JTextField tf_cliente_correo;
    private javax.swing.JTextField tf_cliente_nombre;
    private javax.swing.JTextField tf_cliente_telefono;
    private JButton btn_reserva;
    private JLabel l_cliente_DNI;
    private JTextField tf_cliente_DNI;
    private JComboBox cb_mascotas;
    private JButton btn_guardar;
    private JButton btn_mascota_add; 
    private JTextArea tf_cliente_direccion;
    private JPanel panel;
}
