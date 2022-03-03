package vista;

import controlador.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Ventana_principal extends javax.swing.JFrame {
	
	    public Ventana_principal() {
	        initComponents();setSize(600,550);
	        this.setLocationRelativeTo(null); 
	    }
	                         
	    private void initComponents() {

	    	label_titulo = new javax.swing.JLabel();
	        btn_reservas = new javax.swing.JButton();
	        btn_calendario = new javax.swing.JButton();
	        btn_nuevo_cliente = new javax.swing.JButton();
	        btn_precios = new javax.swing.JButton();
	        btn_seleccion_cliente = new javax.swing.JButton();
	        
	        setResizable(false);
	        setTitle("Dog-Night");
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 18));
	        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        label_titulo.setText("Hotel canino Dog-Night");

	        btn_reservas.setText("RESERVAS");
	        btn_reservas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        btn_calendario.setText("CALENDARIO");
	        btn_calendario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        btn_nuevo_cliente.setText("NUEVO CLIENTE");
	        btn_nuevo_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        btn_precios.setText("PRECIOS");
	        btn_precios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        btn_seleccion_cliente.setText("SELECCION CLIENTES");
	        btn_seleccion_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addContainerGap(103, Short.MAX_VALUE)
	        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        						.addGroup(layout.createSequentialGroup()
	        							.addPreferredGap(ComponentPlacement.RELATED)
	        							.addComponent(btn_seleccion_cliente, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
	        							.addGap(4)
	        							.addComponent(btn_nuevo_cliente, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
	        						.addGroup(layout.createSequentialGroup()
	        							.addGap(2)
	        							.addComponent(btn_calendario, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
	        							.addPreferredGap(ComponentPlacement.RELATED)
	        							.addComponent(btn_precios, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
	        							.addPreferredGap(ComponentPlacement.RELATED)
	        							.addComponent(btn_reservas, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))))
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(162)
	        					.addComponent(label_titulo, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)))
	        			.addContainerGap(100, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGap(29)
	        			.addComponent(label_titulo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
	        			.addPreferredGap(ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(btn_calendario, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(btn_precios, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(btn_reservas, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(btn_seleccion_cliente, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(btn_nuevo_cliente, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
	        			.addGap(80))
	        );
	        getContentPane().setLayout(layout);

	        pack();
	        
	        
	        //EVENTOS DE LA CLASE:
	        btn_calendario.addActionListener(new Eventos_principal(this));
	        btn_precios.addActionListener(new Eventos_principal(this));
	        btn_nuevo_cliente.addActionListener(new Eventos_principal(this));
	        btn_reservas.addActionListener(new Eventos_principal(this));
	        btn_seleccion_cliente.addActionListener(new Eventos_principal(this));
	    }
	    
	    
                    
	    public javax.swing.JButton getBtn_reservas() {
			return btn_reservas;
		}
		public javax.swing.JButton getBtn_calendario() {
			return btn_calendario;
		}
		public javax.swing.JButton getBtn_nuevo_cliente() {
			return btn_nuevo_cliente;
		}
		public javax.swing.JButton getBtn_precios() {
			return btn_precios;
		}
		public javax.swing.JButton getBtn_seleccion_cliente() {
			return btn_seleccion_cliente;
		}

		private javax.swing.JButton btn_calendario;
	    private javax.swing.JButton btn_nuevo_cliente;
	    private javax.swing.JButton btn_precios;
	    private javax.swing.JButton btn_reservas;
	    private javax.swing.JButton btn_seleccion_cliente;
	    private javax.swing.JLabel label_titulo;        
	}



