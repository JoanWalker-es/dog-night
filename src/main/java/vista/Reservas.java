package vista;

import controlador.Eventos_reservas;
import modelo.Cliente;
import modelo.Reserva;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que genera la ventana de la interfaz
 * Reservas.
 */
public class Reservas extends javax.swing.JDialog {

    public Reservas(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(1000,360);
        this.setLocationRelativeTo(null); 
    }
                         
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reservas = new javax.swing.JTable();
        
        setResizable(false);
        setTitle("Reservas");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        modelo = new DefaultTableModel();
        
        tabla_reservas.setModel(modelo);
        
        modelo.addColumn("Código"); 
        modelo.addColumn("Fecha inicio"); 
        modelo.addColumn("Fecha fin"); 
        modelo.addColumn("Servicios"); 
        modelo.addColumn("Comentarios"); 
        modelo.addColumn("Total €"); 
        
        TableColumnModel columnMode = tabla_reservas.getColumnModel();
        columnMode.getColumn(0).setMaxWidth(50);
        columnMode.getColumn(0).setMinWidth(50);
        columnMode.getColumn(1).setMaxWidth(90);
        columnMode.getColumn(1).setMinWidth(90);
        columnMode.getColumn(2).setMaxWidth(90);
        columnMode.getColumn(2).setMinWidth(90);
        columnMode.getColumn(3).setMaxWidth(220);
        columnMode.getColumn(3).setMinWidth(220);
        columnMode.getColumn(4).setMaxWidth(450);
        columnMode.getColumn(4).setMinWidth(450);
        columnMode.getColumn(5).setMaxWidth(60);
        columnMode.getColumn(5).setMinWidth(50);
        
        tabla_reservas.setColumnSelectionAllowed(true);
        tabla_reservas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_reservas);
        tabla_reservas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
        panel = new JPanel();
        
        panel_1 = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        
                l_cliente = new javax.swing.JLabel();
                
                        l_cliente.setText("Cliente:");
                        cbox_selec_cliente = new javax.swing.JComboBox<>();
                        
                                cbox_selec_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new Cliente[] {}));
                                btn_mostrar = new JButton();
                                
                                btn_mostrar.setText("MOSTRAR RESERVAS");
                                GroupLayout gl_panel_1 = new GroupLayout(panel_1);
                                gl_panel_1.setHorizontalGroup(
                                	gl_panel_1.createParallelGroup(Alignment.LEADING)
                                		.addGroup(gl_panel_1.createSequentialGroup()
                                			.addGap(179)
                                			.addComponent(l_cliente)
                                			.addGap(18)
                                			.addComponent(cbox_selec_cliente, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                			.addGap(18)
                                			.addComponent(btn_mostrar)
                                			.addGap(273))
                                );
                                gl_panel_1.setVerticalGroup(
                                	gl_panel_1.createParallelGroup(Alignment.LEADING)
                                		.addGroup(gl_panel_1.createSequentialGroup()
                                			.addGap(5)
                                			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                				.addComponent(btn_mostrar)
                                				.addComponent(cbox_selec_cliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                				.addComponent(l_cliente))
                                			.addGap(1))
                                );
                                panel_1.setLayout(gl_panel_1);
                                btn_mostrar.addActionListener(new Eventos_reservas(this));
        btn_atras = new javax.swing.JButton();
        
                btn_atras.setText("ATRAS");
                btn_eliminar = new javax.swing.JButton();
                btn_eliminar.setEnabled(false);
                
                        btn_eliminar.setText("ELIMINAR RESERVA");
                        btn_eliminar.addActionListener(new Eventos_reservas(this));
                btn_modificar = new JButton();
                
                btn_modificar.setText("MODIFICAR RESERVA");
                btn_modificar.setEnabled(false);
                btn_modificar.addActionListener(new Eventos_reservas(this));
                btn_crear = new javax.swing.JButton();       
                
                        btn_crear.setText("CREAR RESERVA");
                        btn_crear.addActionListener(new Eventos_reservas(this));
                panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
                panel.add(btn_atras);
                panel.add(btn_eliminar);
                panel.add(btn_modificar);
                panel.add(btn_crear);              
                
                btn_atras.addActionListener(new Eventos_reservas(this));
        getContentPane().setLayout(layout);

        pack();
        addWindowListener(new Eventos_reservas(this));
    }    
    
    public javax.swing.JButton getBtn_atras() {
		return btn_atras;
	}

	public javax.swing.JButton getBtn_crear() {
		return btn_crear;
	}

	public javax.swing.JButton getBtn_eliminar() {
		return btn_eliminar;
	}

	public javax.swing.JComboBox<Cliente> getCbox_selec_cliente() {
		return cbox_selec_cliente;
	}

	public javax.swing.JTable getTabla_reservas() {
		return tabla_reservas;
	}

	public JButton getBtn_mostrar() {
		return btn_mostrar;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}
	
	public JButton getBtn_modificar() {
		return btn_modificar;
	}


	private JButton btn_mostrar;
	private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<Cliente> cbox_selec_cliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_cliente;
    private javax.swing.JTable tabla_reservas;      
    private DefaultTableModel modelo;
    private JButton btn_modificar;
    private JPanel panel;
    private JPanel panel_1;
}
