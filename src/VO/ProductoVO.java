package VO;

public class ProductoVO {

/*Todo los atributos*/
    String codigo_Producto;
    String nombre_Producto;
    String marca_Producto;
    Object precio_Producto;
    Object costo_Producto;
    int existencia_Producto;
    String proveedor_Producto;

public ProductoVO(){}

/*Todo los codigos get*/
    public String getCodigo_Producto(){
        return codigo_Producto;
    }
    public String getNombre_Producto(){
        return nombre_Producto;
    }
    public String getMarca_Producto(){
        return marca_Producto;
    }
    public Object getPrecio_Producto(){
        return precio_Producto;
    }
    public Object getCosto_Producto(){
        return costo_Producto;
    }
    public int getExistencia_Producto(){
        return existencia_Producto;
    }
    public String getProveedor_Producto(){
        return proveedor_Producto;
    }


/*Todo los codigos set*/
    public void setCodigo_Producto(String codigo_Producto){
        this.codigo_Producto = codigo_Producto;
    }
    public void setNombre_Producto(String nombre_Producto){
        this.nombre_Producto = nombre_Producto;
    }
    public void setMarca_Producto(String marca_Producto){
        this.marca_Producto = marca_Producto;
    }
    public void setPrecio_Producto(Object precio_Producto){
        this.precio_Producto = precio_Producto;
    }
    public void setCosto_Producto(Object costo_Producto){
        this.costo_Producto = costo_Producto;
    }
    public void setExistencia_Producto(int existencia_Producto){
        this.existencia_Producto = existencia_Producto;
    }
    public void setProveedor_Producto(String proveedor_Producto){
        this.proveedor_Producto = proveedor_Producto;
    }

}
