package VO;

public class PacienteVO {

/*Todo los atributos*/
    int id_Paciente;
    String nombre_Paciente;
    String primer_Apellido;
    String segundo_Apellido;
    String sexo;
    int edad;
    String estado_civil;
    String direccion_Paciente;
    String telefono_Paciente;
    String observacion;

public PacienteVO(){}

/*Todo los codigos get*/
    public int getId_Paciente(){
        return id_Paciente;
    }
    public String getNombre_Paciente(){
        return nombre_Paciente;
    }
    public String getPrimer_Apellido(){
        return primer_Apellido;
    }
    public String getSegundo_Apellido(){
        return segundo_Apellido;
    }
    public String getSexo(){
        return sexo;
    }
    public int getEdad(){
        return edad;
    }
    public String getEstado_civil(){
        return estado_civil;
    }
    public String getDireccion_Paciente(){
        return direccion_Paciente;
    }
    public String getTelefono_Paciente(){
        return telefono_Paciente;
    }
    public String getObservacion(){
        return observacion;
    }


/*Todo los codigos set*/
    public void setId_Paciente(int id_Paciente){
        this.id_Paciente = id_Paciente;
    }
    public void setNombre_Paciente(String nombre_Paciente){
        this.nombre_Paciente = nombre_Paciente;
    }
    public void setPrimer_Apellido(String primer_Apellido){
        this.primer_Apellido = primer_Apellido;
    }
    public void setSegundo_Apellido(String segundo_Apellido){
        this.segundo_Apellido = segundo_Apellido;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setEstado_civil(String estado_civil){
        this.estado_civil = estado_civil;
    }
    public void setDireccion_Paciente(String direccion_Paciente){
        this.direccion_Paciente = direccion_Paciente;
    }
    public void setTelefono_Paciente(String telefono_Paciente){
        this.telefono_Paciente = telefono_Paciente;
    }
    public void setObservacion(String observacion){
        this.observacion = observacion;
    }

}
