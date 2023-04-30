public class Paciente {
    private String nombre;
    private int edad;
    private String genero;
    private String telefono;
    private String correo;

    public Paciente(String nombre, int edad, String genero, String telefono, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
}