package modelo;

import java.sql.*;
public class Conexion {
   private static Connection conectar = null;
   public static Connection obtener() throws SQLException, ClassNotFoundException {
      if (conectar == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/bd_ejemplo", "root", "");
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
      }
      return conectar;
   }
   public static void cerrar() throws SQLException {
      if (conectar != null) {
         conectar.close();
      }
   }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}