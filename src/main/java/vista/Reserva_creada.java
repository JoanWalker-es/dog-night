package vista;

import controlador.Eventos_reserva_creada;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class Reserva_creada extends javax.swing.JDialog {
	/**
	 * 
	 * @author Juan De la Rubia
	 * 
	 * Clase que genera la ventana de la interfaz
	 * Reserva creada.
	 */
    public Reserva_creada(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(380,332);
        this.setLocationRelativeTo(null); 
    }
                       
    private void initComponents() {

        l_creada = new javax.swing.JLabel();
        l_creada.setHorizontalAlignment(SwingConstants.CENTER);
        
        setResizable(false);
        setTitle("Reserva creada");        

        l_creada.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        l_creada.setText("RESERVA CREADA CORRECTAMENTE");
        
        panel = new JPanel();
        
        panel_1 = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        				.addComponent(l_creada, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        				.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(38)
        			.addComponent(l_creada)
        			.addGap(18)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        btn_aceptar = new javax.swing.JButton();
        panel_1.add(btn_aceptar);
        
                btn_aceptar.setText("ACEPTAR");
                                
                btn_aceptar.addActionListener(new Eventos_reserva_creada(this));
        l_total = new javax.swing.JLabel();
        l_total.setHorizontalAlignment(SwingConstants.RIGHT);
        
                l_total.setText("TOTAL A PAGAR:");
        l_total_mascotas = new JLabel();
        l_total_mascotas.setHorizontalAlignment(SwingConstants.RIGHT);
        
        
        l_total_mascotas.setText("Total mascotas:");
        l_fin = new javax.swing.JLabel();
        l_fin.setHorizontalAlignment(SwingConstants.RIGHT);
        
                l_fin.setText("Fecha fin:");
        l_inicio = new javax.swing.JLabel();
        l_inicio.setHorizontalAlignment(SwingConstants.RIGHT);
        
                l_inicio.setText("Fecha inicio:");
        tf_total = new javax.swing.JTextField();
        tf_total.setEditable(false);
        
        tf_total_mascotas = new JTextField();
        tf_total_mascotas.setEditable(false);
        tf_fin = new javax.swing.JTextField();
        tf_fin.setEditable(false);
        tf_inicio = new javax.swing.JTextField();
        
        tf_inicio.setEditable(false);
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(l_inicio, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(l_fin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(l_total_mascotas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(l_total, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addComponent(tf_total, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        				.addComponent(tf_total_mascotas, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        				.addComponent(tf_fin, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        				.addComponent(tf_inicio, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(88, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_inicio)
        				.addComponent(tf_inicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_fin)
        				.addComponent(tf_fin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_total_mascotas)
        				.addComponent(tf_total_mascotas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_total)
        				.addComponent(tf_total, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(29, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        getContentPane().setLayout(layout);

        pack();
        addWindowListener(new Eventos_reserva_creada(this));
    }    
    
    public javax.swing.JButton getBtn_aceptar() {
		return btn_aceptar;
	}

	public javax.swing.JTextField getTf_fin() {
		return tf_fin;
	}

	public javax.swing.JTextField getTf_inicio() {
		return tf_inicio;
	}

	public javax.swing.JTextField getTf_total() {
		return tf_total;
	}
	
	public JTextField getTf_total_mascotas() {
		return tf_total_mascotas;
	}
	
	public javax.swing.JLabel getL_creada() {
		return l_creada;
	}

	private javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel l_creada;
    private javax.swing.JLabel l_fin;
    private javax.swing.JLabel l_inicio;
    private javax.swing.JLabel l_total;
    private javax.swing.JTextField tf_fin;
    private javax.swing.JTextField tf_inicio;
    private javax.swing.JTextField tf_total;         
    private JTextField tf_total_mascotas;
    private JLabel l_total_mascotas;
    private JPanel panel;
    private JPanel panel_1;
}
