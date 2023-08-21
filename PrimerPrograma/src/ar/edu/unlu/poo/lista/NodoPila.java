package ar.edu.unlu.poo.lista;

public class NodoPila {
    private Object dato;

    private NodoPila siguiente = null;

    private NodoPila tope = null;

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setSiguiente(NodoPila nodo) {
        this.siguiente = nodo;
    }

    public void setTope(NodoPila nodo) {
        this.tope = nodo;
    }
    public Object getDato() {
        return dato;
    }

    public NodoPila getTope() {
        return tope;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

}
