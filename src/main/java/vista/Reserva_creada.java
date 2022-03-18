package vista;

import controlador.Eventos_reserva_creada;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Reserva_creada extends javax.swing.JDialog {
    
    public Reserva_creada(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(400,350);
        this.setLocationRelativeTo(null); 
    }
                       
    private void initComponents() {

        l_creada = new javax.swing.JLabel();
        l_creada.setHorizontalAlignment(SwingConstants.CENTER);
        l_inicio = new javax.swing.JLabel();
        l_fin = new javax.swing.JLabel();
        l_total = new javax.swing.JLabel();
        tf_inicio = new javax.swing.JTextField();
        tf_fin = new javax.swing.JTextField();
        tf_total = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        l_total_mascotas = new JLabel();
        
        tf_inicio.setEditable(false);
        tf_fin.setEditable(false);
        tf_total.setEditable(false);        
        
        setResizable(false);
        setTitle("Reserva creada");        

        l_creada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_creada.setText("RESERVA CREADA CORRECTAMENTE");

        l_inicio.setText("Fecha inicio:");

        l_fin.setText("Fecha fin:");

        l_total.setText("TOTAL A PAGAR:");

        btn_aceptar.setText("ACEPTAR");
        
        
        l_total_mascotas.setText("Total mascotas:");
        
        tf_total_mascotas = new JTextField();
        tf_total_mascotas.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(54, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(l_inicio)
        					.addComponent(l_fin)
        					.addComponent(l_total, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addComponent(l_total_mascotas, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(tf_total, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        				.addComponent(tf_total_mascotas, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        				.addComponent(tf_fin, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        				.addComponent(tf_inicio, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        			.addGap(110))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(l_creada, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(145)
        			.addComponent(btn_aceptar)
        			.addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(38)
        			.addComponent(l_creada)
        			.addGap(45)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_inicio)
        				.addComponent(tf_inicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_fin)
        				.addComponent(tf_fin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_total_mascotas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_total_mascotas))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_total)
        				.addComponent(tf_total, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
        			.addComponent(btn_aceptar)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_aceptar.addActionListener(new Eventos_reserva_creada(this));
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
}
