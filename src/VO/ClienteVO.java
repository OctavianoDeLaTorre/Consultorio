package VO;

public class ClienteVO {

/*Todo los atributos*/
    String curp_Cliente;
    String nombre_Cliente;
    String primer_Apellido;
    String segundo_Apellido;
    String direccion_Cliente;
    String telefono_Cliente;
    String consultorio_Dental;

public ClienteVO(){}

/*Todo los codigos get*/
    public String getCurp_Cliente(){
        return curp_Cliente;
    }
    public String getNombre_Cliente(){
        return nombre_Cliente;
    }
    public String getPrimer_Apellido(){
        return primer_Apellido;
    }
    public String getSegundo_Apellido(){
        return segundo_Apellido;
    }
    public String getDireccion_Cliente(){
        return direccion_Cliente;
    }
    public String getTelefono_Cliente(){
        return telefono_Cliente;
    }
    public String getConsultorio_Dental(){
        return consultorio_Dental;
    }


/*Todo los codigos set*/
    public void setCurp_Cliente(String curp_Cliente){
        this.curp_Cliente = curp_Cliente;
    }
    public void setNombre_Cliente(String nombre_Cliente){
        this.nombre_Cliente = nombre_Cliente;
    }
    public void setPrimer_Apellido(String primer_Apellido){
        this.primer_Apellido = primer_Apellido;
    }
    public void setSegundo_Apellido(String segundo_Apellido){
        this.segundo_Apellido = segundo_Apellido;
    }
    public void setDireccion_Cliente(String direccion_Cliente){
        this.direccion_Cliente = direccion_Cliente;
    }
    public void setTelefono_Cliente(String telefono_Cliente){
        this.telefono_Cliente = telefono_Cliente;
    }
    public void setConsultorio_Dental(String consultorio_Dental){
        this.consultorio_Dental = consultorio_Dental;
    }

}
