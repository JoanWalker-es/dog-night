package vista;

import controlador.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;

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
        btn_ok = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Guardado correcto");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_guardado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_guardado.setText("DATOS GUARDADOS CORRECTAMENTE.");

        btn_ok.setText("OK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(153)
        					.addComponent(btn_ok))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(l_guardado, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(48)
        			.addComponent(l_guardado)
        			.addGap(32)
        			.addComponent(btn_ok)
        			.addContainerGap(49, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_ok.addActionListener(new Eventos_guardado_ok(this));
    }
    
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel l_guardado;          
}
