package vista;

import controlador.Eventos_alimentos;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Datos_alimentos extends javax.swing.JDialog {

    public Datos_alimentos(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(435,500);
        this.setLocationRelativeTo(null); 
    }                         
    private void initComponents() {
        
        setResizable(false);
        setTitle("Datos alimenticios");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Alimentaci\u00F3n:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "Intolerancias:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        panel_2 = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        				.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(3))
        );
        btn_atras = new javax.swing.JButton();
        panel_2.add(btn_atras);
        
                btn_atras.setText("ATRAS");
                btn_guardar = new javax.swing.JButton();
                panel_2.add(btn_guardar);
                
                        btn_guardar.setText("GUARDAR");
                        btn_guardar.addActionListener(new Eventos_alimentos(this));
                
                //EVENTOS DE CLASE:
                btn_atras.addActionListener(new Eventos_alimentos(this));
        l_intolerancias_tipo = new javax.swing.JLabel();
        
                l_intolerancias_tipo.setText("Tipo de intolerancia:");
        tf_intolerancia_tipo = new javax.swing.JTextField();
        l_intolerancias_descripcion = new javax.swing.JLabel();
        
                l_intolerancias_descripcion.setText("Descripción:");
        jScrollPane2 = new javax.swing.JScrollPane();
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_intolerancias_descripcion)
        				.addComponent(l_intolerancias_tipo))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        				.addComponent(tf_intolerancia_tipo, GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_intolerancia_tipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_intolerancias_tipo))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        				.addComponent(l_intolerancias_descripcion)
        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        ta_intolerancia_descripcion = new javax.swing.JTextArea();
        jScrollPane2.setViewportView(ta_intolerancia_descripcion);
        ta_intolerancia_descripcion.setLineWrap(true);
        ta_intolerancia_descripcion.setWrapStyleWord(true);
        
                ta_intolerancia_descripcion.setColumns(20);
                ta_intolerancia_descripcion.setRows(5);
        panel_1.setLayout(gl_panel_1);
        jScrollPane1 = new javax.swing.JScrollPane();
        l_alimentos_tipo = new javax.swing.JLabel();
        
                l_alimentos_tipo.setText("Tipo de alimento:");
        tf_alimentos_tipo = new javax.swing.JTextField();
        l_alimentos_cantidad = new javax.swing.JLabel();
        
                l_alimentos_cantidad.setText("Cantidad diaria:");
        tf_alimentos_cantidad = new javax.swing.JTextField();
        l_alimentos_comentarios = new javax.swing.JLabel();
        
                l_alimentos_comentarios.setText("Comentarios:");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(28)
        			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        				.addComponent(l_alimentos_cantidad)
        				.addComponent(l_alimentos_tipo)
        				.addComponent(l_alimentos_comentarios))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        				.addComponent(tf_alimentos_cantidad, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        				.addComponent(tf_alimentos_tipo, GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_alimentos_tipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_alimentos_tipo))
        			.addGap(6)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_alimentos_cantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_alimentos_cantidad))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_alimentos_comentarios))
        			.addContainerGap(50, Short.MAX_VALUE))
        );
        ta_alimentos_comentarios = new javax.swing.JTextArea();
        jScrollPane1.setViewportView(ta_alimentos_comentarios);
        ta_alimentos_comentarios.setLineWrap(true);
        ta_alimentos_comentarios.setWrapStyleWord(true);
        
                ta_alimentos_comentarios.setColumns(20);
                ta_alimentos_comentarios.setRows(5);
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
	public javax.swing.JTextArea getTa_alimentos_comentarios() {
		return ta_alimentos_comentarios;
	}
	public javax.swing.JTextArea getTa_intolerancia_descripcion() {
		return ta_intolerancia_descripcion;
	}
	public javax.swing.JTextField getTf_alimentos_cantidad() {
		return tf_alimentos_cantidad;
	}
	public javax.swing.JTextField getTf_alimentos_tipo() {
		return tf_alimentos_tipo;
	}
	public javax.swing.JTextField getTf_intolerancia_tipo() {
		return tf_intolerancia_tipo;
	}



	private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_alimentos_cantidad;
    private javax.swing.JLabel l_alimentos_comentarios;
    private javax.swing.JLabel l_alimentos_tipo;
    private javax.swing.JLabel l_intolerancias_descripcion;
    private javax.swing.JLabel l_intolerancias_tipo;
    private javax.swing.JTextArea ta_alimentos_comentarios;
    private javax.swing.JTextArea ta_intolerancia_descripcion;
    private javax.swing.JTextField tf_alimentos_cantidad;
    private javax.swing.JTextField tf_alimentos_tipo;
    private javax.swing.JTextField tf_intolerancia_tipo;
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
}

