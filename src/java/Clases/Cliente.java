
/*
 <!-Brandon Isaías Ampérez Aldana 0909-21-4628 -->
 */

package Clases;

/**
 *
 * @author brand
 */
public class Cliente {
    
   private String codigo;
    private String nombre;
    private String pasta;
    private String editorial;
    private String publicacion;
  
    
    public Cliente(String codigo, String nombre, String pasta, String editorial, String publicacion){
        this.codigo=codigo;
        this.nombre=nombre;
        this.pasta=pasta;
        this.editorial=editorial;
        this.publicacion=publicacion;     
    }
    
    public Cliente(){
        this.nombre="Alumno de ejemplo";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasta() {
        return pasta;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }


    
}
