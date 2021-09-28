import java.util.Scanner;
import java.util.ArrayList;

public class Carrera {
    
    public ArrayList <Cursos> listacursos;
    Scanner teclado = new Scanner(System.in);
    
    public String nombre;
    POI director;

    String abreviatura;

    //constructor de carrera
    public Carrera(String ingNombre, POI ingDirector){
        this.nombre = ingNombre;
        this.director = ingDirector;
        listacursos = new ArrayList<>();
    }

    //constructor de carrera 2
    public Carrera(String ingNombre, POI ingDirector, String ingAbreviatura){
        this.nombre = ingNombre;
        this.director = ingDirector;
        this.abreviatura = ingAbreviatura;
        listacursos = new ArrayList<>();
    }

    //agregamos curso a carrera
    public void agregarCurso(Cursos newCurso){
        this.listacursos.add(newCurso);
        System.out.println("El curso ha sido creado exitosamente.\n");
    }

    public void mostrarCursos(){
        for (int i = 0; i < this.listacursos.size(); i++) {
            System.out.println("id: "+i+" "+this.listacursos.get(i));
        }
    }

    //eliminar curso de lista de cursos de carrera
    public void eliminarCurso(Integer cursoe){
                this.listacursos.remove(this.listacursos.get(cursoe));
                System.out.println("El curso ha sido eliminado exitosamente.\n");
    }

    public String toString(){
        return "carrera: " + this.nombre + " " + this.director + " abreviatura: " +this.abreviatura+ "\n";
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getAbreviatura(){
        return this.abreviatura;
    }


    public void getInfo() {
        
        System.out.println("Nombre de la Carrera: " + this.nombre + "\n" + this.director
        + "Lista de cursos: \n" + this.listacursos + " " +this.abreviatura);
    }

}
