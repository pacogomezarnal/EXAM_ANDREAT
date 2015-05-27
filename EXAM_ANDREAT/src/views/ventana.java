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
	private JTextField cajaNombre,cajaId,cajaApellidos,cajaNacionalidad,cajaEdad;
	private JButton Siguiente;

	/**
	 * Create the panel.
	 */
	public ventana(JPanel panel){
		setBackground(new Color(255, 250, 250));
		setLayout(null);
		
		//Etiquetas
		imagenPerfil = new JLabel(new ImageIcon(getClass().getResource("/lib/pinkUser.png")));
		imagenPerfil.setVerticalAlignment(SwingConstants.TOP);
		imagenPerfil.setBorder(new LineBorder(new Color(139, 0, 139), 2));
		imagenPerfil.setOpaque(true);
		imagenPerfil.setBackground(Color.WHITE);
		imagenPerfil.setBounds(10, 18, 144, 131);
		add(imagenPerfil);
		
		nombre = new JLabel("Nombre");
		nombre.setBounds(177, 37, 105, 14);
		add(nombre);
		
		Id = new JLabel("Id");
		Id.setBounds(309, 37, 54, 14);
		add(Id);
		
		cajaId = new JTextField();
		cajaId.setEditable(false);
		cajaId.setBounds(309, 62, 86, 20);
		add(cajaId);
		cajaId.setColumns(10);
		
		Apellidos = new JLabel("Apellidos");
		Apellidos.setBounds(177, 104, 105, 14);
		add(Apellidos);
		
		Edad = new JLabel("Edad");
		Edad.setBounds(177, 164, 105, 14);
		add(Edad);
		
		Nacionalidad = new JLabel("Nacionalidad");
		Nacionalidad.setBounds(177, 235, 105, 14);
		add(Nacionalidad);
		
		//cajas de texto
		cajaNombre = new JTextField();
		cajaNombre.setEditable(false);
		cajaNombre.setBounds(177, 62, 105, 20);
		add(cajaNombre);
		cajaNombre.setColumns(10);
		
		
		cajaApellidos = new JTextField();
		cajaApellidos.setEditable(false);
		cajaApellidos.setBounds(177, 129, 105, 20);
		add(cajaApellidos);
		cajaApellidos.setColumns(10);
		
		
		cajaNacionalidad = new JTextField();
		cajaNacionalidad.setEditable(false);
		cajaNacionalidad.setBounds(177, 263, 105, 20);
		add(cajaNacionalidad);
		cajaNacionalidad.setColumns(10);
		
		
		cajaEdad = new JTextField();
		cajaEdad.setEditable(false);
		cajaEdad.setBounds(177, 189, 105, 20);
		add(cajaEdad);
		cajaEdad.setColumns(10);
		
		//Boton siguiente
		Siguiente = new JButton("Siguiente > >");
		Siguiente.setBounds(291, 316, 128, 23);
		add(Siguiente);
		Siguiente.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana2 v2=new Ventana2(panel);
				panel.add(v2, "v2");
				CardLayout layout = (CardLayout) panel.getLayout();
				layout.show(panel, "v2");
				
			}
			
			
		});
	}

}