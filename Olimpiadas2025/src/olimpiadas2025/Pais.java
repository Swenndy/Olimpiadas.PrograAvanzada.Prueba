
import java.io.*;
public class Pais {
    private String nombre;
    private String sigla;
    private RappiMapa deportes = new RappiMapa();
    
    
    
    public Deporte eliminarDeporte(String nom){
        if (deportes.contieneClave(nom)){
            return (Deporte) deportes.eliminar(nom);
           
        }
        return null;
    }
    
    public ListaJO deporteMayor(int um){
        ListaJO lc = new ListaJO();
        TikiList listaDeporte = deportes.obtenerObjetos();
        
        for(int i=0; i<listaDeporte.size();i++){
            Deporte Dlocal = (Deporte)listaDeporte.get(i);
            
            if(Dlocal.getcantCategorias()>=um){
                lc.agregar(Dlocal);
                
            }
        }
        if(lc.tamaño()==0) return null;
        return lc;
        
    }
    public void setnombre(String nom){
        this.nombre=nom;
    }
    public void setsigla(String s){
        this.sigla = s; 
    }
    public String getnombre(){
        return this.nombre;
    }
    public String getsigla(){
        return this.sigla;
    }
    public RappiMapa getDeportes(){
        return this.deportes;
    }
}


