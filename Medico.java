import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nombre;
    private String especialidad;
    private String telefono;
    private String correo;
    private List<Servicio> servicio;

    public Medico(String nombre, String especialidad, String telefono, String correo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
        this.servicio = new ArrayList<>();
        

    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }


    public void agregarServicio(Servicio servicio) {
    }

    public Servicio[] getServicio() {
        return new Servicio[0];
    }
}


