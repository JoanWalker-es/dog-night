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
        tf_mascota_sexo = new javax.swing.JTextField();
        tf_mascota_peso = new javax.swing.JTextField();
        l_vacunas = new javax.swing.JLabel();
        l_vacuna_nombre = new javax.swing.JLabel();
        l_vacuna_fecha = new javax.swing.JLabel();
        tf_vacuna_nombre = new javax.swing.JTextField();
        tf_vacuna_fecha = new javax.swing.JTextField();
        l_medicacion = new javax.swing.JLabel();
        l_medicacion_nombre = new javax.swing.JLabel();
        l_medicacion_dosis = new javax.swing.JLabel();
        l_medicacion_comentario = new javax.swing.JLabel();
        tf_medicacion_nombre = new javax.swing.JTextField();
        tf_medicacion_dosis = new javax.swing.JTextField();
        btn_atras = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        ta_medicacion_comentarios=new javax.swing.JTextArea();
        
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

        cbox_talla.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L", "XL"}));

        l_vacunas.setText("Vacuna rabia:");

        l_vacuna_nombre.setText("Nombre:");

        l_vacuna_fecha.setText("Fecha inoculación:");

        l_medicacion.setText("Medicación:");

        l_medicacion_nombre.setText("Nombre:");

        l_medicacion_dosis.setText("Dosis diaria:");

        l_medicacion_comentario.setText("Comentarios:");

        btn_atras.setText("ATRAS");

        btn_guardar.setText("GUARDAR");       
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(109)
        					.addComponent(l_medico_titulo))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(44)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(btn_atras)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(l_vacunas)
        							.addComponent(l_medicacion)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(l_medico_peso)
        								.addComponent(l_vacuna_fecha)
        								.addComponent(l_medico_esterilizado)
        								.addComponent(l_medico_talla)
        								.addComponent(l_medico_sexo)))
        						.addComponent(l_medicacion_dosis)
        						.addComponent(l_medicacion_nombre)
        						.addComponent(l_medicacion_comentario)
        						.addComponent(l_vacuna_nombre))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(ta_medicacion_comentarios, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
        								.addComponent(cbox_esterilizado)
        								.addComponent(cbox_talla, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        									.addComponent(tf_medicacion_dosis, Alignment.LEADING)
        									.addComponent(tf_medicacion_nombre, Alignment.LEADING)
        									.addComponent(tf_vacuna_fecha, Alignment.LEADING)
        									.addComponent(tf_vacuna_nombre, Alignment.LEADING)
        									.addComponent(tf_mascota_peso, Alignment.LEADING)
        									.addComponent(tf_mascota_sexo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(114)
        							.addComponent(btn_guardar)))
        					.addGap(62)))
        			.addGap(105))
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
        				.addComponent(tf_mascota_sexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_medico_sexo))
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
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_vacuna_fecha)
        				.addComponent(tf_vacuna_fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(l_medicacion)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medicacion_nombre)
        				.addComponent(tf_medicacion_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medicacion_dosis)
        				.addComponent(tf_medicacion_dosis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_medicacion_comentario)
        				.addComponent(ta_medicacion_comentarios, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
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
	public javax.swing.JTextField getTf_mascota_sexo() {
		return tf_mascota_sexo;
	}
	public javax.swing.JTextField getTf_medicacion_dosis() {
		return tf_medicacion_dosis;
	}
	public javax.swing.JTextField getTf_medicacion_nombre() {
		return tf_medicacion_nombre;
	}
	public javax.swing.JTextField getTf_vacuna_fecha() {
		return tf_vacuna_fecha;
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




	private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JCheckBox cbox_esterilizado;
    private javax.swing.JComboBox<String> cbox_talla;
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
    private javax.swing.JTextField tf_mascota_peso;
    private javax.swing.JTextField tf_mascota_sexo;
    private javax.swing.JTextField tf_medicacion_dosis;
    private javax.swing.JTextField tf_medicacion_nombre;
    private javax.swing.JTextField tf_vacuna_fecha;
    private javax.swing.JTextField tf_vacuna_nombre; 
    private javax.swing.JTextArea ta_medicacion_comentarios;
}
