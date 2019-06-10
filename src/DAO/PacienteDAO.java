package DAO;

import Conexion.Conectar;
import VO.PacienteVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PacienteDAO{

/*Metodo listar*/
    public ArrayList<PacienteVO> Listar_PacienteVO(){
        ArrayList<PacienteVO> list = new ArrayList<PacienteVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM paciente;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                PacienteVO vo = new PacienteVO();
                vo.setId_Paciente(rs.getInt(1));
                vo.setNombre_Paciente(rs.getString(2));
                vo.setPrimer_Apellido(rs.getString(3));
                vo.setSegundo_Apellido(rs.getString(4));
                vo.setSexo(rs.getString(5));
                vo.setEdad(rs.getInt(6));
                vo.setEstado_civil(rs.getString(7));
                vo.setDireccion_Paciente(rs.getString(8));
                vo.setTelefono_Paciente(rs.getString(9));
                vo.setObservacion(rs.getString(10));
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
    public void Agregar_PacienteVO(PacienteVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO paciente (id_Paciente, nombre_Paciente, primer_Apellido, segundo_Apellido, sexo, edad, estado_civil, direccion_Paciente, telefono_Paciente, observacion) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Paciente());
            ps.setString(2, vo.getNombre_Paciente());
            ps.setString(3, vo.getPrimer_Apellido());
            ps.setString(4, vo.getSegundo_Apellido());
            ps.setString(5, vo.getSexo());
            ps.setInt(6, vo.getEdad());
            ps.setString(7, vo.getEstado_civil());
            ps.setString(8, vo.getDireccion_Paciente());
            ps.setString(9, vo.getTelefono_Paciente());
            ps.setString(10, vo.getObservacion());
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
    public void Modificar_PacienteVO(PacienteVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE paciente SET nombre_Paciente = ?, primer_Apellido = ?, segundo_Apellido = ?, sexo = ?, edad = ?, estado_civil = ?, direccion_Paciente = ?, telefono_Paciente = ?, observacion = ? WHERE id_Paciente = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Paciente());
            ps.setString(2, vo.getNombre_Paciente());
            ps.setString(3, vo.getPrimer_Apellido());
            ps.setString(4, vo.getSegundo_Apellido());
            ps.setString(5, vo.getSexo());
            ps.setInt(6, vo.getEdad());
            ps.setString(7, vo.getEstado_civil());
            ps.setString(8, vo.getDireccion_Paciente());
            ps.setString(9, vo.getTelefono_Paciente());
            ps.setString(10, vo.getObservacion());
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
    public void Eliminar_PacienteVO(PacienteVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM paciente WHERE id_Paciente = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Paciente());
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
