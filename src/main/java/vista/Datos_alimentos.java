package vista;

import controlador.Eventos_alimentos;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

public class Datos_alimentos extends javax.swing.JDialog {

    public Datos_alimentos(javax.swing.JDialog parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(500,550);
        this.setLocationRelativeTo(null); 
    }                         
    private void initComponents() {

        l_alimentos = new javax.swing.JLabel();
        l_alimentos_tipo = new javax.swing.JLabel();
        l_alimentos_cantidad = new javax.swing.JLabel();
        l_alimentos_comentarios = new javax.swing.JLabel();
        tf_alimentos_tipo = new javax.swing.JTextField();
        tf_alimentos_cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_alimentos_comentarios = new javax.swing.JTextArea();
        l_intolerancias = new javax.swing.JLabel();
        l_intolerancias_tipo = new javax.swing.JLabel();
        l_intolerancias_descripcion = new javax.swing.JLabel();
        tf_intolerancia_tipo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_intolerancia_descripcion = new javax.swing.JTextArea();
        btn_atras = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Datos alimenticios");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        ta_intolerancia_descripcion.setLineWrap(true);
        ta_intolerancia_descripcion.setWrapStyleWord(true);
        ta_alimentos_comentarios.setLineWrap(true);
        ta_alimentos_comentarios.setWrapStyleWord(true);

        l_alimentos.setText("Alimentación:");

        l_alimentos_tipo.setText("Tipo de alimento:");

        l_alimentos_cantidad.setText("Cantidad diaria:");

        l_alimentos_comentarios.setText("Comentarios:");

        ta_alimentos_comentarios.setColumns(20);
        ta_alimentos_comentarios.setRows(5);
        jScrollPane1.setViewportView(ta_alimentos_comentarios);

        l_intolerancias.setText("Intolerancias:");

        l_intolerancias_tipo.setText("Tipo de intolerancia:");

        l_intolerancias_descripcion.setText("Descripción:");

        ta_intolerancia_descripcion.setColumns(20);
        ta_intolerancia_descripcion.setRows(5);
        jScrollPane2.setViewportView(ta_intolerancia_descripcion);

        btn_atras.setText("ATRAS");

        btn_guardar.setText("GUARDAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(33)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(l_intolerancias)
        				.addComponent(l_alimentos)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createSequentialGroup()
        						.addGap(60)
        						.addComponent(btn_atras)
        						.addGap(78)
        						.addComponent(btn_guardar))
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(l_intolerancias_descripcion)
        							.addComponent(l_alimentos_cantidad)
        							.addComponent(l_alimentos_comentarios)
        							.addComponent(l_alimentos_tipo)
        							.addComponent(l_intolerancias_tipo))
        						.addPreferredGap(ComponentPlacement.UNRELATED)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(tf_intolerancia_tipo)
        								.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(tf_alimentos_cantidad)
        								.addComponent(tf_alimentos_tipo))))))
        			.addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(38)
        			.addComponent(l_alimentos)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_alimentos_tipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_alimentos_tipo, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_alimentos_cantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_alimentos_cantidad, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_alimentos_comentarios, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
        			.addGap(38)
        			.addComponent(l_intolerancias)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tf_intolerancia_tipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_intolerancias_tipo))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(l_intolerancias_descripcion))
        			.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_atras)
        				.addComponent(btn_guardar))
        			.addGap(31))
        );
        getContentPane().setLayout(layout);

        pack();
        
        //EVENTOS DE CLASE:
        btn_atras.addActionListener(new Eventos_alimentos(this));
        btn_guardar.addActionListener(new Eventos_alimentos(this));
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
    private javax.swing.JLabel l_alimentos;
    private javax.swing.JLabel l_alimentos_cantidad;
    private javax.swing.JLabel l_alimentos_comentarios;
    private javax.swing.JLabel l_alimentos_tipo;
    private javax.swing.JLabel l_intolerancias;
    private javax.swing.JLabel l_intolerancias_descripcion;
    private javax.swing.JLabel l_intolerancias_tipo;
    private javax.swing.JTextArea ta_alimentos_comentarios;
    private javax.swing.JTextArea ta_intolerancia_descripcion;
    private javax.swing.JTextField tf_alimentos_cantidad;
    private javax.swing.JTextField tf_alimentos_tipo;
    private javax.swing.JTextField tf_intolerancia_tipo;
}

