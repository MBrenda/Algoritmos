package ListasEnlazadas;

/**
 * Esta clase contiene la informacion de los objetos de la lista, llamados Nodos
 */
public class Nodo<T> {

    private T elemento;
    private Nodo<T> siguiente;

    /**
     * Constructor por defecto
     */
    public Nodo(){
        siguiente = null;
    }

    /**
     * Le pasamos un dato al nodo
     * @param p
     */
    public Nodo(T p){
        siguiente = null;
        elemento = p;
    }

    /**
     * Le pasamos un dato y su siguiente nodo al nodo
     * @param t Dato a insertar
     * @param siguiente Su siguiente nodo
     */
    public Nodo(T t, Nodo<T> siguiente){
        this.siguiente = siguiente;
        elemento = t;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
