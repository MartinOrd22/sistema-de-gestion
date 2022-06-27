
import java.util.Iterator;

public class Profesor {

    private String nombre;
    private String apellido;
    private String dni;
    private String estadoCivil;
    private int incorporacion;
    private int despacho;
    private String departamento;

//GETTERS Y SETTERS

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getIncorporacion() {
        return this.incorporacion;
    }

    public void setIncorporacion(int incorporacion2) {
        this.incorporacion = incorporacion2;
    }

    public int getDespacho() {
        return this.despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

//CONSTRUCTORES

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String dni, String estadoCivil, int incorporacion, int despacho, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
        this.incorporacion = incorporacion;
        this.despacho = despacho;
        this.departamento = departamento;
    }
//LISTADO DE ATRIBUTOS

    public String toString() {
        return "Profesor: " + " Nombre: " + nombre + " Apellido: " + apellido + " Dni: " + dni + " Estado Civil: " + estadoCivil ;
    }

    public static void add(Profesor a) {
    }

    public static Iterator<Profesor> iterator() {
        return null;
    }
}
