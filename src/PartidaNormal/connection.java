package PartidaNormal;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class connection {
    
    private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bd_ejemplo?verifyServerCertificate=false&useSSL=true";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

    static {
        try{
            Class.forName(CONTROLADOR);
        }catch(ClassNotFoundException e){
             System.out.println("Error al cargar el controlador");
            e.printStackTrace();
        }
    }
    
    public Connection Conectar()
    {
        Connection conexion = null;
        
        try{
            
            conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);
            
            System.out.println("Connexion OK");
            
        }catch (SQLException e){
            System.out.println("Error en la connexion");
            e.printStackTrace();
        }
        return conexion;
        
    }
} 
    
