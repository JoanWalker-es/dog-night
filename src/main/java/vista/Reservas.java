package vista;

import controlador.Eventos_reservas;
import modelo.Cliente;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JButton;

public class Reservas extends javax.swing.JDialog {

    public Reservas(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(900,400);
        this.setLocationRelativeTo(null); 
    }
                         
    private void initComponents() {

        l_cliente = new javax.swing.JLabel();
        cbox_selec_cliente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reservas = new javax.swing.JTable();
        btn_atras = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();       
        btn_mostrar = new JButton();
        
        setResizable(false);
        setTitle("Reservas");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_cliente.setText("Cliente:");

        cbox_selec_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new Cliente[] {}));

        tabla_reservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Reserva", "Fecha inicio", "Fecha fin", "Peluquería", "Alimentación", "Comentarios", "Total"
            }
        ));
        tabla_reservas.setColumnSelectionAllowed(true);
        tabla_reservas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_reservas);
        tabla_reservas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btn_atras.setText("ATRAS");

        btn_eliminar.setText("ELIMINAR RESERVA");

        btn_crear.setText("CREAR RESERVA");
        
        btn_mostrar.setText("MOSTRAR RESERVAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(72)
        					.addComponent(l_cliente)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(cbox_selec_cliente, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(btn_mostrar, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(29)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 802, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(169)
        					.addComponent(btn_atras)
        					.addGap(83)
        					.addComponent(btn_eliminar)
        					.addGap(92)
        					.addComponent(btn_crear)))
        			.addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(28)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_cliente)
        				.addComponent(cbox_selec_cliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btn_mostrar))
        			.addGap(35)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_atras)
        				.addComponent(btn_eliminar)
        				.addComponent(btn_crear))
        			.addContainerGap(40, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_atras.addActionListener(new Eventos_reservas(this));
        btn_crear.addActionListener(new Eventos_reservas(this));
        btn_eliminar.addActionListener(new Eventos_reservas(this));
        btn_mostrar.addActionListener(new Eventos_reservas(this));
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



	private JButton btn_mostrar;
	private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<Cliente> cbox_selec_cliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_cliente;
    private javax.swing.JTable tabla_reservas;      
}
