package vista;


import controlador.Eventos_calendario;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calendario extends javax.swing.JDialog {

    public Calendario(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(463,499);
        this.setLocationRelativeTo(null); 
    }
                       
    private void initComponents() {

        jCalendar = new com.toedter.calendar.JCalendar();
        btn_atras = new javax.swing.JButton();
        l_numero_mascotas = new javax.swing.JLabel();
        tf_mascotas = new javax.swing.JTextField();
        tf_mascotas.setHorizontalAlignment(SwingConstants.CENTER);
        tf_mascotas.setFont(new Font("Arial Black", Font.BOLD, 13));
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_reservas = new javax.swing.JTextArea();
        l_reservas = new javax.swing.JLabel();
        
        tf_mascotas.setEditable(false);
        ta_reservas.setEditable(false);

        setResizable(false);
        setTitle("Calendario reservas");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_atras.setText("VOLVER");

        l_numero_mascotas.setText("Total mascotas día seleccionado:");

        ta_reservas.setColumns(20);
        ta_reservas.setRows(5);
        jScrollPane1.setViewportView(ta_reservas);

        l_reservas.setText("Reservas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(l_numero_mascotas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jCalendar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(btn_atras))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(l_reservas)))
                        .addGap(0, 205, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_numero_mascotas)
                    .addComponent(tf_mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_reservas)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btn_atras)
                .addContainerGap())
        );

        pack();
        
        //EVENTOS DE LA CLASE:
        btn_atras.addActionListener(new Eventos_calendario(this));
        addWindowListener(new Eventos_calendario(this));
        jCalendar.getDayChooser().addPropertyChangeListener(new Eventos_calendario(this));
    }       
    
    
    public javax.swing.JButton getBtn_atras() {
		return btn_atras;
	}

	public com.toedter.calendar.JCalendar getjCalendar() {
		return jCalendar;
	}

	public javax.swing.JTextArea getTa_reservas() {
		return ta_reservas;
	}

	public javax.swing.JTextField getTf_mascotas() {
		return tf_mascotas;
	}



	private javax.swing.JButton btn_atras;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_reservas;
    private javax.swing.JLabel l_numero_mascotas;
    private javax.swing.JLabel l_reservas;
    private javax.swing.JTextField tf_mascotas;
}

