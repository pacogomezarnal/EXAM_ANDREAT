package views;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana3 extends JPanel {
	private JTextField cajaId;
	private JTextField CajaApellido;
	private JTextField CajaComprobar;
	private JButton bontonAtras;
	private JButton Comprobar;
	private JLabel erApellido;
	private JLabel Id;

	/**
	 * Create the panel.
	 */
	public Ventana3(JPanel panel) {
		setBackground(new Color(230, 230, 250));
		setLayout(null);
		
		//Cajas de texto
		cajaId = new JTextField();
		cajaId.setBounds(24, 50, 60, 20);
		add(cajaId);
		cajaId.setColumns(10);
		
		CajaApellido = new JTextField();
		CajaApellido.setBounds(132, 50, 100, 20);
		add(CajaApellido);
		CajaApellido.setColumns(10);
		
		CajaComprobar = new JTextField();
		CajaComprobar.setBounds(24, 188, 397, 20);
		add(CajaComprobar);
		CajaComprobar.setColumns(10);
		
		
		//Etiquetas
		Id = new JLabel("Id");
		Id.setBounds(24, 25, 46, 14);
		add(Id);
		
		erApellido = new JLabel("1er Apellido");
		erApellido.setBounds(132, 25, 100, 14);
		add(erApellido);
		
		
		
		//Boton comprobar y atras
		Comprobar = new JButton("COMPROBAR");
		Comprobar.setBounds(24, 123, 397, 23);
		add(Comprobar);

		
		bontonAtras = new JButton("< < Atr\u00E1s");
		bontonAtras.setBounds(24, 320, 131, 23);
		add(bontonAtras);
		bontonAtras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana2 v2=new Ventana2(null);
				panel.add(v2, "v2");
				CardLayout layout = (CardLayout) panel.getLayout();
				layout.show(panel, "v2");
				
			}
		});
		

	}

}
