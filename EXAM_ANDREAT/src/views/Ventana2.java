package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana2 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblEquipo;
	private JComboBox comboBox;
	private JLabel lblNombre;
	private JLabel lblerApellido;
	private JLabel lblApellido;
	private JLabel lblNacionalidad;
	private JLabel lblId;
	private JButton btnSiguiente;
	private JButton botonAtras;

	/**
	 * Create the panel.
	 */
	public Ventana2(JPanel panel) {
		setBackground(new Color(255, 255, 224));
		setLayout(null);
		
		lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(28, 36, 112, 14);
		add(lblEquipo);
		
		comboBox = new JComboBox();
		comboBox.setBounds(28, 61, 112, 20);
		add(comboBox);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(170, 36, 50, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(170, 61, 121, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(327, 61, 70, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblId = new JLabel("Id");
		lblId.setBounds(327, 36, 46, 14);
		add(lblId);
		
		lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(170, 92, 121, 14);
		add(lblerApellido);
		
		textField_2 = new JTextField();
		textField_2.setBounds(170, 117, 121, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		lblApellido = new JLabel("2\u00BA Apellido");
		lblApellido.setBounds(170, 148, 121, 14);
		add(lblApellido);
		
		textField_3 = new JTextField();
		textField_3.setBounds(170, 173, 121, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(170, 234, 121, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(170, 209, 121, 14);
		add(lblNacionalidad);
		
		botonAtras = new JButton("< < Atr\u00E1s");
		botonAtras.setBounds(28, 333, 130, 23);
		add(botonAtras);
		botonAtras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana v = new ventana(panel);
				panel.add(v, "v1");
				CardLayout layout = (CardLayout) panel.getLayout();
				layout.show(panel, "v1");
				
			}
		});
		
		
		
		btnSiguiente = new JButton("Siguiente > >");
		btnSiguiente.setBounds(267, 333, 130, 23);
		add(btnSiguiente);
		btnSiguiente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana3 v3=new Ventana3(null);
				panel.add(v3, "v3");
				CardLayout layout = (CardLayout) panel.getLayout();
				layout.show(panel, "v3");
				
			}
		});
	}
}
