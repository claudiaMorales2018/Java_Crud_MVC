package modelo;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PersonaDAO {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar() {
        List<Persona> datos = new ArrayList<>();
        String sql = "select * from Persona";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona p = new Persona();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setCorreo(rs.getString(3));
                p.setTel(rs.getString(4));
                datos.add(p);
            }
        }catch(Exception e ){}
            
            return datos;
            
        }        
    }

