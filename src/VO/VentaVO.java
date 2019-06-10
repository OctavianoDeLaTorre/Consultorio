package VO;

public class VentaVO {

/*Todo los atributos*/
    int id_Venta;
    String hora_Venta;
    String fecha_Venta;
    String cliente_Venta;
    String producto_Venta;
    int cantidad_Producto;
    Object total_Venta;

public VentaVO(){}

/*Todo los codigos get*/
    public int getId_Venta(){
        return id_Venta;
    }
    public String getHora_Venta(){
        return hora_Venta;
    }
    public String getFecha_Venta(){
        return fecha_Venta;
    }
    public String getCliente_Venta(){
        return cliente_Venta;
    }
    public String getProducto_Venta(){
        return producto_Venta;
    }
    public int getCantidad_Producto(){
        return cantidad_Producto;
    }
    public Object getTotal_Venta(){
        return total_Venta;
    }


/*Todo los codigos set*/
    public void setId_Venta(int id_Venta){
        this.id_Venta = id_Venta;
    }
    public void setHora_Venta(String hora_Venta){
        this.hora_Venta = hora_Venta;
    }
    public void setFecha_Venta(String fecha_Venta){
        this.fecha_Venta = fecha_Venta;
    }
    public void setCliente_Venta(String cliente_Venta){
        this.cliente_Venta = cliente_Venta;
    }
    public void setProducto_Venta(String producto_Venta){
        this.producto_Venta = producto_Venta;
    }
    public void setCantidad_Producto(int cantidad_Producto){
        this.cantidad_Producto = cantidad_Producto;
    }
    public void setTotal_Venta(Object total_Venta){
        this.total_Venta = total_Venta;
    }

}
