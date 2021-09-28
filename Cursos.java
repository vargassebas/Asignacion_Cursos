public class Cursos {
    
    public String nombre;
    public Horario horario, dia;
    public Catedratico catedratico;

    public Cursos(String ingNombre, Horario hora, Catedratico cate) {
        this.nombre = ingNombre;
        this.horario = hora;
        this.catedratico = cate;
    }

    public Cursos(String ingNombre, Horario hora) {
        this.nombre = ingNombre;
        this.horario = hora;
    }

    public void agregarCatedratico(String nombreCate) {
        this.catedratico = new Catedratico(nombreCate);
    }
    
    public String toString(){
        return "nombre: "+ this.nombre + this.horario + this.catedratico;
    }
}
