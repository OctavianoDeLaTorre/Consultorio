package DAO;

import Conexion.Conectar;
import VO.ProductoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProductoDAO{

/*Metodo listar*/
    public ArrayList<ProductoVO> Listar_ProductoVO(){
        ArrayList<ProductoVO> list = new ArrayList<ProductoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM producto;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ProductoVO vo = new ProductoVO();
                vo.setCodigo_Producto(rs.getString(1));
                vo.setNombre_Producto(rs.getString(2));
                vo.setMarca_Producto(rs.getString(3));
                vo.setPrecio_Producto(rs.getObject(4));
                vo.setCosto_Producto(rs.getObject(5));
                vo.setExistencia_Producto(rs.getInt(6));
                vo.setProveedor_Producto(rs.getString(7));
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
    public void Agregar_ProductoVO(ProductoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO producto (codigo_Producto, nombre_Producto, marca_Producto, precio_Producto, costo_Producto, existencia_Producto, proveedor_Producto) VALUES(?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodigo_Producto());
            ps.setString(2, vo.getNombre_Producto());
            ps.setString(3, vo.getMarca_Producto());
            ps.setObject(4, vo.getPrecio_Producto());
            ps.setObject(5, vo.getCosto_Producto());
            ps.setInt(6, vo.getExistencia_Producto());
            ps.setString(7, vo.getProveedor_Producto());
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
    public void Modificar_ProductoVO(ProductoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE producto SET nombre_Producto = ?, marca_Producto = ?, precio_Producto = ?, costo_Producto = ?, existencia_Producto = ?, proveedor_Producto = ? WHERE codigo_Producto = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodigo_Producto());
            ps.setString(2, vo.getNombre_Producto());
            ps.setString(3, vo.getMarca_Producto());
            ps.setObject(4, vo.getPrecio_Producto());
            ps.setObject(5, vo.getCosto_Producto());
            ps.setInt(6, vo.getExistencia_Producto());
            ps.setString(7, vo.getProveedor_Producto());
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
    public void Eliminar_ProductoVO(ProductoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM producto WHERE codigo_Producto = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCodigo_Producto());
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
