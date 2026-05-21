package App;

import controlador.HospitalControlador;
import estructura.PriorityQueue;
import estructura.VectorHeap;
import modelo.Paciente;
import java.util.List;

/**
 * Aplicación principal utilizando la implementación propia VectorHeap[cite: 37].
 */
public class EmergenciaVectorHeap {
    public static void main(String[] args) {
        PriorityQueue<Paciente> hospitalCola = new VectorHeap<>();
        HospitalControlador controlador = new HospitalControlador();

        // Cargar datos
        List<Paciente> pacientes = controlador.cargarPacientes();
        for (Paciente p : pacientes) {
            hospitalCola.add(p);
        }

        // Atender
        System.out.println("=== ATENCIÓN DE EMERGENCIAS (Custom VectorHeap) ===");
        while (!hospitalCola.isEmpty()) {
            Paciente atendido = hospitalCola.remove(); // Retira al de mayor prioridad [cite: 20, 26]
            System.out.println("Doctor atiende a -> " + atendido);
        }
    }
}
