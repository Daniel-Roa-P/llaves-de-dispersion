
package dispersiones;

public class NodoCodigo {
    
    private NodoCodigo siguiente;
    private int cogigo;
    private String nombre;
    
    NodoCodigo( int codigo , String nombre ){
        
        this.cogigo = codigo;
        this.nombre = nombre;
        this.siguiente = null;
        
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

    public int getCogigo() {
        return cogigo;
    }

    public void setCogigo(int cogigo) {
        this.cogigo = cogigo;
    }
    
    
    
}
