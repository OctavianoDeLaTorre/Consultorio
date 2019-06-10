package Tabla;

import DAO.EmpleadoDAO;
import VO.EmpleadoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_EmpleadoVO{

   EmpleadoDAO dao = null;


    public void visualizar_EmpleadoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id_Empleado");
        dt.addColumn("rfc_Empleado");
        dt.addColumn("nombre_Empleado");
        dt.addColumn("primer_Apellido");
        dt.addColumn("segundo_Apellido");
        dt.addColumn("direccion_Empleado");
        dt.addColumn("telefono_Empleado");

        dao = new EmpleadoDAO();
        EmpleadoVO vo = new EmpleadoVO();
        ArrayList<EmpleadoVO> list = dao.Listar_EmpleadoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getId_Empleado();
                fila[1] = vo.getRfc_Empleado();
                fila[2] = vo.getNombre_Empleado();
                fila[3] = vo.getPrimer_Apellido();
                fila[4] = vo.getSegundo_Apellido();
                fila[5] = vo.getDireccion_Empleado();
                fila[6] = vo.getTelefono_Empleado();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


