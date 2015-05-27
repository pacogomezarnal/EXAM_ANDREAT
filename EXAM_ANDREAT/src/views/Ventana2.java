package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

import models.CadeteModel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana2 extends JPanel {
	private JTextField cajaNombre;
	private JTextField cajaId;
	private JTextField cajaApellido;
	private JTextField cajaApellido2;
	private JTextField cajaNacionalidad;
	private JLabel Equipo;
	private JComboBox comboBox;
	private JLabel Nombre;
	private JLabel erApellido;
	private JLabel Apellido;
	private JLabel Nacionalidad;
	private JLabel Id;
	private JButton btnSiguiente;
	private JButton botonAtras;
	private CadeteModel cm;

	/**
	 * Create the panel.
	 */
	public Ventana2(JPanel panel) {
		setBackground(new Color(255, 255, 224));
		setLayout(null);
		
		cm = new CadeteModel();
		ArrayList<String> datos = new ArrayList<String>();
		
		
		
		//ComboBox equipo 
		comboBox = new JComboBox();
		comboBox.setBounds(28, 61, 112, 20);
		add(comboBox);
		
		
		//Etiquetas
		Equipo = new JLabel("Equipo");
		Equipo.setBounds(28, 36, 112, 14);
		add(Equipo);
		
		Nombre = new JLabel("Nombre");
		Nombre.setBounds(170, 36, 50, 14);
		add(Nombre);
		
		Id = new JLabel("Id");
		Id.setBounds(327, 36, 46, 14);
		add(Id);
		
		erApellido = new JLabel("1er Apellido");
		erApellido.setBounds(170, 92, 121, 14);
		add(erApellido);
		
		Apellido = new JLabel("2\u00BA Apellido");
		Apellido.setBounds(170, 148, 121, 14);
		add(Apellido);
		
		Nacionalidad = new JLabel("Nacionalidad");
		Nacionalidad.setBounds(170, 209, 121, 14);
		add(Nacionalidad);
		
		
		//Cajas de texto
		cajaNombre = new JTextField();
		cajaNombre.setBounds(170, 61, 121, 20);
		add(cajaNombre);
		cajaNombre.setColumns(10);
		
		cajaId = new JTextField();
		cajaId.setBounds(327, 61, 70, 20);
		add(cajaId);
		cajaId.setColumns(10);
		
		cajaApellido = new JTextField();
		cajaApellido.setBounds(170, 117, 121, 20);
		add(cajaApellido);
		cajaApellido.setColumns(10);
		
		cajaApellido2 = new JTextField();
		cajaApellido2.setBounds(170, 173, 121, 20);
		add(cajaApellido2);
		cajaApellido2.setColumns(10);
		
		cajaNacionalidad = new JTextField();
		cajaNacionalidad.setBounds(170, 234, 121, 20);
		add(cajaNacionalidad);
		cajaNacionalidad.setColumns(10);
		
		//Botones atras y siguiente
		botonAtras = new JButton("< < Atr\u00E1s");
		botonAtras.setBounds(28, 333, 130, 23);
		add(botonAtras);
		botonAtras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana v = new ventana(null);
				panel.add(v, "v");
				CardLayout layout = (CardLayout) panel.getLayout();
				layout.show(panel, "v");
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
	
	public void cargarDatos(ArrayList<String> u){
		for (int i=0; i<u.size();i++){
			ComboBox.addItem(u.get(i));
		}
	}

	public JComboBox getComboBox() {
		return comboBox;
	}
}
