public class POI {

        String nombre,cargo;
    
        public POI(String ingNombre, String ingCargo) {
            this.nombre = ingNombre;
            this.cargo = ingCargo;
        }
    
        public String getInfoPOI() {
            return this.cargo + " " + this.nombre;
        }
    
        public String toString(){
            return "POI: "+ this.nombre + " cargo: "+this.cargo;
        }
    }
