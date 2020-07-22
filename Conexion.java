/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Adriana Abad
 */
public class Conexion {
 
    public static final String CONTROLADOR ="com.mysql.jdbc.Driver";
	public static final String URL ="jdbc:mysql://localhost:3306/registro_vehiculo";
	public static final String User = "adriana";
	public static final String Pass = "04182914";
        
        static{
	try{
		Class.forName(CONTROLADOR);
	}catch(ClassNotFoundException e){
		System.out.println("Error al cargar el driver");
	  }
	}
	public static Connection conectar(){
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(URL, User, Pass);
			System.out.println("Conexion Ok");
		}catch(SQLException e){
			System.out.println("Error en la conexion"+ e);
		}
		return conexion;
                
        }   
        
    
    
    
}
