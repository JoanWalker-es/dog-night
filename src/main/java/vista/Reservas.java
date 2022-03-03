package vista;

import controlador.Eventos_reservas;

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
        
        setResizable(false);
        setTitle("Reservas");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_cliente.setText("Cliente:");

        cbox_selec_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(l_cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbox_selec_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btn_atras)
                        .addGap(83, 83, 83)
                        .addComponent(btn_eliminar)
                        .addGap(92, 92, 92)
                        .addComponent(btn_crear)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_cliente)
                    .addComponent(cbox_selec_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_crear))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        
        //EVENTOS DE CLASE:
        btn_atras.addActionListener(new Eventos_reservas(this));
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

	public javax.swing.JComboBox<String> getCbox_selec_cliente() {
		return cbox_selec_cliente;
	}

	public javax.swing.JTable getTabla_reservas() {
		return tabla_reservas;
	}



	private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> cbox_selec_cliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_cliente;
    private javax.swing.JTable tabla_reservas;      
}
