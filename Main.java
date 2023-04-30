import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();
        List<Cita> citas = new ArrayList<>();

        boolean salir = false;
        while (!salir) {
            System.out.println(" Reserva Cita Medica");
            System.out.println("----------------------");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Agregar médico");
            System.out.println("3. Programar cita");
            System.out.println("4. Ver citas programadas");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del paciente:");
                    String nombrePaciente = scanner.nextLine();
                    System.out.println("Ingrese la edad del paciente:");
                    int edadPaciente = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el género del paciente:");
                    String generoPaciente = scanner.nextLine();
                    System.out.println("Ingrese el número de teléfono del paciente:");
                    String telefonoPaciente = scanner.nextLine();
                    System.out.println("Ingrese la dirección de correo electrónico del paciente:");
                    String correoPaciente = scanner.nextLine();

                    Paciente paciente = new Paciente(nombrePaciente, edadPaciente, generoPaciente, telefonoPaciente, correoPaciente);
                    pacientes.add(paciente);
                    System.out.println("Paciente agregado exitosamente.");
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del médico:");
                    String nombreMedico = scanner.nextLine();
                    System.out.println("Seleccione una especialidad:");
                    System.out.println("1. Pediatria");
                    System.out.println("2. Medicina General");
                    System.out.println("3. Cardiologia");
                    System.out.println("4. Dermatologia");
                    System.out.println("5. Odontologia");
                    int opcionEspecialidad = scanner.nextInt();
                    scanner.nextLine();

                    String especialidadMedico = "";
                    switch (opcionEspecialidad) {
                        case 1:
                            especialidadMedico = "Pediatria";
                            break;
                        case 2:
                            especialidadMedico = "Medicina General";
                            break;
                        case 3:
                            especialidadMedico = "Cardiologia";
                            break;
                        case 4:
                            especialidadMedico = "Dermatologia";
                            break;
                        case 5:
                            especialidadMedico = "Odontologia";
                            break;
                            default:
                            System.out.println("Opción no válida.");
                            break;
                    }

                    System.out.println("Ingrese el número de teléfono del médico:");
                    String telefonoMedico = scanner.nextLine();
                    System.out.println("Ingrese la dirección de correo electrónico del médico:");
                    String correoMedico = scanner.nextLine();

                    Medico medico = new Medico(nombreMedico, especialidadMedico, telefonoMedico, correoMedico);
                    medicos.add(medico);
                    System.out.println("Desea agregar servicios al médico? (s/n)");
                    String opcionServicios = scanner.nextLine();
                    while (opcionServicios.equalsIgnoreCase("s")) {
                        System.out.println("Descripcion del servicio");
                        String nombreServicio = scanner.nextLine();
                        System.out.println("Ingrese el precio del servicio:");
                        double precioServicio = scanner.nextDouble();
                        scanner.nextLine();

                        Servicio servicio = new Servicio(nombreServicio, precioServicio);
                        medico.agregarServicio(servicio);

                        System.out.println("Desea agregar otro servicio? (s/n)");
                        opcionServicios = scanner.nextLine();
                    }
                    System.out.println("Médico agregado exitosamente.");
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del paciente");
                    String nombredelPaciente = scanner.nextLine();
                    Paciente pacienteCita = null;
                    for (Paciente p : pacientes) {
                        if (p.getNombre().equals(nombredelPaciente)) {
                            pacienteCita = p;
                            break;
                        }
                    }
                    if (pacienteCita == null) {
                        System.out.println("Paciente no encontrado.");
                        break;
                    }

                    String[] opcionesEspecialidades = {"Pediatria", "Medicina General","Medicina","Cardiologia", "Dermatologia", "Odontologia"};
                    System.out.println("Elija la especialidad del médico:");
                    for (int i = 0; i < opcionesEspecialidades.length; i++) {
                        System.out.println((i+1) + ". " + opcionesEspecialidades[i]);
                    }
                    int opcionEspecialidads = scanner.nextInt();
                    scanner.nextLine();
                    if (opcionEspecialidads < 1 || opcionEspecialidads > opcionesEspecialidades.length) {
                        System.out.println("Opción inválida.");
                        break;
                    }
                    String especialidadMedicoCita = opcionesEspecialidades[opcionEspecialidads-1];

                    Medico medicoCita = null;
                    for (Medico m : medicos) {
                        if (m.getEspecialidad().equals(especialidadMedicoCita)) {
                            medicoCita = m;
                            break;
                        }
                    }
                    if (medicoCita == null) {
                        System.out.println("Médico no encontrado.");
                        break;
                    }

                    System.out.println("Ingrese la fecha y hora de la cita (formato dd/mm/aaaa hh:mm):");
                    String fechaHoraCita = scanner.nextLine();
                    Cita cita = new Cita(pacienteCita, medicoCita, fechaHoraCita);
                    citas.add(cita);
                    System.out.println("Cita programada exitosamente.");
                    break;

                   case 4:
                       if (citas.isEmpty()) {
                           System.out.println("No hay citas programadas.");
                           break;
                       }

                       System.out.println("Citas programadas:");
                       System.out.println("-------------------------");

                       for (Cita cital : citas) {
                           System.out.println("Paciente: " + cital.getPaciente().getNombre());
                           System.out.println("Médico: " + cital.getMedico().getNombre());
                           System.out.println("Especialidad: " + cital.getMedico().getEspecialidad());
                           System.out.println("Fecha y hora: " + cital.getFechaHora());
                           System.out.println("Servicios:");
                       }

                       break;

                        case 5:
                            salir = true;
                            System.out.println("Saliendo del programa...");
                            break;

                        default:
                            System.out.println("Opción inválida. Seleccione una opción válida.");
                            break;
                    }
            }
        }

    }

