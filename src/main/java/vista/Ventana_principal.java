package vista;

import controlador.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Ventana_principal extends javax.swing.JFrame {
	
	    public Ventana_principal() {
	        initComponents();setSize(550,450);
	        this.setLocationRelativeTo(null); 
	    }
	                         
	    private void initComponents() {

	    	label_titulo = new javax.swing.JLabel();
	        btn_reservas = new javax.swing.JButton();
	        btn_calendario = new javax.swing.JButton();
	        btn_nuevo_cliente = new javax.swing.JButton();
	        btn_precios = new javax.swing.JButton();
	        btn_seleccion_cliente = new javax.swing.JButton();
	        jPanel1 = new javax.swing.JPanel();
	        
	        setResizable(false);
	        setTitle("Dog-Night");
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        label_titulo.setText("Hotel canino Dog-Night");

	        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("MENÚ"));

	        btn_calendario.setText("CALENDARIO");
	        btn_calendario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        btn_precios.setText("PRECIOS");
	        btn_precios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        btn_reservas.setText("RESERVAS");
	        btn_reservas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        btn_nuevo_cliente.setText("NUEVO CLIENTE");
	        btn_nuevo_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        btn_seleccion_cliente.setText("SELECCION CLIENTES");
	        btn_seleccion_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(btn_calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(btn_precios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(btn_reservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(btn_nuevo_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(btn_seleccion_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(btn_calendario)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(btn_precios)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(btn_reservas)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(btn_nuevo_cliente)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(btn_seleccion_cliente)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(162, 162, 162)
	                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(162, Short.MAX_VALUE))
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(29, 29, 29)
	                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );

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
	    private javax.swing.JPanel jPanel1;
	}



