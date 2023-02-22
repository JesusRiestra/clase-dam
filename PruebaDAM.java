

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PruebaDAM.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PruebaDAM
{
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;
    private ClaseDam claseDam1;

    /**
     * Default constructor for test class PruebaDAM
     */
    public PruebaDAM()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        
        alumno1 = new Alumno("Jesús Riestra Ricote", "1234", 18);
        alumno2 = new Alumno("Moises Cela Martinez", "5678", 19);
        alumno3 = new Alumno("Ivan Martín Perez", "9012", 20);
        alumno4 = new Alumno("Deian Rus", "3456", 21);
        alumno5 = new Alumno("Aldo Nicolas Paez", "7890", 22);
        claseDam1 = new ClaseDam(5);
        claseDam1.matricularAlumno(alumno1);
        claseDam1.matricularAlumno(alumno2);
        claseDam1.matricularAlumno(alumno3);
        claseDam1.matricularAlumno(alumno4);
        claseDam1.matricularAlumno(alumno5);
        claseDam1.getNumeroDeAlumnos();
        claseDam1.imprimeDetalles();
        claseDam1.imprimeDetalles();
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
