
package dispersiones;

public class ListaCodigos {
  
    private NodoCodigo cabezaCodigo;
    
    public void insertar(int codigo, String nombre){
        
        NodoCodigo nuevoCodigo = new NodoCodigo(codigo, nombre);
        
        if(cabezaCodigo == null){
        
            cabezaCodigo = nuevoCodigo;
            
        } else {
            
            NodoCodigo q = cabezaCodigo;
            NodoCodigo s = null;
            
            while(q != null && q.getCogigo() != codigo){
                
                    s=q;        
                    q = q.getSiguiente();

            }
        
            if(q == null){
                
                s.setSiguiente(nuevoCodigo);
                
            } else {
                
                System.out.println("Ese codigo ya esta siendo usado");
                
            }
            
            
        }
        
    }
    
    public void eliminar( int codigo ){
    
        NodoCodigo q = cabezaCodigo;
        NodoCodigo s = null;

        while(q != null){

            if(q.getCogigo() == codigo ){

                break;

            } else {

                s=q;        
                q = q.getSiguiente();

            }

        }
        
        if(q == null){
                
            System.out.println("No se encuentra el estudiante en la meteria");

        } else if (s == null){
            
            cabezaCodigo = q.getSiguiente();
            
        }else{

            s.setSiguiente(q.getSiguiente());
            q = null;

        }
        
    }
    
    public void imprimir(){
        
        NodoCodigo q = cabezaCodigo;
        
        while(q != null){
            
            System.out.print(q.getNombre() + " ---> ");
            q = q.getSiguiente();
            
        }
        
        System.out.println(" ");
        
    }

    public NodoCodigo getCabezaCodigo() {
        return cabezaCodigo;
    }

    public void setCabezaCodigo(NodoCodigo cabezaCodigo) {
        this.cabezaCodigo = cabezaCodigo;
    }
    
}
