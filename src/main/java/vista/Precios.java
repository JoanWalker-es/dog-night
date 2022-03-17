package vista;

import controlador.Eventos_precios;

public class Precios extends javax.swing.JDialog {

    public Precios(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(450,400);
        this.setLocationRelativeTo(null); 
    }
                         
    private void initComponents() {

        btn_atras = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        l_estancia = new javax.swing.JLabel();
        l_socios = new javax.swing.JLabel();
        l_peluqueria = new javax.swing.JLabel();
        l_alimentos = new javax.swing.JLabel();
        tf_general = new javax.swing.JTextField();
        tf_socios = new javax.swing.JTextField();
        tf_peluqueria = new javax.swing.JTextField();
        tf_alimentos = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        l_habitaciones = new javax.swing.JLabel();
        tf_habitaciones = new javax.swing.JTextField();

        setResizable(false);
        setTitle("Configuración de precios");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        btn_atras.setText("ATRAS");

        btn_guardar.setText("GUARDAR");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PRECIOS"));

        l_estancia.setText("Precio general estancia:");

        l_socios.setText("Precios socios:");

        l_peluqueria.setText("Servicio peluquería:");

        l_alimentos.setText("Servicios alimentación diaria:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_estancia)
                    .addComponent(l_socios)
                    .addComponent(l_peluqueria)
                    .addComponent(l_alimentos))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_peluqueria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_socios, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_general, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_estancia)
                    .addComponent(tf_general, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_socios)
                    .addComponent(tf_socios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_peluqueria)
                    .addComponent(tf_peluqueria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_alimentos)
                    .addComponent(tf_alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DISPONIBILIDAD"));

        l_habitaciones.setText("Habitaciones del hotel:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(l_habitaciones)
                .addGap(85, 85, 85)
                .addComponent(tf_habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_habitaciones)
                    .addComponent(tf_habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btn_atras)
                .addGap(126, 126, 126)
                .addComponent(btn_guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras)
                    .addComponent(btn_guardar))
                .addContainerGap(26, Short.MAX_VALUE))
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

	public javax.swing.JTextField getTf_habitaciones() {
		return tf_habitaciones;
	}




	private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l_alimentos;
    private javax.swing.JLabel l_estancia;
    private javax.swing.JLabel l_habitaciones;
    private javax.swing.JLabel l_peluqueria;
    private javax.swing.JLabel l_socios;
    private javax.swing.JTextField tf_alimentos;
    private javax.swing.JTextField tf_general;
    private javax.swing.JTextField tf_habitaciones;
    private javax.swing.JTextField tf_peluqueria;
    private javax.swing.JTextField tf_socios;      
}

