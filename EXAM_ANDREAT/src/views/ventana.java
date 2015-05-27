package views;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Color;

public class ventana extends JPanel {
	
	private JLabel imagenPerfil, nombre,Id,Apellidos, Edad, Nacionalidad;
	private JTextField textField,textField_1,textField_2,textField_3,textField_4;
	private JButton Siguiente;

	/**
	 * Create the panel.
	 */
	public ventana(JPanel panel){
		setBackground(new Color(255, 250, 250));
		setLayout(null);
		
		imagenPerfil = new JLabel(new ImageIcon(getClass().getResource("/images/pinkUser.png")));
		imagenPerfil.setVerticalAlignment(SwingConstants.TOP);
		imagenPerfil.setBorder(new LineBorder(new Color(139, 0, 139), 2));
		imagenPerfil.setOpaque(true);
		imagenPerfil.setBackground(Color.WHITE);
		imagenPerfil.setBounds(10, 18, 144, 131);
		add(imagenPerfil);
		
		nombre = new JLabel("Nombre");
		nombre.setBounds(177, 37, 37, 14);
		add(nombre);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(177, 62, 105, 20);
		add(textField);
		textField.setColumns(10);
		
		Id = new JLabel("Id");
		Id.setBounds(309, 37, 31, 14);
		add(Id);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(309, 62, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		Apellidos = new JLabel("Apellidos");
		Apellidos.setBounds(177, 104, 42, 14);
		add(Apellidos);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(177, 129, 105, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		Edad = new JLabel("Edad");
		Edad.setBounds(177, 164, 24, 14);
		add(Edad);
		
		Nacionalidad = new JLabel("Nacionalidad");
		Nacionalidad.setBounds(177, 235, 60, 14);
		add(Nacionalidad);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(177, 263, 105, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(177, 189, 105, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		Siguiente = new JButton("Siguiente > >");
		Siguiente.setBounds(320, 316, 99, 23);
		add(Siguiente);
		Siguiente.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel panel = null;
				Ventana2 v2=new Ventana2(null);
				panel.add(v2, "v2");
				CardLayout layout = (CardLayout) panel.getLayout();
				layout.show(panel, "v2");
				
			}
			
			
		});
	}

}