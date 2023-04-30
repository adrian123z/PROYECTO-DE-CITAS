import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MedicoTest {

    private Medico medico;
    private Servicio servicio1;
    private Servicio servicio2;

    @Before
    public void setUp() {
        medico = new Medico("Juan Perez", "Cardiología", "555-1234", "jperez@gmail.com");
        servicio1 = new Servicio("Consulta", 100.0);
        servicio2 = new Servicio("Examen", 200.0);
    }

    @Test
    public void testGetNombre() {
        assertEquals("Juan Perez", medico.getNombre());
    }

    @Test
    public void testGetEspecialidad() {
        assertEquals("Cardiología", medico.getEspecialidad());
    }

    @Test
    public void testGetTelefono() {
        assertEquals("555-1234", medico.getTelefono());
    }

    @Test
    public void testGetCorreo() {
        assertEquals("jperez@gmail.com", medico.getCorreo());
    }

    @Test
    public void testAgregarServicio() {
        medico.agregarServicio(servicio1);
        assertEquals(1, medico.getServicio().length);
        assertEquals(servicio1, medico.getServicio()[0]);
    }

    @Test
    public void testGetServicio() {
        medico.agregarServicio(servicio1);
        medico.agregarServicio(servicio2);
        Servicio[] servicios = medico.getServicio();
        assertEquals(2, servicios.length);
        assertEquals(servicio1, servicios[0]);
        assertEquals(servicio2, servicios[1]);
    }

}
