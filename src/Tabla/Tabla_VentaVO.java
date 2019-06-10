package Tabla;

import DAO.VentaDAO;
import VO.VentaVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_VentaVO{

   VentaDAO dao = null;


    public void visualizar_VentaVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id_Venta");
        dt.addColumn("hora_Venta");
        dt.addColumn("fecha_Venta");
        dt.addColumn("cliente_Venta");
        dt.addColumn("producto_Venta");
        dt.addColumn("cantidad_Producto");
        dt.addColumn("total_Venta");

        dao = new VentaDAO();
        VentaVO vo = new VentaVO();
        ArrayList<VentaVO> list = dao.Listar_VentaVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getId_Venta();
                fila[1] = vo.getHora_Venta();
                fila[2] = vo.getFecha_Venta();
                fila[3] = vo.getCliente_Venta();
                fila[4] = vo.getProducto_Venta();
                fila[5] = vo.getCantidad_Producto();
                fila[6] = vo.getTotal_Venta();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


