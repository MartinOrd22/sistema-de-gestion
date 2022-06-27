import java.util.Iterator;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String dni;
    private String estadoCivil;
    private String curso;

// GETTERS Y SETTERS

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

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

//CONSTRUCTORES

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String dni, String estadoCivil, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
        this.curso = curso;
    }

//LISTADO DE ATRIBUTOS

    public String toString() {
        return "Estudiante: " + " Nombre: " + nombre + " Apellido=" + apellido + " Dni=" + dni + " Estado civil=" + estadoCivil ;
    }

    public static Iterator<Estudiante> iterator() {
        return null;
    }
}
