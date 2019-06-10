package Tabla;

import DAO.UsuarioDAO;
import VO.UsuarioVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_UsuarioVO{

   UsuarioDAO dao = null;


    public void visualizar_UsuarioVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("nombre_Usuario");
        dt.addColumn("contrasena_Usuario");

        dao = new UsuarioDAO();
        UsuarioVO vo = new UsuarioVO();
        ArrayList<UsuarioVO> list = dao.Listar_UsuarioVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[2];
                vo = list.get(i);
                fila[0] = vo.getNombre_Usuario();
                fila[1] = vo.getContrasena_Usuario();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


