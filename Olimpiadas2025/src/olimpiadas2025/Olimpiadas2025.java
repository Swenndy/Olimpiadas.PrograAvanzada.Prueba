import java.io.*;

public class Olimpiadas2025 {
    private ListaJO paises = new ListaJO();
    
    public boolean agregarPais(String nombre, String sigla){
        
        for(int i= 0 ; i< paises.tamaño();i++){
            paises.posicionar(i);
            
            Pais local = (Pais) paises.objetoActual();
            
            if(local.getnombre().equalsIgnoreCase(nombre) && local.getsigla().equalsIgnoreCase(sigla))
            {
                return false;
            }
        }
        Pais p = new Pais();
        p.setnombre(nombre);
        p.setsigla(sigla);
        paises.agregar(p);
        return true;
    }
    public Deporte eliminarDeporte(String nombreD,String nombreP){
    
        for (int i=0; i< paises.tamaño(); i++){
            paises.posicionar(i);
            Pais p = (Pais) paises.objetoActual();
            
            if(p.getnombre().equalsIgnoreCase(nombreP)){
                return p.eliminarDeporte(nombreD);
            }
        }
       return null; 
    }
    public RappiMapa paisesconDeporteMayor(int umbral){
        RappiMapa paisesValidos = new RappiMapa();
        
        for(int i= 0; i<paises.tamaño();i++){
            paises.posicionar(i);
            Pais p = (Pais)paises.objetoActual();
            
            ListaJO paisesCandidatos = p.deporteMayor(umbral);
            
            if(paisesCandidatos.tamaño()>3) paisesValidos.agregar(p.getnombre(), p);
        }
        if(paisesValidos.obtenerObjetos().size()>0) return paisesValidos;
        
        return null;
    }
}
