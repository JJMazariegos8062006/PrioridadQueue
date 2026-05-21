package modelo;

/**
 * Representa la ficha de un paciente en la emergencia del hospital[cite: 15, 16].
 * Implementa Comparable para ordenar por código de emergencia (A-E)[cite: 35].
 */
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private String codigoEmergencia; // De la A a la E [cite: 18]

    /**
     * Constructor de la clase Paciente[cite: 35].
     */
    public Paciente(String nombre, String sintoma, String codigoEmergencia) {
        this.nombre = nombre.trim();
        this.sintoma = sintoma.trim();
        this.codigoEmergencia = codigoEmergencia.trim().toUpperCase();
    }

    public String getNombre() { return nombre; }
    public String getSintoma() { return sintoma; }
    public String getCodigoEmergencia() { return codigoEmergencia; }

    /**
     * Compara este paciente con otro según su código de emergencia[cite: 36].
     * El orden alfabético beneficia a 'A' sobre 'B', 'B' sobre 'C', etc[cite: 19].
     */
    @Override
    public int compareTo(Paciente o) {
        return this.codigoEmergencia.compareTo(o.getCodigoEmergencia());
    }

    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + codigoEmergencia;
    }
}
