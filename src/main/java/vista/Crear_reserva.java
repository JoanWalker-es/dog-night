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
        setSize(460, 650);
        this.setLocationRelativeTo(null);    
                    
    }
    
    private void initComponents() {

        l_reserva_comentarios = new javax.swing.JLabel();
        l_reserva_precio = new javax.swing.JLabel();
        tf_precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_comentarios = new javax.swing.JTextArea();
        btn_cancelar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
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
        l_reserva_mascotas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_mascotas = new JList(); 
        modelo = new DefaultListModel();

        setResizable(false);
        setTitle("Creación de reserva");
        tf_precio.setEditable(false);
        tf_reserva_total_dias.setEditable(false);        

        l_reserva_comentarios.setText("Comentarios:");

        l_reserva_precio.setText("TOTAL:");

        ta_comentarios.setColumns(20);
        ta_comentarios.setRows(5);
        jScrollPane1.setViewportView(ta_comentarios);

        btn_cancelar.setText("CANCELAR");

        btn_registrar.setText("REGISTRAR RESERVA");

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
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l_reserva_llegada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdate_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_reserva_salida, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l_reserva_total, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l_reserva_peluqueria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l_reserva_alimentacion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l_reserva_socio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbox_alimentos)
                            .addComponent(cbox_peluqueria)
                            .addComponent(tf_reserva_total_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdate_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_socio))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_reserva_llegada)
                    .addComponent(jdate_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdate_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_reserva_salida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_reserva_total)
                    .addComponent(tf_reserva_total_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_reserva_peluqueria)
                    .addComponent(cbox_peluqueria))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_reserva_alimentacion)
                    .addComponent(cbox_alimentos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_reserva_socio)
                    .addComponent(cbox_socio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l_reserva_mascotas.setText("Mascotas:");

        list_mascotas.setModel(modelo);
        
        jScrollPane2.setViewportView(list_mascotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_reserva_comentarios)
                    .addComponent(l_reserva_mascotas)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(l_reserva_precio)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btn_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btn_registrar)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_reserva_mascotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_reserva_comentarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_reserva_precio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_registrar))
                .addContainerGap())
        );

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
    private javax.swing.JLabel l_reserva_comentarios;
    private javax.swing.JLabel l_reserva_llegada;
    private javax.swing.JLabel l_reserva_mascotas;
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
}

