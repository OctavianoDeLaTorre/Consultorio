package VO;

public class UsuarioVO {

/*Todo los atributos*/
    String nombre_Usuario;
    String contrasena_Usuario;

public UsuarioVO(){}

/*Todo los codigos get*/
    public String getNombre_Usuario(){
        return nombre_Usuario;
    }
    public String getContrasena_Usuario(){
        return contrasena_Usuario;
    }


/*Todo los codigos set*/
    public void setNombre_Usuario(String nombre_Usuario){
        this.nombre_Usuario = nombre_Usuario;
    }
    public void setContrasena_Usuario(String contrasena_Usuario){
        this.contrasena_Usuario = contrasena_Usuario;
    }

}
