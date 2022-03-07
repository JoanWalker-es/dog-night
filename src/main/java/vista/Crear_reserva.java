package vista;

import controlador.Eventos_crear_reserva;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;

public class Crear_reserva extends javax.swing.JDialog {

    public Crear_reserva(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(550,550);
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
        ta_comentarios = new javax.swing.JTextArea();
        ta_comentarios.setLineWrap(true);
        ta_comentarios.setWrapStyleWord(true);
        btn_cancelar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();    
        cbox_socio = new JCheckBox();
        l_reserva_socio = new JLabel();
        
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

        ta_comentarios.setColumns(20);
        ta_comentarios.setRows(5);
        jScrollPane1.setViewportView(ta_comentarios);

        btn_cancelar.setText("ATRAS");

        btn_registrar.setText("REGISTRAR RESERVA");        
        
        l_reserva_socio.setText("Socio:");        
        
        cbox_socio.setText("SI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(48)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(l_reserva_llegada)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(btn_cancelar)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(l_reserva_peluqueria)
        							.addComponent(l_reserva_alimentacion)
        							.addComponent(l_reserva_total)
        							.addComponent(l_reserva_salida)
        							.addComponent(l_reserva_precio)
        							.addComponent(tf_precio, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addComponent(l_reserva_socio, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
        					.addGap(93)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(l_reserva_comentarios)
        						.addComponent(jdate_salida, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbox_peluqueria)
        						.addComponent(tf_reserva_total_dias, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jdate_llegada, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btn_registrar)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(cbox_socio, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(cbox_alimentos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        			.addContainerGap(49, Short.MAX_VALUE))
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
        			.addGap(23)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_total)
        				.addComponent(tf_reserva_total_dias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_peluqueria)
        				.addComponent(cbox_peluqueria))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_alimentacion)
        				.addComponent(cbox_alimentos))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_socio)
        				.addComponent(cbox_socio))
        			.addGap(19)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_reserva_precio)
        				.addComponent(l_reserva_comentarios))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(tf_precio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_registrar)
        				.addComponent(btn_cancelar))
        			.addGap(62))
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_cancelar.addActionListener(new Eventos_crear_reserva(this));
        btn_registrar.addActionListener(new Eventos_crear_reserva(this));
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
}

