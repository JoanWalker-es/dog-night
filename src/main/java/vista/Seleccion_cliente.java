package vista;

import controlador.Eventos_seleccion_cliente;
import modelo.Cliente;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Seleccion_cliente extends javax.swing.JDialog {

    public Seleccion_cliente(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(400,200);
        this.setLocationRelativeTo(null); 
    }
                         
    private void initComponents() {
        
        setResizable(false);
        setTitle("Selección de cliente");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        panel = new JPanel();       
        
        panel_1 = new JPanel();
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        				.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        
        tf_buscar = new JTextField();
        tf_buscar.setColumns(10);
        
        btn_buscar = new JButton("BUSCAR");
        btn_buscar.addActionListener(new Eventos_seleccion_cliente(this));
        
                cbox_clientes = new javax.swing.JComboBox<>();
                
                        cbox_clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new Cliente[] {}));
                        cbox_clientes.addActionListener(new Eventos_seleccion_cliente(this));
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        				.addComponent(cbox_clientes, 0, 361, Short.MAX_VALUE)
        				.addGroup(gl_panel_1.createSequentialGroup()
        					.addComponent(tf_buscar, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(btn_buscar, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_buscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btn_buscar))
        			.addGap(18)
        			.addComponent(cbox_clientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(14, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);
        btn_atras = new javax.swing.JButton();
        panel.add(btn_atras);
        
                btn_atras.setText("ATRAS");
                btn_consulta = new javax.swing.JButton();
                panel.add(btn_consulta);
                
                        btn_consulta.setText("CONSULTA DATOS");
                        btn_consulta.addActionListener(new Eventos_seleccion_cliente(this));
                
                //EVENTOS DE CLASE:
                btn_atras.addActionListener(new Eventos_seleccion_cliente(this));
        getContentPane().setLayout(layout);

        pack();
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
    private JPanel panel;
    private JPanel panel_1;
}

