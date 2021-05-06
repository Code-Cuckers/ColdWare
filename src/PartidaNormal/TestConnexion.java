package PartidaNormal;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class TestConnexion {
        
    public static void main(String[] args) {
        connection conexion = new connection();
        Connection cn = null;
        Statement stm = null;
        Statement stm2 = null;
        ResultSet rs = null;
        String nombre = "Hola1";
        int x = 5;
        String tipo = "Patata1";
        int vidas = 151;
        
        try {
            
            cn = (Connection) conexion.Conectar();
            stm = (Statement) cn.createStatement();
            
            
        
        } catch (SQLException e) {
            
        } 
        
        
    }
   
    
}
