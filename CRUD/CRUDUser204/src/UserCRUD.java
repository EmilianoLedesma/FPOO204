/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emiliano
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
    private Connection conexion;
    
    //Constructor de la clase, arranca la conexion a BD
    public UserCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean InsertUsuario(String nombre, String contrasena, String correo){
        String insertSQL = "insert into usuarios (nombre,contrasena,correo) values (?,?,?)";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setString(2, contrasena);
            ps.setString(3, correo);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.println("Error al crear el usuario " + e.getMessage());
            return false;
        }
        
    }//Fin del insert
    
    public boolean ActualizarUsuario(int id, String nombre, String contrasena, String correo){
        String updateSQL = "UPDATE usuarios SET nombre = ?, contrasena = ?, correo = ? WHERE id = ?";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(updateSQL);
            ps.setString(1, nombre);
            ps.setString(2, contrasena);
            ps.setString(3, correo);
            ps.setInt(4,id);
            return ps.executeUpdate() > 0;
        }
        catch(SQLException e){
            System.out.println("Error al actualizar el usuario " + e.getMessage());
            return false;
        }
    }//Fin del actualizar
    
    //Metodo para consultar por ID
    public ResultSet BuscarPorID(int id){
        String sqlBuscar= "Select *  from usuarios where id = ?";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar);
            ps.setInt(1,id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al buscar por ID " + e.getMessage());
            return null;
        }
    }//Final Consulta por ID
    
    public ResultSet obtenerTodos(){
        String sqlTodos="Select * from usuarios";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al buscar todos " + s.getMessage());
            return null;
        }
     }//Fin de obtener todos
    
    public boolean EliminarUsuario(int id) {
    String deleteSQL = "DELETE FROM usuarios WHERE id = ?";

    try {
        PreparedStatement ps = conexion.prepareStatement(deleteSQL);
        ps.setInt(1, id);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al eliminar el usuario " + e.getMessage());
        return false;
    }
    }
}
