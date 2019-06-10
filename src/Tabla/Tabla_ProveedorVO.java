package Tabla;

import DAO.ProveedorDAO;
import VO.ProveedorVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ProveedorVO{

   ProveedorDAO dao = null;


    public void visualizar_ProveedorVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("rfc_Proveedor");
        dt.addColumn("nombre_Proveedor");
        dt.addColumn("primer_Apellido");
        dt.addColumn("segundo_Apellido");
        dt.addColumn("direccion_Proveedor");
        dt.addColumn("telefono_Proveedor");
        dt.addColumn("empresa_Proveedor");

        dao = new ProveedorDAO();
        ProveedorVO vo = new ProveedorVO();
        ArrayList<ProveedorVO> list = dao.Listar_ProveedorVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getRfc_Proveedor();
                fila[1] = vo.getNombre_Proveedor();
                fila[2] = vo.getPrimer_Apellido();
                fila[3] = vo.getSegundo_Apellido();
                fila[4] = vo.getDireccion_Proveedor();
                fila[5] = vo.getTelefono_Proveedor();
                fila[6] = vo.getEmpresa_Proveedor();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


