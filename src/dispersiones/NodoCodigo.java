
package dispersiones;

public class NodoCodigo {
    
    private NodoCodigo siguiente;
    private int codigo, ubicacion;
    private String nombre;
    
    NodoCodigo( int codigo , String nombre , int ubicacion){
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.siguiente = null;
        this.ubicacion = ubicacion;
        
    }

    public NodoCodigo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCodigo siguiente) {
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int cogigo) {
        this.codigo = cogigo;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
