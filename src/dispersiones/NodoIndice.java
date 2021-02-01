
package dispersiones;

public class NodoIndice {
    
    private NodoIndice siguiente;
    private ListaCodigos codigos;
    private int indice;
    private int tamaño;
    
    NodoIndice(int indice){
    
        this.indice = indice;
        this.tamaño = 0;
        this.codigos = new ListaCodigos();
        this.siguiente = null;
        
    }

    public NodoIndice getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoIndice siguiente) {
        this.siguiente = siguiente;
    }

    public ListaCodigos getCodigos() {
        return codigos;
    }

    public void setCodigos(ListaCodigos alumnos) {
        this.codigos = alumnos;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
}
