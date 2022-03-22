package vista;

import controlador.Eventos_eliminar_reserva;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Eliminar_reserva extends javax.swing.JDialog {

    public Eliminar_reserva(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(400,200);
        this.setLocationRelativeTo(null); 
    }
                        
    private void initComponents() {

        l_mensaje = new javax.swing.JLabel();
        l_mensaje.setHorizontalAlignment(SwingConstants.CENTER);
       
        setResizable(false);
        setTitle("Eliminar reserva");

        l_mensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_mensaje.setText("¿SEGURO DE DESEAS ELIMINAR LA RESERVA?");
        
        panel = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(l_mensaje, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(42)
        			.addComponent(l_mensaje)
        			.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        btn_cancelar = new javax.swing.JButton();
        panel.add(btn_cancelar);
        
                btn_cancelar.setText("CANCELAR");
                btn_aceptar = new javax.swing.JButton();
                panel.add(btn_aceptar);
                
                        btn_aceptar.setText("ACEPTAR");
                        
                        //EVENTOS DE CLASE:
                        btn_aceptar.addActionListener(new Eventos_eliminar_reserva(this));
                btn_cancelar.addActionListener(new Eventos_eliminar_reserva(this));
        getContentPane().setLayout(layout);

        pack();
        
    }   
    
    public javax.swing.JButton getBtn_aceptar() {
		return btn_aceptar;
	}

	public javax.swing.JButton getBtn_cancelar() {
		return btn_cancelar;
	}



	private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel l_mensaje;          
    private JPanel panel;
}
