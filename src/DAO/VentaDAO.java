package DAO;

import Conexion.Conectar;
import VO.VentaVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class VentaDAO{

/*Metodo listar*/
    public ArrayList<VentaVO> Listar_VentaVO(){
        ArrayList<VentaVO> list = new ArrayList<VentaVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM venta;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                VentaVO vo = new VentaVO();
                vo.setId_Venta(rs.getInt(1));
                vo.setHora_Venta(rs.getString(2));
                vo.setFecha_Venta(rs.getString(3));
                vo.setCliente_Venta(rs.getString(4));
                vo.setProducto_Venta(rs.getString(5));
                vo.setCantidad_Producto(rs.getInt(6));
                vo.setTotal_Venta(rs.getObject(7));
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
    public void Agregar_VentaVO(VentaVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO venta (id_Venta, hora_Venta, fecha_Venta, cliente_Venta, producto_Venta, cantidad_Producto, total_Venta) VALUES(?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Venta());
            ps.setString(2, vo.getHora_Venta());
            ps.setString(3, vo.getFecha_Venta());
            ps.setString(4, vo.getCliente_Venta());
            ps.setString(5, vo.getProducto_Venta());
            ps.setInt(6, vo.getCantidad_Producto());
            ps.setObject(7, vo.getTotal_Venta());
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
    public void Modificar_VentaVO(VentaVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE venta SET hora_Venta = ?, fecha_Venta = ?, cliente_Venta = ?, producto_Venta = ?, cantidad_Producto = ?, total_Venta = ? WHERE id_Venta = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Venta());
            ps.setString(2, vo.getHora_Venta());
            ps.setString(3, vo.getFecha_Venta());
            ps.setString(4, vo.getCliente_Venta());
            ps.setString(5, vo.getProducto_Venta());
            ps.setInt(6, vo.getCantidad_Producto());
            ps.setObject(7, vo.getTotal_Venta());
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
    public void Eliminar_VentaVO(VentaVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM venta WHERE id_Venta = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Venta());
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
