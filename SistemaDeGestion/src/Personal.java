

public class Personal {

    private String nombre;
    private String apellido;
    private String dni;
    private String estadoCivil;
    private int incorporacion;
    private int despacho;
    private String seccion;

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

    public void setIncorporacion(int incorporacion) {
        this.incorporacion = incorporacion;
    }

    public int getDespacho() {
        return this.despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public String getSeccion() {
        return this.seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

//CONSTRUCTORES

    public Personal() {
    }

    public Personal(String nombre, String apellido, String dni, String estadoCivil, int incorporacion, int despacho, String seccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
        this.incorporacion = incorporacion;
        this.despacho = despacho;
        this.seccion = seccion;
    }
    

    public String toString() {
        return "Personal de Servicio: " + " Nombre: " + nombre + " Apellido: " + apellido + " Dni: " + dni + " Estado Civil: " + estadoCivil ;
    }
}

