package DAO;

import Conexion.Conectar;
import VO.ClienteVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ClienteDAO{

/*Metodo listar*/
    public ArrayList<ClienteVO> Listar_ClienteVO(){
        ArrayList<ClienteVO> list = new ArrayList<ClienteVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM cliente;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ClienteVO vo = new ClienteVO();
                vo.setCurp_Cliente(rs.getString(1));
                vo.setNombre_Cliente(rs.getString(2));
                vo.setPrimer_Apellido(rs.getString(3));
                vo.setSegundo_Apellido(rs.getString(4));
                vo.setDireccion_Cliente(rs.getString(5));
                vo.setTelefono_Cliente(rs.getString(6));
                vo.setConsultorio_Dental(rs.getString(7));
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
    public void Agregar_ClienteVO(ClienteVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO cliente (curp_Cliente, nombre_Cliente, primer_Apellido, segundo_Apellido, direccion_Cliente, telefono_Cliente, consultorio_Dental) VALUES(?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCurp_Cliente());
            ps.setString(2, vo.getNombre_Cliente());
            ps.setString(3, vo.getPrimer_Apellido());
            ps.setString(4, vo.getSegundo_Apellido());
            ps.setString(5, vo.getDireccion_Cliente());
            ps.setString(6, vo.getTelefono_Cliente());
            ps.setString(7, vo.getConsultorio_Dental());
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
    public void Modificar_ClienteVO(ClienteVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE cliente SET nombre_Cliente = ?, primer_Apellido = ?, segundo_Apellido = ?, direccion_Cliente = ?, telefono_Cliente = ?, consultorio_Dental = ? WHERE curp_Cliente = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCurp_Cliente());
            ps.setString(2, vo.getNombre_Cliente());
            ps.setString(3, vo.getPrimer_Apellido());
            ps.setString(4, vo.getSegundo_Apellido());
            ps.setString(5, vo.getDireccion_Cliente());
            ps.setString(6, vo.getTelefono_Cliente());
            ps.setString(7, vo.getConsultorio_Dental());
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
    public void Eliminar_ClienteVO(ClienteVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM cliente WHERE curp_Cliente = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCurp_Cliente());
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
