import java.util.ArrayList;

public class Facultad {
    
    public String nombre;
    public ArrayList<Carrera> listacarreras;

    public Facultad(String ingNombre){
        this.nombre = ingNombre;
        listacarreras = new ArrayList<>();
    }

    public void agregarCarrera(Carrera newCarrera){
        this.listacarreras.add(newCarrera);
    }

    public void mostrarCarreras(){
        for (int i = 0; i < this.listacarreras.size(); i++) {
            System.out.println("id: "+i+" "+this.listacarreras.get(i));
        }
    }

    public void eliminarCarrera(Integer carrerae){
        this.listacarreras.remove(this.listacarreras.get(carrerae));
        System.out.println("La carrera ha sido eliminada exitosamente.\n");
    }

    public String getNombre(){
        return this.nombre;
    }

    public void changeNombre(String nombren){
        this.nombre = nombren;
        System.out.println("El nombre ha sido cambiado exitosamente a: "+ this.nombre+"\n"); 
    }

    public void eliminarFacultad(Integer facultade){
            this.listacarreras.remove( this.listacarreras.get(facultade) );
            System.out.println("La facultad ha sido eliminado exitosamente.\n");
    }

    public void modificarCarrera(Integer n, Carrera ce){
        this.listacarreras.set(n, ce);
        System.out.println("La carrera ha sido modificada exitosamente.");
    }
}
