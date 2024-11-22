/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante_kpr;

/**
 *
 * @author alexf
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Restaurante_KPR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/restaurante_kpr";
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Restaurante_KPR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion = DriverManager.getConnection(url,usuario,password);
            statement = conexion.createStatement();
            statement.executeUpdate("INSERT INTO PRODUCTOS (Nombre_Producto, Descripcion, Precio) VALUES ('ABC', 'ABC123', '11000')");
            rs = statement.executeQuery("SELECT * FROM Productos");
            rs.next();
            do{
                System.out.println(rs.getInt("Id_producto")+ "  :  "+rs.getString("Precio"));   
            } while (rs.next());
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Restaurante_KPR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
