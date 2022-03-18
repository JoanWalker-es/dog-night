package vista;

import controlador.*;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Ventana_principal extends javax.swing.JFrame {
	
	    public Ventana_principal() {
	    	setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana_principal.class.getResource("/imagen/icono_DN.png")));
	    	try {
			    UIManager.setLookAndFeel( new FlatLightLaf() );
			} catch( Exception ex ) {
			    System.err.println( "Failed to initialize LaF" );
			}
	        initComponents();setSize(600,550);
	        this.setLocationRelativeTo(null); 
	    }
	                         
	    private void initComponents() {

	    		        
	        setResizable(false);
	        setTitle("Dog-Night");
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jPanel1 = new javax.swing.JPanel();
	        btn_calendario = new javax.swing.JButton();
	        btn_precios = new javax.swing.JButton();
	        btn_reservas = new javax.swing.JButton();
	        btn_nuevo_cliente = new javax.swing.JButton();
	        btn_seleccion_cliente = new javax.swing.JButton();
	        jPanel3 = new javax.swing.JPanel();
	        imagen = new javax.swing.JLabel();	        

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

	        jPanel3.setPreferredSize(new java.awt.Dimension(530, 300));

	        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        imagen.setIcon(new ImageIcon(Ventana_principal.class.getResource("/imagen/Logo_Dog_night_reducido transparente.png"))); // NOI18N

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
	                .addContainerGap())
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(imagen)
	                .addContainerGap())
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        pack();
	        
	        
	        //EVENTOS DE LA CLASE:
	        btn_calendario.addActionListener(new Eventos_principal(this));
	        btn_precios.addActionListener(new Eventos_principal(this));
	        btn_nuevo_cliente.addActionListener(new Eventos_principal(this));
	        btn_reservas.addActionListener(new Eventos_principal(this));
	        btn_seleccion_cliente.addActionListener(new Eventos_principal(this));
	        addWindowListener(new Eventos_principal(this));
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
	    private javax.swing.JLabel imagen;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel3;
	}



