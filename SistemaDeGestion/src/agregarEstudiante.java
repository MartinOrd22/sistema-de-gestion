import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class agregarEstudiante{
        public static void main(String[] args){
    
            ArrayList<Estudiante> Estudiante = new ArrayList<Estudiante>();
            Scanner lector = new Scanner(System.in);
    
            boolean programaActivo = true;
    
            do {
    
            System.out.println("Que operacion queres hacer?");
            System.out.println("1 - Agregar un estudiante");
            System.out.println("2 - Consultar estudiantes");
            System.out.println("3 - Modificar el estado civil de un alumno");
            System.out.println("4 - Matricular un alumno en un nuevo curso");
            System.out.println("5 - Terminar el programa");
    
    
            int opcion = lector.nextInt();
            lector.nextLine();
    
            if(opcion == 1) {
                System.out.println("Introduce el nombre del estudiante");
                String nombre = lector.nextLine();
                System.out.println("Introduce el apellido del estudiante");
                String apellido = lector.nextLine();
                System.out.println("Introduce el DNI del estudiante");
                String dni = lector.nextLine();
                System.out.println("Introduce el estado civil del estudiante");
                String estadoCivil = lector.nextLine();
                System.out.println("Introduce los cursos del estudiante");
                String curso = lector.nextLine();
    
                Estudiante a = new Estudiante();
                System.out.println("Estudiante agregado!");
                a.setNombre(nombre);
                a.setApellido(apellido);
                a.setDni(dni);
                a.setEstadoCivil(estadoCivil);
                a.setCurso(curso);

                Estudiante.add(a);
            }else if(opcion == 2) {
                for(Estudiante a: Estudiante) {
                    System.out.println("Nombre: " + a.getNombre() + " " + a.getApellido() 
                                        + "/ DNI: " 
                                        + a.getDni() 
                                        + "/ Estado civil: " 
                                        + a.getEstadoCivil() 
                                        + "/ Cursos: "
                                        + a.getCurso());
                }
            }else if(opcion == 3) {
                
                System.out.println("Introduce el DNI del estudiante que queres modificar");
                String dni = lector.next();
    
                System.out.println("Introduce el nuevo estado civil de este estudiante");
                String estadoCivil2 = lector.next();
    
                Iterator<Estudiante> it = Estudiante.iterator();
                
                while(it.hasNext()){
                    Estudiante a = it.next();
                    if(a.getDni().equals(dni)) {
                        a.setEstadoCivil(estadoCivil2);
                    } else {
                        System.out.println(" el DNI ingresado es incorrecto");
                        };
                    };
            }else if(opcion == 4) {
                
                System.out.println("Introduce el DNI del estudiante que queres modificar");
                String dni = lector.nextLine();
    
                System.out.println("Introduce todos los cursos de este estudiante");
                String curso2 = lector.nextLine();
    
                Iterator<Estudiante> it = Estudiante.iterator();
                
                while(it.hasNext()){
                    Estudiante a = it.next();
                    if(a.getDni().equals(dni)) {
                        a.setCurso(curso2);
                    } else {
                        System.out.println(" el DNI ingresado es incorrecto");
                        };
                    };
            }else if(opcion == 5){
                programaActivo = false;
            }else {
                System.out.println("No elegiste correctamente");
            };
    
            }while(programaActivo);
    
    
        };
    }

