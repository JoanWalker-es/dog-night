package vista;

import controlador.Eventos_crear_reserva;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.JScrollPane;

public class Crear_reserva extends javax.swing.JDialog {

    public Crear_reserva(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(460, 570);
        this.setLocationRelativeTo(null); 
    }
    
    private void initComponents() {

        l_reserva_llegada = new javax.swing.JLabel();
        l_reserva_salida = new javax.swing.JLabel();
        l_reserva_total = new javax.swing.JLabel();
        l_reserva_peluqueria = new javax.swing.JLabel();
        l_reserva_alimentacion = new javax.swing.JLabel();
        l_reserva_comentarios = new javax.swing.JLabel();
        l_reserva_precio = new javax.swing.JLabel();
        cbox_peluqueria = new javax.swing.JCheckBox();
        cbox_alimentos = new javax.swing.JCheckBox();
        tf_reserva_total_dias = new javax.swing.JTextField();
        jdate_llegada = new com.toedter.calendar.JDateChooser();
        jdate_salida = new com.toedter.calendar.JDateChooser();
        tf_precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        btn_cancelar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();    
        cbox_socio = new JCheckBox();
        l_reserva_socio = new JLabel();
        modelo = new DefaultListModel();
        
        setResizable(false);
        setTitle("Creación de reserva");
        tf_precio.setEditable(false);
        tf_reserva_total_dias.setEditable(false);

        l_reserva_llegada.setText("Fecha llegada:");

        l_reserva_salida.setText("Fecha salida:");

        l_reserva_total.setText("Total de días:");

        l_reserva_peluqueria.setText("Servicio peluquería:");

        l_reserva_alimentacion.setText("Servicio alimentación:");

        l_reserva_comentarios.setText("Comentarios:");

        l_reserva_precio.setText("TOTAL €:");

        cbox_peluqueria.setText("SI");

        cbox_alimentos.setText("SI");

        btn_cancelar.setText("ATRAS");

        btn_registrar.setText("REGISTRAR RESERVA");        
        
        l_reserva_socio.setText("Socio:");        
        
        cbox_socio.setText("SI");
        
        l_reserva_mascotas = new JLabel();
        l_reserva_mascotas.setText("Mascotas:");
        ta_comentarios = new javax.swing.JTextArea();
        ta_comentarios.setBorder(UIManager.getBorder("Button.border"));
        ta_comentarios.setLineWrap(true);
        ta_comentarios.setWrapStyleWord(true);
        
        ta_comentarios.setColumns(20);
        ta_comentarios.setRows(5);
        
        JScrollPane scrollPane = new JScrollPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(28)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(tf_precio, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_reserva_precio))
        			.addContainerGap(1037, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(84)
        			.addComponent(btn_cancelar)
        			.addGap(33)
        			.addComponent(btn_registrar)
        			.addContainerGap(816, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(61)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_reserva_llegada)
        				.addComponent(l_reserva_salida)
        				.addComponent(l_reserva_total)
        				.addComponent(l_reserva_peluqueria)
        				.addComponent(l_reserva_alimentacion)
        				.addComponent(l_reserva_socio)
        				.addComponent(l_reserva_mascotas))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(cbox_peluqueria)
        				.addComponent(tf_reserva_total_dias, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jdate_salida, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jdate_llegada, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(cbox_socio, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(cbox_alimentos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(280, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(104)
        			.addComponent(l_reserva_comentarios)
        			.addContainerGap(967, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(ta_comentarios)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(51)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_reserva_llegada)
        				.addComponent(jdate_llegada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_reserva_salida)
        				.addComponent(jdate_salida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_total)
        				.addComponent(tf_reserva_total_dias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_peluqueria)
        				.addComponent(cbox_peluqueria))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(cbox_alimentos, Alignment.TRAILING)
        				.addComponent(l_reserva_alimentacion, Alignment.TRAILING))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_socio)
        				.addComponent(cbox_socio))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(l_reserva_mascotas)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(l_reserva_comentarios)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(ta_comentarios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(142)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(226)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(40)
        					.addComponent(l_reserva_precio)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(tf_precio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btn_registrar)
        						.addComponent(btn_cancelar))))
        			.addContainerGap(239, Short.MAX_VALUE))
        );
        
        list_mascotas = new JList();
        scrollPane.setRowHeaderView(list_mascotas);
        list_mascotas.setBorder(UIManager.getBorder("Button.border"));
        
        list_mascotas.setModel(modelo);
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_cancelar.addActionListener(new Eventos_crear_reserva(this));
        btn_registrar.addActionListener(new Eventos_crear_reserva(this));
        addWindowListener(new Eventos_crear_reserva(this));
    }    
    
    public javax.swing.JButton getBtn_cancelar() {
		return btn_cancelar;
	}

	public javax.swing.JButton getBtn_registrar() {
		return btn_registrar;
	}

	public javax.swing.JCheckBox getCbox_alimentos() {
		return cbox_alimentos;
	}

	public javax.swing.JCheckBox getCbox_peluqueria() {
		return cbox_peluqueria;
	}

	public com.toedter.calendar.JDateChooser getJdate_llegada() {
		return jdate_llegada;
	}

	public com.toedter.calendar.JDateChooser getJdate_salida() {
		return jdate_salida;
	}

	public javax.swing.JTextArea getTa_comentarios() {
		return ta_comentarios;
	}

	public javax.swing.JTextField getTf_precio() {
		return tf_precio;
	}

	public javax.swing.JTextField getTf_reserva_total_dias() {
		return tf_reserva_total_dias;
	}
	
	public JCheckBox getCbox_socio() {
		return cbox_socio;
	}
	
	public JList getList_mascotas() {
		return list_mascotas;
	}

	public DefaultListModel getModelo() {
		return modelo;
	}




	private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JCheckBox cbox_alimentos;
    private javax.swing.JCheckBox cbox_peluqueria;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdate_llegada;
    private com.toedter.calendar.JDateChooser jdate_salida;
    private javax.swing.JLabel l_reserva_alimentacion;
    private javax.swing.JLabel l_reserva_comentarios;
    private javax.swing.JLabel l_reserva_llegada;
    private javax.swing.JLabel l_reserva_peluqueria;
    private javax.swing.JLabel l_reserva_precio;
    private javax.swing.JLabel l_reserva_salida;
    private javax.swing.JLabel l_reserva_total;
    private javax.swing.JTextArea ta_comentarios;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_reserva_total_dias;
    private JCheckBox cbox_socio;
    private JLabel l_reserva_socio;
    private JList list_mascotas;
    private JLabel l_reserva_mascotas;
    private DefaultListModel modelo;
}

