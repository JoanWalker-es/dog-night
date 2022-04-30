package vista;

import controlador.Eventos_medico;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que genera la ventana de la interfaz
 * Datos médicos.
 */
public class Datos_medicos extends javax.swing.JDialog {

    public Datos_medicos(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();setSize(500,600);
        this.setLocationRelativeTo(null); 
    }                         
    private void initComponents() {
        
    	l_medico_titulo = new javax.swing.JLabel();
    	l_medico_titulo.setHorizontalAlignment(SwingConstants.CENTER);
    	ta_medicacion_comentarios = new JTextArea();
        
        setResizable(false);
        setTitle("Datos médicos");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_medico_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_medico_titulo.setText("Datos médicos:");
        
        panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "General:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "Vacuna rabia:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Medicaci\u00F3n:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        panel_3 = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        				.addComponent(l_medico_titulo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        				.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(21)
        			.addComponent(l_medico_titulo)
        			.addGap(18)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(15))
        );
        btn_atras = new javax.swing.JButton();
        panel_3.add(btn_atras);
        
                btn_atras.setText("ATRAS");
                btn_guardar = new javax.swing.JButton();
                panel_3.add(btn_guardar);
                
                        btn_guardar.setText("GUARDAR");
                        btn_guardar.addActionListener(new Eventos_medico(this));
                
                //EVENTOS DE CLASE:
                btn_atras.addActionListener(new Eventos_medico(this));
        l_medicacion_nombre = new javax.swing.JLabel();
        
                l_medicacion_nombre.setText("Nombre:");
        tf_medicacion_nombre = new javax.swing.JTextField();
        l_medicacion_dosis = new javax.swing.JLabel();
        
                l_medicacion_dosis.setText("Dosis diaria:");
        tf_medicacion_dosis = new javax.swing.JTextField();
        l_medicacion_comentario = new javax.swing.JLabel();
        
                l_medicacion_comentario.setText("Comentarios:");        
        
        ta_medicacion_comentarios.setWrapStyleWord(true);
        ta_medicacion_comentarios.setLineWrap(true);
        ta_medicacion_comentarios.setBorder(UIManager.getBorder("FormattedTextField.border"));
        GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        gl_panel_2.setHorizontalGroup(
        	gl_panel_2.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_2.createSequentialGroup()
        			.addGap(49)
        			.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_medicacion_dosis)
        				.addComponent(l_medicacion_nombre)
        				.addComponent(l_medicacion_comentario))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_panel_2.createSequentialGroup()
        					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(tf_medicacion_dosis, Alignment.TRAILING)
        						.addComponent(tf_medicacion_nombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
        					.addContainerGap())
        				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
        					.addComponent(ta_medicacion_comentarios, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        gl_panel_2.setVerticalGroup(
        	gl_panel_2.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_2.createSequentialGroup()
        			.addGap(1)
        			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_medicacion_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_medicacion_nombre))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_medicacion_dosis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_medicacion_dosis))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
        				.addComponent(ta_medicacion_comentarios, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_medicacion_comentario))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_2.setLayout(gl_panel_2);
        tf_vacuna_nombre = new javax.swing.JTextField();
        l_vacuna_nombre = new javax.swing.JLabel();
        
                l_vacuna_nombre.setText("Nombre:");
        l_vacuna_fecha = new javax.swing.JLabel();
        
                l_vacuna_fecha.setText("Fecha inoculación:");
        jDate_vacuna_fecha = new com.toedter.calendar.JDateChooser();
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addGap(23)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_vacuna_nombre)
        				.addComponent(l_vacuna_fecha))
        			.addGap(10)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jDate_vacuna_fecha, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(tf_vacuna_nombre, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_vacuna_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_vacuna_nombre))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        				.addComponent(jDate_vacuna_fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_vacuna_fecha))
        			.addContainerGap(16, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);
        l_medico_peso = new javax.swing.JLabel();
        
                l_medico_peso.setText("Peso:");
        tf_mascota_peso = new javax.swing.JTextField();
        cbox_sexo = new javax.swing.JComboBox<>();
        
                cbox_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra"}));
        l_medico_sexo = new javax.swing.JLabel();
        
                l_medico_sexo.setText("Sexo:");
        cbox_talla = new javax.swing.JComboBox<>();
        
                cbox_talla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Talla S", "Talla M", "Talla L", "Talla XL"}));
        l_medico_talla = new javax.swing.JLabel();
        
                l_medico_talla.setText("Talla:");
        cbox_esterilizado = new javax.swing.JCheckBox();
        
                cbox_esterilizado.setText("SI");
        l_medico_esterilizado = new javax.swing.JLabel();
        
                l_medico_esterilizado.setText("Esterilizado:");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
        			.addGap(51)
        			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_medico_peso)
        				.addComponent(l_medico_sexo)
        				.addComponent(l_medico_talla)
        				.addComponent(l_medico_esterilizado))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addComponent(cbox_esterilizado)
        				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(cbox_talla, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(cbox_sexo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
        				.addComponent(tf_mascota_peso, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_mascota_peso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_medico_peso))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cbox_sexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_medico_sexo))
        			.addGap(6)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cbox_talla, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_medico_talla))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cbox_esterilizado)
        				.addComponent(l_medico_esterilizado))
        			.addContainerGap(11, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        getContentPane().setLayout(layout);

        pack();
        
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
	private javax.swing.JTextField tf_mascota_peso;
	private javax.swing.JTextField tf_medicacion_dosis;
	private javax.swing.JTextField tf_medicacion_nombre;
	private javax.swing.JTextField tf_vacuna_nombre;
	private javax.swing.JTextArea ta_medicacion_comentarios;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
}