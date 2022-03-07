package vista;

import controlador.Eventos_medico;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

public class Datos_medicos extends javax.swing.JDialog {

    public Datos_medicos(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();setSize(500,600);
        this.setLocationRelativeTo(null); 
    }                         
    private void initComponents() {
        
    	l_medico_titulo = new javax.swing.JLabel();
        l_medico_peso = new javax.swing.JLabel();
        l_medico_sexo = new javax.swing.JLabel();
        l_medico_talla = new javax.swing.JLabel();
        l_medico_esterilizado = new javax.swing.JLabel();
        cbox_esterilizado = new javax.swing.JCheckBox();
        cbox_talla = new javax.swing.JComboBox<>();
        tf_mascota_peso = new javax.swing.JTextField();
        l_vacunas = new javax.swing.JLabel();
        l_vacuna_nombre = new javax.swing.JLabel();
        l_vacuna_fecha = new javax.swing.JLabel();
        tf_vacuna_nombre = new javax.swing.JTextField();
        l_medicacion = new javax.swing.JLabel();
        l_medicacion_nombre = new javax.swing.JLabel();
        l_medicacion_dosis = new javax.swing.JLabel();
        l_medicacion_comentario = new javax.swing.JLabel();
        tf_medicacion_nombre = new javax.swing.JTextField();
        tf_medicacion_dosis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_medicacion_comentarios = new javax.swing.JTextArea();
        btn_atras = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        cbox_sexo = new javax.swing.JComboBox<>();
        jDate_vacuna_fecha = new com.toedter.calendar.JDateChooser();
        
        setResizable(false);
        setTitle("Datos médicos");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);        
        ta_medicacion_comentarios.setLineWrap(true);
        ta_medicacion_comentarios.setWrapStyleWord(true);

        l_medico_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_medico_titulo.setText("Datos médicos:");

        l_medico_peso.setText("Peso:");

        l_medico_sexo.setText("Sexo:");

        l_medico_talla.setText("Talla:");

        l_medico_esterilizado.setText("Esterilizado:");

        cbox_esterilizado.setText("SI");

        cbox_talla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Talla S", "Talla M", "Talla L", "Talla XL"}));       

        l_vacunas.setText("Vacuna rabia:");

        l_vacuna_nombre.setText("Nombre:");

        l_vacuna_fecha.setText("Fecha inoculación:");

        l_medicacion.setText("Medicación:");

        l_medicacion_nombre.setText("Nombre:");

        l_medicacion_dosis.setText("Dosis diaria:");

        l_medicacion_comentario.setText("Comentarios:");

        ta_medicacion_comentarios.setColumns(20);
        ta_medicacion_comentarios.setRows(5);
        jScrollPane1.setViewportView(ta_medicacion_comentarios);

        btn_atras.setText("ATRAS");

        btn_guardar.setText("GUARDAR");

        cbox_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(109)
        					.addComponent(l_medico_titulo))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(41)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(btn_atras)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(l_vacunas)
        										.addComponent(l_medicacion))
        									.addGap(22)))
        							.addGap(7))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(l_medico_sexo, Alignment.TRAILING)
        								.addComponent(l_medico_peso, Alignment.TRAILING)
        								.addComponent(l_medico_talla, Alignment.TRAILING)
        								.addComponent(l_medico_esterilizado, Alignment.TRAILING)
        								.addComponent(l_vacuna_nombre, Alignment.TRAILING)
        								.addComponent(l_vacuna_fecha, Alignment.TRAILING)
        								.addComponent(l_medicacion_nombre, Alignment.TRAILING)
        								.addComponent(l_medicacion_dosis, Alignment.TRAILING)
        								.addComponent(l_medicacion_comentario, Alignment.TRAILING))
        							.addPreferredGap(ComponentPlacement.UNRELATED)))
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(btn_guardar)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(cbox_sexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(cbox_talla, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(tf_medicacion_dosis, Alignment.LEADING)
        								.addComponent(tf_medicacion_nombre, Alignment.LEADING)
        								.addComponent(jDate_vacuna_fecha, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(tf_vacuna_nombre, Alignment.LEADING)
        								.addComponent(tf_mascota_peso, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
        						.addComponent(cbox_esterilizado, Alignment.LEADING))))
        			.addContainerGap(87, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(38)
        			.addComponent(l_medico_titulo)
        			.addGap(34)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medico_peso)
        				.addComponent(tf_mascota_peso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medico_sexo)
        				.addComponent(cbox_sexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medico_talla)
        				.addComponent(cbox_talla, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medico_esterilizado)
        				.addComponent(cbox_esterilizado))
        			.addGap(26)
        			.addComponent(l_vacunas)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_vacuna_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_vacuna_nombre))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(l_vacuna_fecha)
        					.addGap(24)
        					.addComponent(l_medicacion))
        				.addComponent(jDate_vacuna_fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medicacion_nombre)
        				.addComponent(tf_medicacion_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medicacion_dosis)
        				.addComponent(tf_medicacion_dosis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(l_medicacion_comentario)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_atras)
        				.addComponent(btn_guardar))
        			.addGap(25))
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_atras.addActionListener(new Eventos_medico(this));
        btn_guardar.addActionListener(new Eventos_medico(this));
        
    }    
    
    public javax.swing.JButton getBtn_atras() {
		return btn_atras;
	}
	public javax.swing.JButton getBtn_guardar() {
		return btn_guardar;
	}
	public javax.swing.JTextArea getTa_medicacion_comentarios() {
		return ta_medicacion_comentarios;
	}
	public javax.swing.JTextField getTf_mascota_peso() {
		return tf_mascota_peso;
	}	
	public javax.swing.JTextField getTf_medicacion_dosis() {
		return tf_medicacion_dosis;
	}
	public javax.swing.JTextField getTf_medicacion_nombre() {
		return tf_medicacion_nombre;
	}	
	public javax.swing.JTextField getTf_vacuna_nombre() {
		return tf_vacuna_nombre;
	}	
	public javax.swing.JCheckBox getCbox_esterilizado() {
		return cbox_esterilizado;
	}
	public javax.swing.JComboBox<String> getCbox_talla() {
		return cbox_talla;
	}
	public javax.swing.JComboBox<String> getCbox_sexo() {
		return cbox_sexo;
	}
	public com.toedter.calendar.JDateChooser getjDate_vacuna_fecha() {
		return jDate_vacuna_fecha;
	}




	private javax.swing.JButton btn_atras;
	private javax.swing.JButton btn_guardar;
	private javax.swing.JCheckBox cbox_esterilizado;
	private javax.swing.JComboBox<String> cbox_sexo;
	private javax.swing.JComboBox<String> cbox_talla;
	private com.toedter.calendar.JDateChooser jDate_vacuna_fecha;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel l_medicacion;
	private javax.swing.JLabel l_medicacion_comentario;
	private javax.swing.JLabel l_medicacion_dosis;
	private javax.swing.JLabel l_medicacion_nombre;
	private javax.swing.JLabel l_medico_esterilizado;
	private javax.swing.JLabel l_medico_peso;
	private javax.swing.JLabel l_medico_sexo;
	private javax.swing.JLabel l_medico_talla;
	private javax.swing.JLabel l_medico_titulo;
	private javax.swing.JLabel l_vacuna_fecha;
	private javax.swing.JLabel l_vacuna_nombre;
	private javax.swing.JLabel l_vacunas;
	private javax.swing.JTextArea ta_medicacion_comentarios;
	private javax.swing.JTextField tf_mascota_peso;
	private javax.swing.JTextField tf_medicacion_dosis;
	private javax.swing.JTextField tf_medicacion_nombre;
	private javax.swing.JTextField tf_vacuna_nombre;
}