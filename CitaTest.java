import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CitaTest {

    @Test
    public void testGetPaciente() {
        Paciente paciente = new Paciente("John Doe", 30, "M", "1234567890", "johndoe@example.com");
        Medico medico = new Medico("Dr. Jane Smith", "Cardiología", "0987654321", "janesmith@example.com");
        Cita cita = new Cita(paciente, medico, "2023-05-01 10:00:00");
        assertEquals(paciente, cita.getPaciente());
    }

    @Test
    public void testGetMedico() {
        Paciente paciente = new Paciente("John Doe", 30, "M", "1234567890", "johndoe@example.com");
        Medico medico = new Medico("Dr. Jane Smith", "Cardiología", "0987654321", "janesmith@example.com");
        Cita cita = new Cita(paciente, medico, "2023-05-01 10:00:00");
        assertEquals(medico, cita.getMedico());
    }

    @Test
    public void testGetFechaHora() {
        Paciente paciente = new Paciente("John Doe", 30, "M", "1234567890", "johndoe@example.com");
        Medico medico = new Medico("Dr. Jane Smith", "Cardiología", "0987654321", "janesmith@example.com");
        Cita cita = new Cita(paciente, medico, "2023-05-01 10:00:00");
        assertEquals("2023-05-01 10:00:00", cita.getFechaHora());
    }
}
