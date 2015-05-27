package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class CadeteModel {

		private  String CADETE="SELECT * FROM thelaby";
		private String equipo = "SELECT equipo FROM cadetes WHERE equipo=6";
		private  String NOMBRE="nombre";
		private  String APELLIDOS="apellidos";
		private  String EDAD = "edad";
		private  String NACIONALIDAD = "nacionalidad";
		private  String EQUIPO = "equipo";
		private ConexionDB db;

		public static CadeteModel instance = new CadeteModel();
		

		
		public CadeteModel()
		{
			
			db = ConexionDB.getInstance();
			
		}
		
				
		public ArrayList<String> getDatosCadetes(){
			
			ArrayList<String> datos = new ArrayList<String>();
			
			try {
				ResultSet resultado = db.getConexion().createStatement().executeQuery(CADETE);
				
				while (resultado.next()){
					
					String nombre = resultado.getString(NOMBRE);
					String apellidos = resultado.getString(APELLIDOS);
					int edad = resultado.getInt(EDAD);
					String nacionalidad = resultado.getString(NACIONALIDAD);
					int equipo = resultado.getInt(EQUIPO);
					datos.add(nombre);
					datos.add(apellidos);
					//datos.add(edad);
					datos.add(nacionalidad);
					//datos.add(equipo);
				}
			} catch (SQLException exceptionSql) {
				exceptionSql.printStackTrace();
			}
			return datos;
		}	
		
		public ArrayList<String> getEquipo(){
			
			ArrayList<String> datoEquipo = new ArrayList<String>();
			
			try {
				ResultSet resultado = db.getConexion().createStatement().executeQuery(equipo);
				
				while (resultado.next()){
					
					int equipo = resultado.getInt(EQUIPO);
					
					datoEquipo.add(equipo,"equipo");
				}
			} catch (SQLException exceptionSql) {
				exceptionSql.printStackTrace();
			}
			return datoEquipo;
		}	
		
		public CadeteModel getInstance() {
			return instance;
		}
		
	}