package vista;

import controlador.Eventos_precios;

public class Precios extends javax.swing.JDialog {

    public Precios(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(400,300);
        this.setLocationRelativeTo(null); 
    }
                         
    private void initComponents() {

        l_estancia = new javax.swing.JLabel();
        l_socios = new javax.swing.JLabel();
        l_peluqueria = new javax.swing.JLabel();
        l_alimentos = new javax.swing.JLabel();
        tf_general = new javax.swing.JTextField();
        tf_socios = new javax.swing.JTextField();
        tf_peluqueria = new javax.swing.JTextField();
        tf_alimentos = new javax.swing.JTextField();
        btn_atras = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Configuración de precios");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_estancia.setText("Precio general estancia:");

        l_socios.setText("Precios socios:");

        l_peluqueria.setText("Servicio peluquería:");

        l_alimentos.setText("Servicios alimentación diaria:");

        btn_atras.setText("ATRAS");

        btn_guardar.setText("GUARDAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_estancia)
                            .addComponent(l_socios)
                            .addComponent(l_peluqueria)
                            .addComponent(l_alimentos))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_peluqueria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_socios, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_general, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_atras)
                        .addGap(82, 82, 82)
                        .addComponent(btn_guardar)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_estancia)
                    .addComponent(tf_general, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_socios)
                    .addComponent(tf_socios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_peluqueria)
                    .addComponent(tf_peluqueria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_alimentos)
                    .addComponent(tf_alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras)
                    .addComponent(btn_guardar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
        
        //EVENTOS DE CLASE:
        btn_atras.addActionListener(new Eventos_precios(this));
        btn_guardar.addActionListener(new Eventos_precios(this));
        addWindowListener(new Eventos_precios(this));
    }
    
    
    public javax.swing.JButton getBtn_atras() {
		return btn_atras;
	}

	public javax.swing.JButton getBtn_guardar() {
		return btn_guardar;
	}

	public javax.swing.JTextField getTf_alimentos() {
		return tf_alimentos;
	}

	public javax.swing.JTextField getTf_general() {
		return tf_general;
	}

	public javax.swing.JTextField getTf_peluqueria() {
		return tf_peluqueria;
	}

	public javax.swing.JTextField getTf_socios() {
		return tf_socios;
	}



	private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel l_alimentos;
    private javax.swing.JLabel l_estancia;
    private javax.swing.JLabel l_peluqueria;
    private javax.swing.JLabel l_socios;
    private javax.swing.JTextField tf_alimentos;
    private javax.swing.JTextField tf_general;
    private javax.swing.JTextField tf_peluqueria;
    private javax.swing.JTextField tf_socios;      
}

