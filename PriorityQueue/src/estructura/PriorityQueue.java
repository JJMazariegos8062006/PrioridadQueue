package estructura;

/**
 * Interfaz general para una cola con prioridad[cite: 37].
 * @param <E> el tipo de elementos que se guardarán, deben ser comparables.
 */
public interface PriorityQueue<E extends Comparable<E>> {
    public void add(E value);
    public E remove();
    public E peek();
    public boolean isEmpty();
    public int size();
    public void clear();
}
