package ListasEnlazadas;

import java.util.Iterator;

public class ListaEnlazada<T> implements Iterable<T> {

    /**
     * Defino Atributos
     */
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamanio;

    public ListaEnlazada(){
        primero =  null;
        ultimo = null;
        tamanio = 0;
    }

    /**
     * Verificar si lista esta vacia
     * @return
     */
    public boolean isEmpty(){
        return tamanio == 0;
    }

    /**
     * Devuelve el tamaño de la lista
     * @return
     */
    public int size(){
        return tamanio;
    }

    /**
     *  Devuelve el nodo que haya en esa posicion, null si no se encuenta o el index es incorrecto
     * @param index
     * @return
     */
    private Nodo<T> getNode(int index){
        
        //si esta vacio o el indice no es correcto, devuelve null
        if(isEmpty() || (index < 0 || index >= size())){
            return null;
        } else if (index == 0){
           return primero;
        } else if (index == size()-1){
            return ultimo;
        } else{
            Nodo<T> buscado = primero;
            //Busco el nodo deseado con un recorrido
            int contador = 0;
            while (contador < index){
                contador++;
                buscado =  buscado.getSiguiente();
            }
            return buscado;
        }
    }

    /**
     * Devuelve el elemento que haya en esa posicion, null si no se encuentra o el index si es incorrecto
     * @param index
     * @return
     */
    public T get(int index) {

        //si esta vacio o el indice no es correcto, devuelve null
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return getFirst(); //Cojo el primero
        } else if (index == size() - 1) {
            return getLast(); //Cojo el ultimo
        } else {

            //Uso la funcion getNode para coger el nodo deseado
            Nodo<T> buscado = getNode(index);
            return buscado.getElemento();
        }
    }

    /**
     * Devuelve el primer elemento, null si esta vacia la lista
     * @return
     */
    public T getFirst() {
            if(isEmpty()){
                return null;
            } else {
                return primero.getElemento();
            }
    }

    /**
     * Devuelve el ultimo elemento, null si esta vacia la lista
     * @return
     */
    public T getLast() {
        if(isEmpty()){
            return null;
        } else {
            return ultimo.getElemento();
        }
    }

    /**
     * Añade el elemento al principio de la lista
     * @param elemento
     * @return
     */
    public T addFirst(T elemento){
        Nodo<T> aux;
        //si esta vacia, el nodo será el primero y ultimo
            if(isEmpty()){
            aux = new Nodo<>(elemento, null);
            primero =aux;
            ultimo = aux;
        }else{
                //Hago el intercambio
                Nodo<T> primeroActual = primero;
            aux = new Nodo<>(elemento, primeroActual);
            primero = aux;
            }
            tamanio++;
            return primero.getElemento();
    }

    /**
     * Añade el elemento al final de la lista
     * @param elemento
     * @return
     */
    public T addLast(T elemento){
        Nodo<T> aux;
        //Si esta vacia, hago lo mismo que si fuera añadir el primero
        if(isEmpty()){
            addFirst(elemento);
        }else{
            //Hago el intercambio
            aux = new Nodo<>(elemento, null);
            ultimo.setSiguiente(aux);
            ultimo = aux;
        }
        tamanio++;
        return ultimo.getElemento();
    }

    /**
     * Añade un elemento en una posicion indicada
     * @param elemento
     * @param index
     * @return elemento añadido
     */
    public T add(T elemento, int index){
        //si esta vacio o el indice no es correcto, devuelve null
            if(index == 0){
                return addFirst(elemento);
            } else if(index == size()){
                return addLast(elemento);
            } else if( (index < 0 || index >= size()) ){
                return null;
            } else {
                //Cojo el anterior nodo al que estoy buscando
                Nodo<T> anterior = getNode(index -1);
                // actual es el que quiero insertar
                Nodo<T> actual = getNode(index);
                //Creo el nuevo novo, este apuntara al de la posicion actual
                Nodo<T> aux = new Nodo<>(elemento, actual);
                //el nodo anterior apunta a nuestro nuevo nodo
                anterior.setSiguiente(aux);

                tamanio++;
                return getNode(index).getElemento();
            }
    }

    /**
     * Devuelve el estado de la lista
     * @return
     */
    public String toString() {

        String contenido = "";

        //Si esta vacia, lo indica
        if (isEmpty()) {
            contenido = "Lista vacia";
        } else {
            Nodo<T> aux = primero;
            //Recorre la lista, mostrando el contenido
            while (aux != null) {
                contenido += aux.toString();
                aux = aux.getSiguiente();
            }
        }
        return contenido;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
