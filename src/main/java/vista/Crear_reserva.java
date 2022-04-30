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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que genera la ventana de la interfaz
 * Crear reserva.
 */
public class Crear_reserva extends javax.swing.JDialog {

    public Crear_reserva(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(350, 600);
        this.setLocationRelativeTo(null);    
                    
    }
    
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        l_reserva_salida = new javax.swing.JLabel();
        l_reserva_total = new javax.swing.JLabel();
        l_reserva_peluqueria = new javax.swing.JLabel();
        l_reserva_alimentacion = new javax.swing.JLabel();
        cbox_peluqueria = new javax.swing.JCheckBox();
        cbox_alimentos = new javax.swing.JCheckBox();
        tf_reserva_total_dias = new javax.swing.JTextField();
        jdate_llegada = new com.toedter.calendar.JDateChooser();
        l_reserva_llegada = new javax.swing.JLabel();
        jdate_salida = new com.toedter.calendar.JDateChooser();
        l_reserva_socio = new javax.swing.JLabel();
        cbox_socio = new javax.swing.JCheckBox();
        modelo = new DefaultListModel();

        setResizable(false);
        setTitle("Creación de reserva");
        tf_reserva_total_dias.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        l_reserva_salida.setText("Fecha salida:");

        l_reserva_total.setText("Total de días:");

        l_reserva_peluqueria.setText("Servicio peluquería:");

        l_reserva_alimentacion.setText("Servicio alimentación:");

        cbox_peluqueria.setText("SI");

        cbox_alimentos.setText("SI");

        l_reserva_llegada.setText("Fecha llegada:");

        l_reserva_socio.setText("Socio:");

        cbox_socio.setText("SI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(l_reserva_llegada)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jdate_llegada, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(l_reserva_socio)
        						.addComponent(l_reserva_salida)
        						.addComponent(l_reserva_total)
        						.addComponent(l_reserva_peluqueria)
        						.addComponent(l_reserva_alimentacion))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(cbox_socio)
        						.addComponent(cbox_alimentos)
        						.addComponent(cbox_peluqueria)
        						.addComponent(tf_reserva_total_dias, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jdate_salida, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_reserva_llegada)
        				.addComponent(jdate_llegada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jdate_salida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_reserva_salida))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_total)
        				.addComponent(tf_reserva_total_dias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_peluqueria)
        				.addComponent(cbox_peluqueria))
        			.addGap(3)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_alimentacion)
        				.addComponent(cbox_alimentos))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_socio)
        				.addComponent(cbox_socio))
        			.addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);
        
        panel = new JPanel();
        
        panel_1 = new JPanel();
        
        panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Mascotas:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(null, "Comentarios:", TitledBorder.LEADING, TitledBorder.TOP, null, null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
        				.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
        				.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
        				.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jScrollPane1 = new javax.swing.JScrollPane();
        GroupLayout gl_panel_3 = new GroupLayout(panel_3);
        gl_panel_3.setHorizontalGroup(
        	gl_panel_3.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_3.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        			.addContainerGap())
        );
        gl_panel_3.setVerticalGroup(
        	gl_panel_3.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_3.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        			.addContainerGap())
        );
        ta_comentarios = new javax.swing.JTextArea();
        jScrollPane1.setViewportView(ta_comentarios);
        ta_comentarios.setLineWrap(true);
        ta_comentarios.setWrapStyleWord(true);
        
                ta_comentarios.setColumns(20);
                ta_comentarios.setRows(5);
        panel_3.setLayout(gl_panel_3);
        jScrollPane2 = new javax.swing.JScrollPane();
        GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        gl_panel_2.setHorizontalGroup(
        	gl_panel_2.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_2.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        			.addContainerGap())
        );
        gl_panel_2.setVerticalGroup(
        	gl_panel_2.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_2.createSequentialGroup()
        			.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        			.addContainerGap())
        );
        list_mascotas = new JList(); 
        jScrollPane2.setViewportView(list_mascotas);
        
        list_mascotas.setModel(modelo);
        panel_2.setLayout(gl_panel_2);
        l_reserva_precio = new javax.swing.JLabel();
        
                l_reserva_precio.setText("TOTAL:");
        tf_precio = new javax.swing.JTextField();
        tf_precio.setHorizontalAlignment(SwingConstants.CENTER);
        tf_precio.setEditable(false);
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(92)
        			.addComponent(l_reserva_precio)
        			.addGap(18)
        			.addComponent(tf_precio, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        			.addGap(53))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(5)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_precio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_reserva_precio))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        btn_cancelar = new javax.swing.JButton();
        panel_1.add(btn_cancelar);
        
                btn_cancelar.setText("CANCELAR");
                btn_registrar = new javax.swing.JButton();
                panel_1.add(btn_registrar);
                
                        btn_registrar.setText("REGISTRAR RESERVA");
                        btn_registrar.addActionListener(new Eventos_crear_reserva(this));  
                        btn_cancelar.addActionListener(new Eventos_crear_reserva(this));
        getContentPane().setLayout(layout);

        pack();
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

	public javax.swing.JCheckBox getCbox_socio() {
		return cbox_socio;
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
    private javax.swing.JCheckBox cbox_socio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdate_llegada;
    private com.toedter.calendar.JDateChooser jdate_salida;
    private javax.swing.JLabel l_reserva_alimentacion;
    private javax.swing.JLabel l_reserva_llegada;
    private javax.swing.JLabel l_reserva_peluqueria;
    private javax.swing.JLabel l_reserva_precio;
    private javax.swing.JLabel l_reserva_salida;
    private javax.swing.JLabel l_reserva_socio;
    private javax.swing.JLabel l_reserva_total;
    private javax.swing.JTextArea ta_comentarios;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_reserva_total_dias;
    private JList list_mascotas;
    private DefaultListModel modelo;
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
}

