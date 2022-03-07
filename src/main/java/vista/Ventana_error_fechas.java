package vista;

import controlador.Eventos_error;
import controlador.Eventos_error_fechas;

public class Ventana_error_fechas extends javax.swing.JDialog {

	public Ventana_error_fechas(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(500,200);
        this.setLocationRelativeTo(null); 
    } 
	
	
	private void initComponents() {

        l_error = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        l_error1 = new javax.swing.JLabel();

        setResizable(false);
        setTitle("Error");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_error.setText("ERROR GUARDANDO LOS DATOS");

        btn_ok.setText("OK");

        l_error1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_error1.setText("DEBE SELECCIONAR LAS FECHAS DE LLEGADA Y SALIDA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(l_error))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btn_ok))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(l_error1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l_error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_error1)
                .addGap(18, 18, 18)
                .addComponent(btn_ok)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        
        //EVENTOS DE CLASE:
        btn_ok.addActionListener(new Eventos_error_fechas(this));
	}
	
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel l_error;
    private javax.swing.JLabel l_error1;            
}
