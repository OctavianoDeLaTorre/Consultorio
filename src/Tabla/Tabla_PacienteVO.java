package Tabla;

import DAO.PacienteDAO;
import VO.PacienteVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_PacienteVO{

   PacienteDAO dao = null;


    public void visualizar_PacienteVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id_Paciente");
        dt.addColumn("nombre_Paciente");
        dt.addColumn("primer_Apellido");
        dt.addColumn("segundo_Apellido");
        dt.addColumn("sexo");
        dt.addColumn("edad");
        dt.addColumn("estado_civil");
        dt.addColumn("direccion_Paciente");
        dt.addColumn("telefono_Paciente");
        dt.addColumn("observacion");

        dao = new PacienteDAO();
        PacienteVO vo = new PacienteVO();
        ArrayList<PacienteVO> list = dao.Listar_PacienteVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[10];
                vo = list.get(i);
                fila[0] = vo.getId_Paciente();
                fila[1] = vo.getNombre_Paciente();
                fila[2] = vo.getPrimer_Apellido();
                fila[3] = vo.getSegundo_Apellido();
                fila[4] = vo.getSexo();
                fila[5] = vo.getEdad();
                fila[6] = vo.getEstado_civil();
                fila[7] = vo.getDireccion_Paciente();
                fila[8] = vo.getTelefono_Paciente();
                fila[9] = vo.getObservacion();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


