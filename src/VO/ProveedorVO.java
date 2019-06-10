package VO;

public class ProveedorVO {

/*Todo los atributos*/
    String rfc_Proveedor;
    String nombre_Proveedor;
    String primer_Apellido;
    String segundo_Apellido;
    String direccion_Proveedor;
    String telefono_Proveedor;
    String empresa_Proveedor;

public ProveedorVO(){}

/*Todo los codigos get*/
    public String getRfc_Proveedor(){
        return rfc_Proveedor;
    }
    public String getNombre_Proveedor(){
        return nombre_Proveedor;
    }
    public String getPrimer_Apellido(){
        return primer_Apellido;
    }
    public String getSegundo_Apellido(){
        return segundo_Apellido;
    }
    public String getDireccion_Proveedor(){
        return direccion_Proveedor;
    }
    public String getTelefono_Proveedor(){
        return telefono_Proveedor;
    }
    public String getEmpresa_Proveedor(){
        return empresa_Proveedor;
    }


/*Todo los codigos set*/
    public void setRfc_Proveedor(String rfc_Proveedor){
        this.rfc_Proveedor = rfc_Proveedor;
    }
    public void setNombre_Proveedor(String nombre_Proveedor){
        this.nombre_Proveedor = nombre_Proveedor;
    }
    public void setPrimer_Apellido(String primer_Apellido){
        this.primer_Apellido = primer_Apellido;
    }
    public void setSegundo_Apellido(String segundo_Apellido){
        this.segundo_Apellido = segundo_Apellido;
    }
    public void setDireccion_Proveedor(String direccion_Proveedor){
        this.direccion_Proveedor = direccion_Proveedor;
    }
    public void setTelefono_Proveedor(String telefono_Proveedor){
        this.telefono_Proveedor = telefono_Proveedor;
    }
    public void setEmpresa_Proveedor(String empresa_Proveedor){
        this.empresa_Proveedor = empresa_Proveedor;
    }

}
