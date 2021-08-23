/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

//IMPORTAR PAQUETES DE LIBRERIA SQL
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;



/**g
 *
 * @author DELL
 */
public class UsuarioDAO {
    //DECLARAR VARIABLES 
    PreparedStatement ps;
    ResultSet rs;
    
    //instancia a la clase connection donde se aloja la Conexion
    
    connection1 con=new connection1(); //Esto es lo mismo
    connection1 conectar; //Aca tambien
    
    public Entidad_Usuario ValidadUsuario(String usuario, String password ){
         Entidad_Usuario eu = new  Entidad_Usuario();
        String sql="select *from Usuarios where UserName=? and Password=?";
        
        eu.UserName=usuario;
        eu.Password=password;
        
        
        try{
           
            conectar= (connection1) con.getConnection();
            ps=con.PreparedStatement(sql);
            ps.setString(2, usuario);
            ps.setString(7,password);
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                eu.setIdUsuarios(rs.getInt(1));
                eu.setUserName(rs.getString(2));
                eu.setNombre(rs.getString(3));
                eu.setApellido(rs.getString(4));
                eu.setTelefono(rs.getString(5));
                eu.setEmail(rs.getString(6));
                eu.setPassword(rs.getString(7));
                
            }
               
        }
        catch (Exception e){
            
            System.out.println(e);
        }
        return eu;
    }
    
    
    
  
}
