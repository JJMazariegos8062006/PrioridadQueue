package App;

import controlador.HospitalControlador;
import modelo.Paciente;
import java.util.List;
import java.util.PriorityQueue; // Utiliza el Java Collection Framework [cite: 39]

/**
 * Aplicación principal utilizando el PriorityQueue nativo de Java (JCF)[cite: 39].
 */
public class EmergenciaJCFHeap {
    public static void main(String[] args) {
        // Implementación directa del framework de Java [cite: 39]
        PriorityQueue<Paciente> hospitalCola = new PriorityQueue<>();
        HospitalControlador controlador = new HospitalControlador();

        // Cargar datos
        List<Paciente> pacientes = controlador.cargarPacientes();
        for (Paciente p : pacientes) {
            hospitalCola.add(p);
        }

        // Atender
        System.out.println("=== ATENCIÓN DE EMERGENCIAS (Java Collection Framework) ===");
        while (!hospitalCola.isEmpty()) {
            // En JCF usamos poll() para retirar y obtener el elemento con mayor prioridad [cite: 41]
            Paciente atendido = hospitalCola.poll();
            System.out.println("Doctor atiende a -> " + atendido);
        }
    }
}
