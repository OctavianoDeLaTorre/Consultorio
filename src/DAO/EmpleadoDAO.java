package DAO;

import Conexion.Conectar;
import VO.EmpleadoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EmpleadoDAO{

/*Metodo listar*/
    public ArrayList<EmpleadoVO> Listar_EmpleadoVO(){
        ArrayList<EmpleadoVO> list = new ArrayList<EmpleadoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM empleado;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                EmpleadoVO vo = new EmpleadoVO();
                vo.setId_Empleado(rs.getInt(1));
                vo.setRfc_Empleado(rs.getString(2));
                vo.setNombre_Empleado(rs.getString(3));
                vo.setPrimer_Apellido(rs.getString(4));
                vo.setSegundo_Apellido(rs.getString(5));
                vo.setDireccion_Empleado(rs.getString(6));
                vo.setTelefono_Empleado(rs.getString(7));
                list.add(vo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }


/*Metodo agregar*/
    public void Agregar_EmpleadoVO(EmpleadoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO empleado (id_Empleado, rfc_Empleado, nombre_Empleado, primer_Apellido, segundo_Apellido, direccion_Empleado, telefono_Empleado) VALUES(?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Empleado());
            ps.setString(2, vo.getRfc_Empleado());
            ps.setString(3, vo.getNombre_Empleado());
            ps.setString(4, vo.getPrimer_Apellido());
            ps.setString(5, vo.getSegundo_Apellido());
            ps.setString(6, vo.getDireccion_Empleado());
            ps.setString(7, vo.getTelefono_Empleado());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Modificar*/
    public void Modificar_EmpleadoVO(EmpleadoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE empleado SET rfc_Empleado = ?, nombre_Empleado = ?, primer_Apellido = ?, segundo_Apellido = ?, direccion_Empleado = ?, telefono_Empleado = ? WHERE id_Empleado = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Empleado());
            ps.setString(2, vo.getRfc_Empleado());
            ps.setString(3, vo.getNombre_Empleado());
            ps.setString(4, vo.getPrimer_Apellido());
            ps.setString(5, vo.getSegundo_Apellido());
            ps.setString(6, vo.getDireccion_Empleado());
            ps.setString(7, vo.getTelefono_Empleado());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Eliminar*/
    public void Eliminar_EmpleadoVO(EmpleadoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM empleado WHERE id_Empleado = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Empleado());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


}
