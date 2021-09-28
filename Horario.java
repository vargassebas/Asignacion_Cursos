public class Horario {
    
    public Integer hora;
    public String dia;

    public Horario(Integer ingHora, String ingDia){
        this.hora = ingHora;
        this.dia = ingDia;
    }

    public String toString(){
        return " hora: " + this.hora;
    }
}
