package controlador;

import modelo.Paciente;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HospitalControlador {

    public List<Paciente> cargarPacientes() {
        List<Paciente> lista = new ArrayList<>();

        // Usamos la ruta absoluta del recurso dentro del directorio compilado
        try (InputStream is = HospitalControlador.class.getResourceAsStream("/recursos/pacientes.txt")) {

            if (is == null) {
                System.out.println("Error: No se encontró el archivo 'pacientes.txt' en src/recursos/");
                return lista;
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (linea.trim().isEmpty()) continue;
                    String[] partes = linea.split(",");
                    if (partes.length == 3) {
                        lista.add(new Paciente(partes[0], partes[1], partes[2]));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error crítico al procesar el archivo: " + e.getMessage());
        }
        return lista;
    }
}