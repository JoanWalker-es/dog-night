package vista;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import controlador.Eventos_registro_cliente;

import javax.swing.GroupLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que genera la ventana de la interfaz
 * Registro de cliente.
 */
public class Registro_cliente extends javax.swing.JDialog {

    public Registro_cliente(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(406,394);
        this.setLocationRelativeTo(null); 
    }
                      
    private void initComponents() {


    	l_cliente = new javax.swing.JLabel();
    	l_cliente.setHorizontalAlignment(SwingConstants.CENTER);
        
        setResizable(false);
        setTitle("Registro cliente");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        

        l_cliente.setFont(new java.awt.Font("Tahoma", 1, 14));
        l_cliente.setText("Datos cliente:");
        
        JPanel panel = new JPanel();
        
        JPanel panel_1 = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        						.addComponent(l_cliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(52)
        					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(l_cliente)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(panel, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        			.addContainerGap())
        );
        l_cliente_nombre = new javax.swing.JLabel();
        
                l_cliente_nombre.setText("Nombre:");
        l_cliente_apellidos = new javax.swing.JLabel();
        
                l_cliente_apellidos.setText("Apellidos:");
        l_cliente_telefono = new javax.swing.JLabel();
        
                l_cliente_telefono.setText("Teléfono:");
        l_cliente_correo = new javax.swing.JLabel();
        
                l_cliente_correo.setText("Correo:");
        l_cliente_direccion = new javax.swing.JLabel();
        
                l_cliente_direccion.setText("Dirección:");
        l_dni = new javax.swing.JLabel();
        
                l_dni.setText("DNI:");
        
        tf_cliente_dni = new JTextField();
        
        tf_cliente_direccion = new JTextArea();
        tf_cliente_direccion.setBorder(UIManager.getBorder("FormattedTextField.border"));
        tf_cliente_direccion.setWrapStyleWord(true);
        tf_cliente_direccion.setLineWrap(true);
        
        tf_cliente_correo = new javax.swing.JTextField();
        tf_cliente_telefono = new javax.swing.JTextField();
        tf_cliente_apellidos = new javax.swing.JTextField();
        tf_cliente_nombre = new javax.swing.JTextField();
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
        					.addComponent(l_cliente_nombre)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(tf_cliente_nombre, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
        					.addComponent(l_cliente_apellidos)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(tf_cliente_apellidos, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
        					.addComponent(l_cliente_telefono)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(tf_cliente_telefono, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
        						.addComponent(l_dni)
        						.addComponent(l_cliente_direccion)
        						.addComponent(l_cliente_correo))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(tf_cliente_direccion, 0, 0, Short.MAX_VALUE)
        						.addComponent(tf_cliente_correo, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        						.addComponent(tf_cliente_dni, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap())
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addGap(4)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_nombre))
        			.addGap(12)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_apellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_apellidos))
        			.addGap(12)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_telefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_telefono))
        			.addGap(12)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_correo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_correo))
        			.addGap(14)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_direccion, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_cliente_direccion))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_cliente_dni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_dni))
        			.addContainerGap(43, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);
        btn_volver = new javax.swing.JButton();
        panel.add(btn_volver);
        
                btn_volver.setText("ATRAS");
                btn_guardar = new javax.swing.JButton();
                panel.add(btn_guardar);
                
                        btn_guardar.setText("GUARDAR DATOS");
                        btn_mascota_add = new javax.swing.JButton();
                        panel.add(btn_mascota_add);
                        btn_mascota_add.setEnabled(false);
                        
                                btn_mascota_add.setText("AÑADIR MASCOTA");
                                btn_mascota_add.addActionListener(new Eventos_registro_cliente(this));
                        btn_guardar.addActionListener(new Eventos_registro_cliente(this));
                
                //EVENTOS DE CLASE:
                btn_volver.addActionListener(new Eventos_registro_cliente(this));
        getContentPane().setLayout(layout);

        pack();
        
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
	
	public javax.swing.JTextField getTf_cliente_nombre() {
		return tf_cliente_nombre;
	}

	public javax.swing.JTextField getTf_cliente_telefono() {
		return tf_cliente_telefono;
	}

	public JTextField getTf_dni() {
		return tf_cliente_dni;
	}

	public JTextArea getTf_cliente_direccion() {
		return tf_cliente_direccion;
	}



	private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_perro_alimentacion;
    private javax.swing.JButton btn_perro_medico;
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
    private JTextField tf_cliente_dni;
    private JTextArea tf_cliente_direccion;
}
