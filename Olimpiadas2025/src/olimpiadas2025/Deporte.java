
public class Deporte {
    private String nombre;
    private String disciplina;
    private int cantCategorias;
    
    public Deporte(String nom, String disc, int cantC){
        this.nombre = nom;
        this.disciplina = disc;
        this.cantCategorias=cantC;
    }
    
    public void setnombre(String a){
        this.nombre= a;
    }
    public void setdisciplina(String a){
        this.disciplina = a;
    }
    public void setCategorias(int a){
        this.cantCategorias= a;
    }
    public String getnombre(){
        return this.nombre;
    }
    public String getdisciplina(){
        return this.disciplina;
    }
    public int getcantCategorias(){
        return this.cantCategorias;
    }
}
