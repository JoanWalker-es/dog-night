package vista;

import controlador.Eventos_seleccion_cliente;
import modelo.Cliente;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Seleccion_cliente extends javax.swing.JDialog {

    public Seleccion_cliente(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(460,350);
        this.setLocationRelativeTo(null); 
    }
                         
    private void initComponents() {

        cbox_clientes = new javax.swing.JComboBox<>();
        btn_atras = new javax.swing.JButton();
        btn_consulta = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Selección de cliente");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbox_clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new Cliente[] {}));

        btn_atras.setText("ATRAS");

        btn_consulta.setText("CONSULTA DATOS");
        
        tf_buscar = new JTextField();
        tf_buscar.setColumns(10);
        
        btn_buscar = new JButton("BUSCAR");
        
        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(74)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(tf_buscar, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btn_buscar))
        				.addComponent(cbox_clientes, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(40)
        					.addComponent(btn_atras)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btn_consulta)))
        			.addGap(62))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(39)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_buscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btn_buscar))
        			.addGap(18)
        			.addComponent(cbox_clientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(100)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_consulta)
        				.addComponent(btn_atras))
        			.addContainerGap(305, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_atras.addActionListener(new Eventos_seleccion_cliente(this));
        btn_consulta.addActionListener(new Eventos_seleccion_cliente(this));
        btn_buscar.addActionListener(new Eventos_seleccion_cliente(this));
        cbox_clientes.addActionListener(new Eventos_seleccion_cliente(this));
    }   
    
    public javax.swing.JButton getBtn_atras() {
		return btn_atras;
	}

	public javax.swing.JButton getBtn_consulta() {
		return btn_consulta;
	}

	public JButton getBtn_buscar() {
		return btn_buscar;
	}
	
	public JTextField getTf_buscar() {
		return tf_buscar;
	}

	public javax.swing.JComboBox<Cliente> getCbox_clientes() {
		return cbox_clientes;
	}






	private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_consulta;
    private javax.swing.JComboBox<Cliente> cbox_clientes;
    private JTextField tf_buscar;
    private JButton btn_buscar;
}

