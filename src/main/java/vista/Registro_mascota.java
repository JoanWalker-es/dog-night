package vista;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;


public class Registro_mascota extends javax.swing.JFrame {

    public Registro_mascota() {
        initComponents();
        setSize(350,350);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(21)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(l_mascota_raza)
        						.addComponent(l_mascota_fecha)
        						.addComponent(l_mascota_chip)
        						.addComponent(l_mascota_nombre))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(tf_mascota_fecha, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        						.addComponent(tf_mascota_nombre, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        						.addComponent(tf_mascota_chip, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        						.addComponent(tf_mascota_raza, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(91)
        					.addComponent(l_mascota_titulo))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(45)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(btn_atras)
        						.addComponent(btn_mascota_medico))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btn_guardar)
        						.addComponent(btn_mascota_alimentos))))
        			.addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(l_mascota_titulo)
        			.addGap(26)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_mascota_nombre)
        				.addComponent(tf_mascota_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_mascota_chip)
        				.addComponent(tf_mascota_chip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_mascota_fecha)
        				.addComponent(tf_mascota_fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(l_mascota_raza)
        				.addComponent(tf_mascota_raza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(39)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_mascota_medico)
        				.addComponent(btn_mascota_alimentos))
        			.addGap(27)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_atras)
        				.addComponent(btn_guardar))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
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
                      
}

