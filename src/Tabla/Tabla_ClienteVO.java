package Tabla;

import DAO.ClienteDAO;
import VO.ClienteVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ClienteVO{

   ClienteDAO dao = null;


    public void visualizar_ClienteVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("curp_Cliente");
        dt.addColumn("nombre_Cliente");
        dt.addColumn("primer_Apellido");
        dt.addColumn("segundo_Apellido");
        dt.addColumn("direccion_Cliente");
        dt.addColumn("telefono_Cliente");
        dt.addColumn("consultorio_Dental");

        dao = new ClienteDAO();
        ClienteVO vo = new ClienteVO();
        ArrayList<ClienteVO> list = dao.Listar_ClienteVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getCurp_Cliente();
                fila[1] = vo.getNombre_Cliente();
                fila[2] = vo.getPrimer_Apellido();
                fila[3] = vo.getSegundo_Apellido();
                fila[4] = vo.getDireccion_Cliente();
                fila[5] = vo.getTelefono_Cliente();
                fila[6] = vo.getConsultorio_Dental();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


