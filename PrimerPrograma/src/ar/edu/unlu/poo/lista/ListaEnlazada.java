package ar.edu.unlu.poo.lista;

public class ListaEnlazada {

    private Nodo primero = null;

    public void agregar(Object dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo nodoAux = primero;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
        }
    }

    public String toString() {
        String acumulador = "";
        Integer i = 1;
        Nodo nodoAux = primero;
        if (primero == null)
            acumulador = "Lista Vacia";
        else {
            while (nodoAux.getProximo() != null) {
                acumulador += "Nodo " + i + " " + nodoAux.getDato() + "\n";
                i++;
                nodoAux = nodoAux.getProximo();
            }
            acumulador += "Nodo " + i + " " + nodoAux.getDato();
        }
        return acumulador;
    }
}
