import java.util.List;

public class Cita {
    private Paciente paciente;
    private Medico medico;
    private String fechaHora;


    public Cita(Paciente paciente, Medico medico, String fechaHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.fechaHora = fechaHora;

    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getFechaHora() {
        return fechaHora;
    }


}
