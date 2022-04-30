package vista;

import controlador.Eventos_error;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que genera la ventana de la interfaz
 * Ventana de error.
 */
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

        setResizable(false);
        setTitle("Error");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_error.setText("ERROR GUARDANDO LOS DATOS");
        
        JPanel panel = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        				.addComponent(l_error, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(l_error)
        			.addPreferredGap(ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        btn_ok = new javax.swing.JButton();
        panel.add(btn_ok);
        
                btn_ok.setText("OK");              
                
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

