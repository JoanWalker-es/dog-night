package vista;

import controlador.Eventos_error;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;

public class Ventana_error extends javax.swing.JDialog {

	public Ventana_error(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(350,200);
        this.setLocationRelativeTo(null); 
    } 
	
	
    private void initComponents() {

        l_error = new javax.swing.JLabel();
        l_error.setHorizontalAlignment(SwingConstants.CENTER);
        btn_ok = new javax.swing.JButton();

        setResizable(false);
        setTitle("Error");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_error.setText("ERROR GUARDANDO LOS DATOS");

        btn_ok.setText("OK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(l_error, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(147)
        					.addComponent(btn_ok)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(l_error)
        			.addPreferredGap(ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
        			.addComponent(btn_ok)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_ok.addActionListener(new Eventos_error(this));
    } 
    
    
    public javax.swing.JLabel getL_error() {
		return l_error;
	}



	private javax.swing.JButton btn_ok;
    private javax.swing.JLabel l_error;             
}

