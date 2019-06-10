package DAO;

import Conexion.Conectar;
import VO.ProveedorVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProveedorDAO{

/*Metodo listar*/
    public ArrayList<ProveedorVO> Listar_ProveedorVO(){
        ArrayList<ProveedorVO> list = new ArrayList<ProveedorVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM proveedor;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ProveedorVO vo = new ProveedorVO();
                vo.setRfc_Proveedor(rs.getString(1));
                vo.setNombre_Proveedor(rs.getString(2));
                vo.setPrimer_Apellido(rs.getString(3));
                vo.setSegundo_Apellido(rs.getString(4));
                vo.setDireccion_Proveedor(rs.getString(5));
                vo.setTelefono_Proveedor(rs.getString(6));
                vo.setEmpresa_Proveedor(rs.getString(7));
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
    public void Agregar_ProveedorVO(ProveedorVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO proveedor (rfc_Proveedor, nombre_Proveedor, primer_Apellido, segundo_Apellido, direccion_Proveedor, telefono_Proveedor, empresa_Proveedor) VALUES(?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getRfc_Proveedor());
            ps.setString(2, vo.getNombre_Proveedor());
            ps.setString(3, vo.getPrimer_Apellido());
            ps.setString(4, vo.getSegundo_Apellido());
            ps.setString(5, vo.getDireccion_Proveedor());
            ps.setString(6, vo.getTelefono_Proveedor());
            ps.setString(7, vo.getEmpresa_Proveedor());
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
    public void Modificar_ProveedorVO(ProveedorVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE proveedor SET nombre_Proveedor = ?, primer_Apellido = ?, segundo_Apellido = ?, direccion_Proveedor = ?, telefono_Proveedor = ?, empresa_Proveedor = ? WHERE rfc_Proveedor = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getRfc_Proveedor());
            ps.setString(2, vo.getNombre_Proveedor());
            ps.setString(3, vo.getPrimer_Apellido());
            ps.setString(4, vo.getSegundo_Apellido());
            ps.setString(5, vo.getDireccion_Proveedor());
            ps.setString(6, vo.getTelefono_Proveedor());
            ps.setString(7, vo.getEmpresa_Proveedor());
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
    public void Eliminar_ProveedorVO(ProveedorVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM proveedor WHERE rfc_Proveedor = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getRfc_Proveedor());
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
