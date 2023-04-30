import org.junit.Test;
import static org.junit.Assert.*;

public class PacienteTest {

    @Test
    public void testGetNombre() {
        Paciente paciente = new Paciente("Juan Perez", 25, "Masculino", "555-5555", "juan.perez@gmail.com");
        assertEquals("Juan Perez", paciente.getNombre());
    }

    @Test
    public void testGetEdad() {
        Paciente paciente = new Paciente("Juan Perez", 25, "Masculino", "555-5555", "juan.perez@gmail.com");
        assertEquals(25, paciente.getEdad());
    }

    @Test
    public void testGetGenero() {
        Paciente paciente = new Paciente("Juan Perez", 25, "Masculino", "555-5555", "juan.perez@gmail.com");
        assertEquals("Masculino", paciente.getGenero());
    }

    @Test
    public void testGetTelefono() {
        Paciente paciente = new Paciente("Juan Perez", 25, "Masculino", "555-5555", "juan.perez@gmail.com");
        assertEquals("555-5555", paciente.getTelefono());
    }

    @Test
    public void testGetCorreo() {
        Paciente paciente = new Paciente("Juan Perez", 25, "Masculino", "555-5555", "juan.perez@gmail.com");
        assertEquals("juan.perez@gmail.com", paciente.getCorreo());
    }

}
