package Tabla;

import DAO.ProductoDAO;
import VO.ProductoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ProductoVO{

   ProductoDAO dao = null;


    public void visualizar_ProductoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codigo_Producto");
        dt.addColumn("nombre_Producto");
        dt.addColumn("marca_Producto");
        dt.addColumn("precio_Producto");
        dt.addColumn("costo_Producto");
        dt.addColumn("existencia_Producto");
        dt.addColumn("proveedor_Producto");

        dao = new ProductoDAO();
        ProductoVO vo = new ProductoVO();
        ArrayList<ProductoVO> list = dao.Listar_ProductoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getCodigo_Producto();
                fila[1] = vo.getNombre_Producto();
                fila[2] = vo.getMarca_Producto();
                fila[3] = vo.getPrecio_Producto();
                fila[4] = vo.getCosto_Producto();
                fila[5] = vo.getExistencia_Producto();
                fila[6] = vo.getProveedor_Producto();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


