package vista;

import java.beans.PropertyChangeListener;

import controlador.Eventos_calendario;

public class Calendario extends javax.swing.JDialog {

    public Calendario(java.awt.Frame parent,boolean modal) {
    	super(parent,modal);
        initComponents();
        setSize(450,400);
        this.setLocationRelativeTo(null); 
    }
                       
    private void initComponents() {

        jCalendar = new com.toedter.calendar.JCalendar();
        btn_atras = new javax.swing.JButton();
        
        setResizable(false);
        setTitle("Calendario reservas");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_atras.setText("ATRAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btn_atras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_atras)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        
        //EVENTOS DE LA CLASE:
        btn_atras.addActionListener(new Eventos_calendario(this));
        addWindowListener(new Eventos_calendario(this));
        jCalendar.getDayChooser().addPropertyChangeListener(new Eventos_calendario(this));
    }       
    
    
    public javax.swing.JButton getBtn_atras() {
		return btn_atras;
	}

	public com.toedter.calendar.JCalendar getjCalendar() {
		return jCalendar;
	}




	private javax.swing.JButton btn_atras;
    private com.toedter.calendar.JCalendar jCalendar;
}

