import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class agregarProfesor{
        public static void main(String[] args){
    
            ArrayList<Profesor> Profesor = new ArrayList<Profesor>();
            Scanner lector = new Scanner(System.in);
    
            boolean programaActivo = true;
    
            do {
    
            System.out.println("Que operacion queres hacer?");
            System.out.println("1 - Agregar un Profesor");
            System.out.println("2 - Consultar Profesores");
            System.out.println("3 - Modificar estado civil de un Profesor");
            System.out.println("4 - Modificar departamento de un Profesor");
            System.out.println("5 - Terminar el programa");
    
    
            int opcion = lector.nextInt();
            lector.nextLine();
    
            if(opcion == 1) {
                System.out.println("Introduce el nombre del Profesor");
                String nombre = lector.nextLine();
                System.out.println("Introduce el apellido del Profesor");
                String apellido = lector.nextLine();
                System.out.println("Introduce el DNI del Profesor");
                String dni = lector.nextLine();
                System.out.println("Introduce el estado civil del Profesor");
                String estadoCivil = lector.nextLine();
                System.out.println("Introduce el año de incorporacion");
                int incorporacion = lector.nextInt();
                System.out.println("Introduce el numero de despacho");
                int despacho = lector.nextInt();
                System.out.println("Introduce a que departamento pertenece");
                String departamento = lector.nextLine();
    
                Profesor a = new Profesor();
                System.out.println("Profesor agregado!");
                a.setNombre(nombre);
                a.setApellido(apellido);
                a.setDni(dni);
                a.setEstadoCivil(estadoCivil);
                a.setIncorporacion(incorporacion);
                a.setDespacho(despacho);
                a.setDepartamento(departamento);

                Profesor.add(a);
            }else if(opcion == 2) {
                for(Profesor a: Profesor) {
                    System.out.println("Nombre: " + a.getNombre() 
                                       + " " + a.getApellido() 
                                       + " / DNI: " + a.getDni() 
                                       + " / Estado civil: " + a.getEstadoCivil() 
                                       + " / Año de incorporacion: " + a.getIncorporacion() 
                                       + " / Despacho N° : " + a.getDespacho()
                                       + " / Departamento : " + a.getDepartamento());
                }
            }else if(opcion == 3) {
                System.out.println("Introduce el DNI del Profesor que queres modificar");
                String dni = lector.nextLine();
    
                System.out.println("Introduce el nuevo estado civil de este Profesor");
                String estadoCivil2 = lector.nextLine();
    
                Iterator<Profesor> it = Profesor.iterator();
                
                while(it.hasNext()){
                    Profesor a = it.next();
                    if(a.getDni().equals(dni)) {
                        a.setEstadoCivil(estadoCivil2);
                    } else {
                        System.out.println(" el DNI ingresado es incorrecto");
                        };
                    };

            }else if(opcion == 4){

                System.out.println("Introduce el DNI del Profesor que queres modificar");
                String dni = lector.nextLine();
    
                System.out.println("Introduce el nuevo departamento de este profesor");
                String departamento2 = lector.nextLine();
    
                Iterator<Profesor> it = Profesor.iterator();
                
                while(it.hasNext()){
                    Profesor a = it.next();
                    if(a.getDni().equals(dni)) {
                        a.setDepartamento(departamento2);
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

