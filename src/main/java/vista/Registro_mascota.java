package vista;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import controlador.Eventos_registro_mascota;

import javax.swing.GroupLayout;
import javax.swing.JButton;


public class Registro_mascota extends javax.swing.JDialog {

    public Registro_mascota(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(420,306);
        this.setLocationRelativeTo(null); 
    }            
    
    private void initComponents() {

        l_mascota_nombre = new javax.swing.JLabel();
        tf_mascota_nombre = new javax.swing.JTextField();
        tf_mascota_chip = new javax.swing.JTextField();
        l_mascota_chip = new javax.swing.JLabel();
        l_mascota_fecha = new javax.swing.JLabel();
        tf_mascota_fecha = new javax.swing.JTextField();
        tf_mascota_raza = new javax.swing.JTextField();
        l_mascota_raza = new javax.swing.JLabel();
        l_mascota_titulo = new javax.swing.JLabel();
        btn_mascota_medico = new javax.swing.JButton();
        btn_mascota_alimentos = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Registro mascota");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        btn_mascota_medico.setEnabled(false);
        btn_mascota_alimentos.setEnabled(false);

        l_mascota_nombre.setText("Nombre:");

        l_mascota_chip.setText("Microchip:");

        l_mascota_fecha.setText("Fecha nacimiento:");

        l_mascota_raza.setText("Raza:");

        l_mascota_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_mascota_titulo.setText("Datos de la mascota:");

        btn_mascota_medico.setText("DATOS MÉDICOS");

        btn_mascota_alimentos.setText("ALIMENTACIÓN");

        btn_atras.setText("ATRAS");

        btn_guardar.setText("GUARDAR");
        
        btn_limpiar = new JButton("LIMPIAR CAMPOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(91)
        					.addComponent(l_mascota_titulo))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(21)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(l_mascota_fecha)
        						.addComponent(l_mascota_chip)
        						.addComponent(l_mascota_nombre)
        						.addComponent(l_mascota_raza)
        						.addComponent(btn_atras))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(tf_mascota_fecha, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        								.addComponent(tf_mascota_chip, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        								.addComponent(tf_mascota_nombre, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        								.addComponent(tf_mascota_raza, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(btn_limpiar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(btn_mascota_medico, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(btn_mascota_alimentos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(71)
        							.addComponent(btn_guardar)))))
        			.addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(l_mascota_titulo)
        			.addGap(26)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_mascota_nombre)
        				.addComponent(tf_mascota_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btn_mascota_medico))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_mascota_chip)
        				.addComponent(tf_mascota_chip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btn_mascota_alimentos))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(l_mascota_fecha)
        						.addComponent(tf_mascota_fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(tf_mascota_raza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(l_mascota_raza))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btn_guardar)
        						.addComponent(btn_atras)))
        				.addComponent(btn_limpiar))
        			.addGap(78))
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_atras.addActionListener(new Eventos_registro_mascota(this));
        btn_guardar.addActionListener(new Eventos_registro_mascota(this));
        btn_mascota_alimentos.addActionListener(new Eventos_registro_mascota(this));
        btn_mascota_medico.addActionListener(new Eventos_registro_mascota(this));
        btn_limpiar.addActionListener(new Eventos_registro_mascota(this));
    }
        
                       
    public javax.swing.JButton getBtn_atras() {
		return btn_atras;
	}

	public javax.swing.JButton getBtn_guardar() {
		return btn_guardar;
	}

	public javax.swing.JButton getBtn_mascota_alimentos() {
		return btn_mascota_alimentos;
	}

	public javax.swing.JButton getBtn_mascota_medico() {
		return btn_mascota_medico;
	}

	public javax.swing.JTextField getTf_mascota_chip() {
		return tf_mascota_chip;
	}

	public javax.swing.JTextField getTf_mascota_fecha() {
		return tf_mascota_fecha;
	}

	public javax.swing.JTextField getTf_mascota_nombre() {
		return tf_mascota_nombre;
	}

	public javax.swing.JTextField getTf_mascota_raza() {
		return tf_mascota_raza;
	}
	
	public JButton getBtn_limpiar() {
		return btn_limpiar;
	}




	private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_mascota_alimentos;
    private javax.swing.JButton btn_mascota_medico;
    private javax.swing.JLabel l_mascota_chip;
    private javax.swing.JLabel l_mascota_fecha;
    private javax.swing.JLabel l_mascota_nombre;
    private javax.swing.JLabel l_mascota_raza;
    private javax.swing.JLabel l_mascota_titulo;
    private javax.swing.JTextField tf_mascota_chip;
    private javax.swing.JTextField tf_mascota_fecha;
    private javax.swing.JTextField tf_mascota_nombre;
    private javax.swing.JTextField tf_mascota_raza;
    private JButton btn_limpiar;
}

