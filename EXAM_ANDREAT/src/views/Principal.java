package views;


import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Principal extends JFrame {

	private JPanel panel;
	private Ventana2 v2;
	private ventana v;
	private Ventana3 v3;
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 410);
		setTitle("THE LABY");
		
		
		
		panel=new JPanel();
		getContentPane().add(panel);
		panel.setBounds(0, 0, 10, 10);
		panel.setLayout(new CardLayout(0,0));
		
		//Iniciar los paneles
		v = new ventana(panel);
		panel.add(v, "Ventana");
		v2 = new Ventana2(panel);
		panel.add(v2,"Ventana2");

		v3= new Ventana3(panel);
		panel.add(v3, "Ventana3");
		
	}

}
