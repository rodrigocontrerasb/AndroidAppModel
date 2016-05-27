package appmodel.cobenet.cl.appmodel.model;

/**
 * Modelo: Post
 * Descripcion: Representación en clase para tabla post
 * Objetivo: Controlar las llamadas de asignacion y retorno de valores para objetos del tipo
 * @author Rodrigo Contreras B. <rodrigo.rcb@gmail.com>
 * @version 2016-05-27
 * @since 2016-05-27
 */
public class Post {

    /**
     Atributos de Tabla
     */
    public String nombre;
    public String detalle;
    public int id;

    /*
     Setters
     */
    public String getNombre() {
        return nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public int getId() {
        return id;
    }


    /*
     Setters
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setId(int id) {
        this.id = id;
    }
}
