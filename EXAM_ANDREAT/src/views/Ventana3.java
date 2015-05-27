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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton bontonAtras;
	private JButton btnComprobar;
	private JLabel lblerApellido;
	private JLabel lblId;

	/**
	 * Create the panel.
	 */
	public Ventana3(JPanel panel) {
		setBackground(new Color(230, 230, 250));
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(24, 50, 60, 20);
		add(textField);
		textField.setColumns(10);
		
		lblId = new JLabel("Id");
		lblId.setBounds(24, 25, 46, 14);
		add(lblId);
		
		lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(132, 25, 80, 14);
		add(lblerApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 50, 100, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		btnComprobar = new JButton("COMPROBAR");
		btnComprobar.setBounds(24, 123, 397, 23);
		add(btnComprobar);
		
		textField_2 = new JTextField();
		textField_2.setBounds(24, 188, 397, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		bontonAtras = new JButton("< < Atr\u00E1s");
		bontonAtras.setBounds(24, 320, 115, 23);
		add(bontonAtras);
		bontonAtras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana v1=new ventana(null);
				panel.add(v1, "v1");
				CardLayout layout = (CardLayout) panel.getLayout();
				layout.show(panel, "v1");
				
			}
		});
		

	}

}
