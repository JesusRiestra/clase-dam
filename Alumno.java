public class Alumno {

    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length() < 3) {
            System.out.println("El nombre del alumno es demasiado corto!");
        }

        if (numeroMatricula.length() < 4) {
            System.out.println("El n�mero de matricula es demasiado corto!");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }

    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String valorADevolver = "";
        if (nombre.length() >= 3 && numeroMatricula.length() >= 4) {
            valorADevolver = nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
        }
        else if (nombre.length() >= 3 && numeroMatricula.length() < 4) {
            valorADevolver = nombre.substring(0, 3) + numeroMatricula;
        }
        else if (nombre.length() < 3 && numeroMatricula.length() >= 4) {    
            valorADevolver = nombre + numeroMatricula.substring(0, 4);
        }
        else if (nombre.length() < 3 && numeroMatricula.length() < 4) {
            valorADevolver = nombre + numeroMatricula;
        }
        return valorADevolver;
    }
    
    public String devuelveDetalles() {
        return "" + nombre + " (" + numeroMatricula + ") - " + edad + " a�os";
    }
}