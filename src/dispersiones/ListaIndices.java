
package dispersiones;

public class ListaIndices {
    
    private NodoIndice cabezaIndice;
    private int tamaño;
    
    ListaIndices(){
        
        this.cabezaIndice = null;
        this.tamaño = 0;
        
    }
    
    public void insertar(int indice){
        
        NodoIndice nuevo = new NodoIndice(indice);
        
        if(cabezaIndice == null){
        
            cabezaIndice = nuevo;
            
        } else {
            
            NodoIndice q = cabezaIndice;
            NodoIndice s = null;
            
            while(q != null){
                
                s=q;        
                q = q.getSiguiente();

            }
                
            s.setSiguiente(nuevo);
            
        }
        
        tamaño++;
        
    }
    
    public void imprimir(){
        
        NodoIndice q = cabezaIndice;
        
        while(q != null){
            
            System.out.print(q.getIndice() + " ---> ");
            q = q.getSiguiente();
            
        }
        
        System.out.println(" ");
        
    }
    
    public void ingresarCodigo(int modulo, int codigo, String nombre, int ubicacion){
        
        NodoIndice q = cabezaIndice;
        
        while(q != null){

            if(q.getIndice() == modulo){

                break;

            } else {
   
                q = q.getSiguiente();

            }

        }
            
        q.getCodigos().insertar(codigo, nombre, ubicacion);
        q.setTamaño(q.getTamaño()+1);
            
    }
    
    public void eliminarCodigo(int modulo, int codigo){
        
        NodoIndice q = cabezaIndice;
        
        while(q != null){

            if(q.getIndice() == modulo){

                break;

            } else {
   
                q = q.getSiguiente();

            }

        }
            
        q.getCodigos().eliminar(codigo);
        q.setTamaño(q.getTamaño()-1);

    }

    public NodoIndice getCabezaIndice() {
        return cabezaIndice;
    }

    public void setCabezaIndice(NodoIndice cabezaIndice) {
        this.cabezaIndice = cabezaIndice;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
}
