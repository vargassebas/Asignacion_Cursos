import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        //declaracion
        Scanner teclado = new Scanner(System.in);
        Integer eleccion = 0;

        //facultades ya existentes
        Facultad f1 = new Facultad("FISICC");

        //carreras ya existentes
        POI directorc1 = new POI("Ph.D Rocael Hernandez","director");
        //Carrera c1 = new Carrera("TDN", directorc1);
        Carrera c1 = new Carrera("Tecnico en Desarrollo de Software", directorc1, "TDN");
        POI directorc2 = new POI("Dr. Jorge Iván Echeverría Permouth", "director");
        //Carrera c2 = new Carrera("IME", directorc2);
        Carrera c2 = new Carrera("Ingenieria en Mecatronica", directorc2, "IME");
        f1.listacarreras.add(c1);
        f1.listacarreras.add(c2);

        //cursos ya existentes
        //cursos TDN
        Cursos cu1 = new Cursos("Matematica 1", new Horario(1900, "Lunes"), new Catedratico("Lic. Jorge Galindo"));
        Cursos cu2 = new Cursos("POO 1", new Horario(1700, "Lunes"), new Catedratico("Ing. Erwin Eugenio González"));
        Cursos cu3 = new Cursos("Base de Datos 1", new Horario(1900, "Miercoles"), new Catedratico("Lic. Iván Santizo"));
        Cursos cu4 = new Cursos("Ingles Tecnico 1", new Horario(1700, "Miercoles"), new Catedratico("Lic. Carlos Cáceres"));
        c1.agregarCurso(cu1);
        c1.agregarCurso(cu2);
        c1.agregarCurso(cu3);
        c1.agregarCurso(cu4);

        //menu de opciones
        while (eleccion != 3){//inicio while
        System.out.println("Bienvenido al GES beta");
        System.out.println("A continuacion las opciones:");
        System.out.println("1. Escoger una facultad.");
        System.out.println("2. Modificar facultades.");
        System.out.println("3. Salir.");
        eleccion = teclado.nextInt();
        teclado.nextLine();

        switch (eleccion) {//primer switch
            case 1://escoger
                eleccion = 0;
                while (eleccion != 2){
                System.out.println("Escoja una facultad");
                System.out.println("1. "+f1.getNombre());
                System.out.println("2. Regresar");
                eleccion = teclado.nextInt();
                teclado.nextLine();

                switch (eleccion) {//segundo switch facultad
                    case 1://fisicc
                        while(eleccion != 4){
                        System.out.println("Bienvenido a la Facultad de "+f1.getNombre());//fisicc
                        System.out.println("1. Escoger Carrera.");
                        System.out.println("2. Lista de Carreras");
                        System.out.println("3. Modificar Carreras");
                        System.out.println("4. Salir.");
                        eleccion = teclado.nextInt();
                        teclado.nextLine();
                        switch (eleccion) {//tercer switch
                            case 1://escoger carrera
                                while (eleccion != 3){
                                System.out.println("Escoja la carrera que desea:");
                                //System.out.println("1. "+c1.getNombre()+"(Tecnico de Desarrollo de Software)");
                                //System.out.println("2. "+c2.getNombre()+"(Ingenieria en Mecatronica)");
                                System.out.println("1. "+c1.getAbreviatura()+c1.getNombre()+")");
                                System.out.println("2. "+c2.getAbreviatura()+c2.getNombre()+")");
                                System.out.println("3. Regresar");
                                eleccion = teclado.nextInt();
                                teclado.nextLine();
                                switch (eleccion) {
                                    case 1://tdn
                                            while (eleccion != 4){
                                            System.out.println("Usted escogio la carrera de "+c1.getNombre());//TDN
                                            System.out.println("1. Informacion de la carrera.");
                                            System.out.println("2. Lista Cursos.");
                                            System.out.println("3. Modificar Cursos.");
                                            System.out.println("4. Regresar.");
                                            eleccion = teclado.nextInt();
                                            teclado.nextLine();
                                            switch (eleccion) {
                                                case 1:
                                                eleccion=0;
                                                while (eleccion != 1){
                                                System.out.println("A continuacion, informacion acerca de la carrera: ");
                                                c1.getInfo();
                                                System.out.println("Desea regresar al menu?");
                                                System.out.println("1. Si");
                                                eleccion = teclado.nextInt();
                                                teclado.nextLine();
                                                }break;

                                                case 2:
                                                while (eleccion != 1){
                                                System.out.println("A continuacion la lista de cursos de la carrera:"+c1.getNombre());
                                                c1.mostrarCursos();
                                                System.out.println("Desea regresar al menu?");
                                                System.out.println("1. Si");
                                                eleccion = teclado.nextInt();
                                                teclado.nextLine();
                                                }break;

                                                case 3:
                                                eleccion = 0;
                                                    while (eleccion != 3){
                                                    System.out.println("1. Agregar Cursos");
                                                    System.out.println("2. Eliminar Cursos");
                                                    System.out.println("3. Regresar");
                                                    eleccion = teclado.nextInt();
                                                    teclado.nextLine();

                                                        switch (eleccion) {
                                                            case 1:
                                                            String nombrec;
                                                            System.out.println("Ingrese el nombre del curso:");
                                                            nombrec = teclado.nextLine();
                                                            String diac;
                                                            System.out.println("Ingrese el dia que se llevara el curso:");
                                                            diac = teclado.nextLine();
                                                            Integer horac;
                                                            System.out.println("Ingrese el horario de inicio del curso:");
                                                            horac = teclado.nextInt();
                                                            teclado.nextLine();
                                                            String catedraticoc;
                                                            System.out.println("Ingrese el nombre del catedratico:");
                                                            catedraticoc = teclado.nextLine();
                                                            Cursos nuevoCurso = new Cursos(nombrec, new Horario(horac, diac), new Catedratico(catedraticoc));
                                                            c1.agregarCurso(nuevoCurso);
                                                            break;
                                                            
                                                            case 2:
                                                            c1.mostrarCursos();
                                                            System.out.println("Ingrese el id del curso que desea eliminar:");
                                                            Integer posicion = teclado.nextInt();
                                                            teclado.nextLine();
                                                            c1.eliminarCurso(posicion);
                                                            break;
                                                        } 
                                                    }break;
                                            }
                                    }break;
                                    
                                
                                    case 2://im
                                        while(eleccion != 4){
                                            System.out.println("Usted escogio la carrera de "+c2.getNombre());//IM
                                            System.out.println("1. Informacion de la carrera.");
                                            System.out.println("2. Lista de Cursos.");
                                            System.out.println("3. Modificar Cursos.");
                                            System.out.println("4. Regresar.");
                                            eleccion = teclado.nextInt();
                                            teclado.nextLine();
                                                switch (eleccion) {
                                                    case 1:
                                                    eleccion = 0;
                                                    while (eleccion != 1){
                                                        System.out.println("A continuacion, informacion acerca de la carrera: ");
                                                        c2.getInfo();
                                                        System.out.println("Desea regresar al menu?");
                                                        System.out.println("1. Si");
                                                        eleccion = teclado.nextInt();
                                                        teclado.nextLine();
                                                        }break;
                                                    case 2:
                                                    while (eleccion != 1){
                                                        System.out.println("A continuacion la lista de cursos de la carrera:"+c2.getNombre());
                                                        c2.mostrarCursos();
                                                        System.out.println("Desea regresar al menu?");
                                                        System.out.println("1. Si");
                                                        eleccion = teclado.nextInt();
                                                        teclado.nextLine();
                                                        }break;
                                                    case 3:
                                                    eleccion = 0;
                                                    while (eleccion != 3){
                                                    System.out.println("A continuacion las opciones: ");
                                                    System.out.println("1. Agregar Cursos");
                                                    System.out.println("2. Eliminar Cursos");
                                                    System.out.println("3. Regresar");
                                                    eleccion = teclado.nextInt();
                                                    teclado.nextLine();

                                                        switch (eleccion) {
                                                            case 1:
                                                            String nombrec;
                                                            System.out.println("Ingrese el nombre del curso:");
                                                            nombrec = teclado.nextLine();
                                                            String diac;
                                                            System.out.println("Ingrese el dia que se llevara el curso:");
                                                            diac = teclado.nextLine();
                                                            Integer horac;
                                                            System.out.println("Ingrese el horario de inicio del curso:");
                                                            horac = teclado.nextInt();
                                                            teclado.nextLine();
                                                            String catedraticoc;
                                                            System.out.println("Ingrese el nombre del catedratico:");
                                                            catedraticoc = teclado.nextLine();
                                                            Cursos nuevoCurso = new Cursos(nombrec, new Horario(horac, diac), new Catedratico(catedraticoc));
                                                            c2.agregarCurso(nuevoCurso);
                                                            eleccion = 3;
                                                            break;
                                                            
                                                            case 2:
                                                            c2.mostrarCursos();
                                                            System.out.println("Ingrese el id del curso que desea eliminar:");
                                                            Integer posicion = teclado.nextInt();
                                                            teclado.nextLine();
                                                            c2.eliminarCurso(posicion);
                                                            eleccion = 3;
                                                            break;
                                                        } 
                                                    }break;
                                                }
                                        }break;
                                }
                                
                            }break;
                            case 2://lista de carreras
                                while (eleccion != 1) {
                                    System.out.println("A continuacion la lista de las carreras de la facultad "+f1.getNombre());
                                    System.out.println(f1.listacarreras);
                                    System.out.println("Desea regresar al menu?");
                                    System.out.println("1. Si.");
                                    eleccion = teclado.nextInt();
                                    teclado.nextLine();
                                }break;

                            case 3://modificar carreras
                            eleccion = 0;
                            while (eleccion != 3){
                            System.out.println("Que es lo que desea hacer?");
                            System.out.println("1. Modificar carrera completa.");
                            System.out.println("2. Eliminar carrera.");
                            System.out.println("3. Salir");
                            eleccion = teclado.nextInt();
                            teclado.nextLine();
                            switch (eleccion) {
                                case 1:
                                Integer id = 0;
                                String nombreca, nombrepoi, rangopoi;
                                    f1.mostrarCarreras();
                                    System.out.println("Escoja el id de la carrera que quiere modificar: ");
                                    id = teclado.nextInt();
                                    teclado.nextLine();
                                    System.out.println("Escriba el nuevo nombre de la carrera: ");
                                    nombreca = teclado.nextLine();
                                    System.out.println("Escriba el nombre de la persona de interes de la carrera: ");
                                    nombrepoi = teclado.nextLine();
                                    System.out.println("Escriba el puesto de la persona de interes de la carrera: ");
                                    rangopoi = teclado.nextLine();
                                    Carrera mca = new Carrera(nombreca, new POI(nombrepoi, rangopoi));
                                    f1.modificarCarrera(id, mca);
                                    eleccion = 3;
                                    break;
                                case 2:
                                    f1.mostrarCarreras();
                                    System.out.println("Escoja el id de la carrera que desea eliminar:");
                                    Integer carrerae = teclado.nextInt();
                                    teclado.nextLine();
                                    f1.eliminarCarrera(carrerae);
                                    eleccion = 3;
                                    break;
                                }
                            }break;
                        }//fin de tercer switch 
                    }break;
                }//fin de segundo switch
                }break;
            
        
            case 2://modificar facultad
            eleccion = 0;
            while (eleccion != 2){
                System.out.println("Seleccione la facultad a la que le quiere cambiar el nombre:");
                System.out.println("1. "+f1.getNombre());
                System.out.println("2. Regresar");
                eleccion = teclado.nextInt();
                teclado.nextLine();
                String nombren;
                switch (eleccion) {
                    case 1:
                        System.out.println("Esta por cambiarle el nombre a la facultad de "+f1.getNombre());
                        System.out.println("Ingrese el nuevo nombre para la facultad:");
                        nombren = teclado.nextLine();
                        f1.changeNombre(nombren);
                        eleccion = 2;
                        break;
                }
            }break;
        }//fin primer switch
    }//fin while
        
        teclado.close();
    }            
}

