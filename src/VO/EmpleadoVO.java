package VO;

public class EmpleadoVO {

/*Todo los atributos*/
    int id_Empleado;
    String rfc_Empleado;
    String nombre_Empleado;
    String primer_Apellido;
    String segundo_Apellido;
    String direccion_Empleado;
    String telefono_Empleado;

public EmpleadoVO(){}

/*Todo los codigos get*/
    public int getId_Empleado(){
        return id_Empleado;
    }
    public String getRfc_Empleado(){
        return rfc_Empleado;
    }
    public String getNombre_Empleado(){
        return nombre_Empleado;
    }
    public String getPrimer_Apellido(){
        return primer_Apellido;
    }
    public String getSegundo_Apellido(){
        return segundo_Apellido;
    }
    public String getDireccion_Empleado(){
        return direccion_Empleado;
    }
    public String getTelefono_Empleado(){
        return telefono_Empleado;
    }


/*Todo los codigos set*/
    public void setId_Empleado(int id_Empleado){
        this.id_Empleado = id_Empleado;
    }
    public void setRfc_Empleado(String rfc_Empleado){
        this.rfc_Empleado = rfc_Empleado;
    }
    public void setNombre_Empleado(String nombre_Empleado){
        this.nombre_Empleado = nombre_Empleado;
    }
    public void setPrimer_Apellido(String primer_Apellido){
        this.primer_Apellido = primer_Apellido;
    }
    public void setSegundo_Apellido(String segundo_Apellido){
        this.segundo_Apellido = segundo_Apellido;
    }
    public void setDireccion_Empleado(String direccion_Empleado){
        this.direccion_Empleado = direccion_Empleado;
    }
    public void setTelefono_Empleado(String telefono_Empleado){
        this.telefono_Empleado = telefono_Empleado;
    }

}
