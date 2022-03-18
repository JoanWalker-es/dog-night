package vista;


import controlador.Eventos_calendario;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;

public class Calendario extends javax.swing.JDialog {

    public Calendario(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(475,491);
        this.setLocationRelativeTo(null); 
    }
                       
    private void initComponents() {

        jCalendar = new com.toedter.calendar.JCalendar();
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

        l_numero_mascotas.setText("Total mascotas día seleccionado:");

        ta_reservas.setColumns(20);
        ta_reservas.setRows(5);
        jScrollPane1.setViewportView(ta_reservas);

        l_reservas.setText("Reservas:");
        
        panel = new JPanel();
        FlowLayout flowLayout = (FlowLayout) panel.getLayout();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(l_numero_mascotas)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(tf_mascotas, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
        							.addGap(0, 232, Short.MAX_VALUE))
        						.addComponent(jCalendar, GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(l_reservas)
        					.addGap(0, 205, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jCalendar, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_numero_mascotas)
        				.addComponent(tf_mascotas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(l_reservas)
        			.addGap(8)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(panel, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        			.addGap(52))
        );
        btn_atras = new javax.swing.JButton();
        panel.add(btn_atras);
        
                btn_atras.setText("VOLVER");
                
                //EVENTOS DE LA CLASE:
                btn_atras.addActionListener(new Eventos_calendario(this));
        getContentPane().setLayout(layout);

        pack();
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
    private JPanel panel;
}

