package vista;

import controlador.Eventos_error;

public class Ventana_error extends javax.swing.JDialog {

	public Ventana_error(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(350,200);
        this.setLocationRelativeTo(null); 
    } 
	
	
    private void initComponents() {

        l_error = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();

        setResizable(false);
        setTitle("Error");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_error.setText("ERROR GUARDANDO LOS DATOS");

        btn_ok.setText("OK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btn_ok))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(l_error)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(l_error)
                .addGap(33, 33, 33)
                .addComponent(btn_ok)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        
        //EVENTOS DE CLASE:
        btn_ok.addActionListener(new Eventos_error(this));
    }
    
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel l_error;             
}

