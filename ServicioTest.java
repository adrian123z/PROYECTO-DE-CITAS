import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServicioTest {

    @Test
    public void testGetNombre() {
        Servicio servicio = new Servicio("Consulta", 50.0);
        assertEquals("Consulta", servicio.getNombre());
    }

    @Test
    public void testGetPrecio() {
        Servicio servicio = new Servicio("Consulta", 50.0);
        assertEquals(50.0, servicio.getPrecio(), 0.01);
    }
}
