package vista;

import controlador.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que genera la ventana de la interfaz
 * Ventana de guardado correcto.
 */
public class Ventana_guardado_ok extends javax.swing.JDialog {

    public Ventana_guardado_ok(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(350,200);
        this.setLocationRelativeTo(null); 
    }                        
    private void initComponents() {

        l_guardado = new javax.swing.JLabel();
        l_guardado.setHorizontalAlignment(SwingConstants.CENTER);
        
        setResizable(false);
        setTitle("Guardado correcto");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_guardado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_guardado.setText("DATOS GUARDADOS CORRECTAMENTE.");
        
        JPanel panel = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        				.addComponent(l_guardado, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(48)
        			.addComponent(l_guardado)
        			.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        btn_ok = new javax.swing.JButton();
        panel.add(btn_ok);
        
                btn_ok.setText("OK");               
                
        getContentPane().setLayout(layout);

        pack();
        
      //EVENTOS DE CLASE:
        btn_ok.addActionListener(new Eventos_guardado_ok(this));
    }
    
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel l_guardado;          
}
