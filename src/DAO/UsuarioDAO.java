package DAO;

import Conexion.Conectar;
import VO.UsuarioVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UsuarioDAO{

/*Metodo listar*/
    public ArrayList<UsuarioVO> Listar_UsuarioVO(){
        ArrayList<UsuarioVO> list = new ArrayList<UsuarioVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM usuario;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                UsuarioVO vo = new UsuarioVO();
                vo.setNombre_Usuario(rs.getString(1));
                vo.setContrasena_Usuario(rs.getString(2));
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
    public void Agregar_UsuarioVO(UsuarioVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO usuario (nombre_Usuario, contrasena_Usuario) VALUES(?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombre_Usuario());
            ps.setString(2, vo.getContrasena_Usuario());
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
    public void Modificar_UsuarioVO(UsuarioVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE usuario SET contrasena_Usuario = ? WHERE nombre_Usuario = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombre_Usuario());
            ps.setString(2, vo.getContrasena_Usuario());
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
    public void Eliminar_UsuarioVO(UsuarioVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM usuario WHERE nombre_Usuario = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombre_Usuario());
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
