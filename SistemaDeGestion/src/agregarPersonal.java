import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class agregarPersonal{
        public static void main(String[] args){
    
            ArrayList<Personal> Personal = new ArrayList<Personal>();
            Scanner lector = new Scanner(System.in);
    
            boolean programaActivo = true;
    
            do {
    
            System.out.println("Que operacion queres hacer?");
            System.out.println("1 - Agregar un Personal");
            System.out.println("2 - Consultar Personal");
            System.out.println("3 - Modificar estado civil de un Personal de servicio");
            System.out.println("4 - Traslado de seccion de un Personal de servicio");
            System.out.println("5 - Terminar el programa");
    
    
            int opcion = lector.nextInt();
            lector.nextLine();
    
            if(opcion == 1) {
                System.out.println("Introduce el nombre del Empleado");
                String nombre = lector.nextLine();
                System.out.println("Introduce el apellido del Empleado");
                String apellido = lector.nextLine();
                System.out.println("Introduce el DNI del Empleado");
                String dni = lector.nextLine();
                System.out.println("Introduce el estado civil");
                String estadoCivil = lector.nextLine();
                System.out.println("Introduce a que seccion pertenece");
                String seccion = lector.nextLine();
                System.out.println("Introduce el año de incorporacion");
                int incorporacion = lector.nextInt();
                System.out.println("Introduce el numero de despacho");
                int despacho = lector.nextInt();
    
                Personal a = new Personal();
                System.out.println("Empleado agregado!");
                a.setNombre(nombre);
                a.setApellido(apellido);
                a.setDni(dni);
                a.setEstadoCivil(estadoCivil);
                a.setSeccion(seccion);
                a.setIncorporacion(incorporacion);
                a.setDespacho(despacho);

                Personal.add(a);
            }else if(opcion == 2) {
                for(Personal a: Personal) {
                    System.out.println("Nombre: " + a.getNombre() 
                                       + " " + a.getApellido() 
                                       + " / DNI: " + a.getDni() 
                                       + " / Estado civil: " + a.getEstadoCivil() 
                                       + " / Seccion : " + a.getSeccion()
                                       + " / Año de incorporacion: " + a.getIncorporacion() 
                                       + " / Despacho N° : " + a.getDespacho());
                }
            }else if(opcion == 3) {
                System.out.println("Introduce el DNI del empleado que queres modificar");
                String dni = lector.nextLine();
    
                System.out.println("Introduce el nuevo estado civil de este empleado");
                String estadoCivil2 = lector.nextLine();
    
                Iterator<Personal> it = Personal.iterator();
                
                while(it.hasNext()){
                    Personal a = it.next();
                    if(a.getDni().equals(dni)) {
                        a.setEstadoCivil(estadoCivil2);
                    } else {
                        System.out.println(" el DNI ingresado es incorrecto");
                        };
                    };

            }else if(opcion == 4){

                System.out.println("Introduce el DNI del empleado que queres modificar");
                String dni = lector.nextLine();
    
                System.out.println("Introduce la nueva seccion de este empleado");
                String seccion2 = lector.nextLine();
    
                Iterator<Personal> it = Personal.iterator();
                
                while(it.hasNext()){
                    Personal a = it.next();
                    if(a.getDni().equals(dni)) {
                        a.setSeccion(seccion2);
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

