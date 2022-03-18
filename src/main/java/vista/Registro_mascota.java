package vista;
import javax.swing.GroupLayout.Alignment;
import controlador.Eventos_registro_mascota;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Registro_mascota extends javax.swing.JDialog {

    public Registro_mascota(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(430,249);
        this.setLocationRelativeTo(null); 
    }            
    
    private void initComponents() {
        l_mascota_titulo = new javax.swing.JLabel();
        l_mascota_titulo.setHorizontalAlignment(SwingConstants.CENTER);
        
        setResizable(false);
        setTitle("Registro mascota");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_mascota_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_mascota_titulo.setText("Datos de la mascota:");
        
        panel = new JPanel();
        
        panel_1 = new JPanel();
        
        panel_2 = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(l_mascota_titulo, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        				.addComponent(panel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(266)
        			.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        			.addGap(20))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(l_mascota_titulo)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
        			.addGap(51)
        			.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        			.addGap(134)
        			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        btn_atras = new javax.swing.JButton();
        panel_2.add(btn_atras);
        
                btn_atras.setText("ATRAS");
                btn_guardar = new javax.swing.JButton();
                panel_2.add(btn_guardar);
                
                        btn_guardar.setText("GUARDAR");
                        btn_guardar.addActionListener(new Eventos_registro_mascota(this));
                
                btn_atras.addActionListener(new Eventos_registro_mascota(this));
        
        btn_limpiar = new JButton("LIMPIAR CAMPOS");
        btn_limpiar.addActionListener(new Eventos_registro_mascota(this));
        btn_mascota_alimentos = new javax.swing.JButton();
        btn_mascota_alimentos.setEnabled(false);
        
                btn_mascota_alimentos.setText("ALIMENTACIÓN");
                btn_mascota_alimentos.addActionListener(new Eventos_registro_mascota(this));
        btn_mascota_medico = new javax.swing.JButton();
        btn_mascota_medico.setEnabled(false);
        
                btn_mascota_medico.setText("DATOS MÉDICOS");
                btn_mascota_medico.addActionListener(new Eventos_registro_mascota(this));
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(btn_mascota_alimentos, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        				.addComponent(btn_mascota_medico, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btn_limpiar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap(173, Short.MAX_VALUE))
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(btn_mascota_medico)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btn_mascota_alimentos)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btn_limpiar)
        			.addContainerGap(33, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);
        l_mascota_fecha = new javax.swing.JLabel();
        l_mascota_fecha.setHorizontalAlignment(SwingConstants.RIGHT);
        
                l_mascota_fecha.setText("Fecha nacimiento:");
        l_mascota_chip = new javax.swing.JLabel();
        l_mascota_chip.setHorizontalAlignment(SwingConstants.RIGHT);
        
                l_mascota_chip.setText("Microchip:");
        
                l_mascota_nombre = new javax.swing.JLabel();
                l_mascota_nombre.setHorizontalAlignment(SwingConstants.RIGHT);
                
                        l_mascota_nombre.setText("Nombre:");
        tf_mascota_nombre = new javax.swing.JTextField();
        tf_mascota_chip = new javax.swing.JTextField();
        jDate_mascota_fecha = new JDateChooser();
        tf_mascota_raza = new javax.swing.JTextField();
        l_mascota_raza = new javax.swing.JLabel();
        l_mascota_raza.setHorizontalAlignment(SwingConstants.RIGHT);
        
                l_mascota_raza.setText("Raza:");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(l_mascota_raza, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(l_mascota_fecha, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        				.addComponent(l_mascota_chip, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(l_mascota_nombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(tf_mascota_chip)
        					.addComponent(tf_mascota_raza, Alignment.TRAILING)
        					.addComponent(jDate_mascota_fecha, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
        				.addComponent(tf_mascota_nombre))
        			.addContainerGap())
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(4)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_mascota_nombre)
        				.addComponent(tf_mascota_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGap(9)
        					.addComponent(tf_mascota_chip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGap(12)
        					.addComponent(l_mascota_chip)))
        			.addGap(8)
        			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jDate_mascota_fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_mascota_fecha))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_mascota_raza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_mascota_raza))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

	public javax.swing.JButton getBtn_mascota_alimentos() {
		return btn_mascota_alimentos;
	}

	public javax.swing.JButton getBtn_mascota_medico() {
		return btn_mascota_medico;
	}

	public javax.swing.JTextField getTf_mascota_chip() {
		return tf_mascota_chip;
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
	
	public JDateChooser getjDate_mascota_fecha() {
		return jDate_mascota_fecha;
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
    private javax.swing.JTextField tf_mascota_nombre;
    private javax.swing.JTextField tf_mascota_raza;
    private JDateChooser jDate_mascota_fecha;
    private JButton btn_limpiar;
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
}

