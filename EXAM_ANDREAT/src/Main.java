import views.Principal;
import models.ConexionDB;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal frame = new Principal();
		frame.setVisible(true);
		
		/*boolean conectado = ConexionDB.getInstance().connectDB();
		
		if(conectado == true){
			Principal frame = new Principal();
			frame.setVisible(true);
		}else{
			System.out.println("No estas conectado");
		}*/
	}

}
