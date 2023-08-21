package ar.edu.unlu.poo.lista;

public class ListaEnlazada {

    private Nodo primero = null;

    public boolean esVacia() {
        Nodo nodoAux = primero;
        return primero == null;
    }

    public Integer longitud() {
        Integer i = 0;
        Nodo nodoAux = primero;
        if (!esVacia()) {
            while (nodoAux != null) {
                i++;
                nodoAux = nodoAux.getProximo();
            }
        }
        return i;
    }

    public void agregar(Object dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if (esVacia()) {
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

    public void borrar(Object dato) {
        if (esVacia()) {
            return;
        }
        Nodo nodoAux = primero;
        while (nodoAux != null && nodoAux.getDato() == dato) {
            primero = nodoAux.getProximo();
            nodoAux = primero;
        }
        while (nodoAux != null && nodoAux.getProximo() != null) {
            if (nodoAux.getProximo().getDato() == dato) {
                Nodo temp = nodoAux.getProximo();
                nodoAux.setProximo(temp.getProximo());
            } else {
                nodoAux = nodoAux.getProximo();
            }
        }

    }

    public Object recuperar(Integer pos) {
        int i;
        Nodo nodoAux = primero;
        for (i = 0; i < pos - 1; i++) {
            nodoAux = nodoAux.getProximo();
        }
        return nodoAux.getDato();
    }

    public void insertar(Integer pos, Object dato) {
        int i;
        Nodo nodoAux = primero;
        Nodo nuevo = null;
        nuevo.setDato(dato);
        if (pos == 1) {
            nuevo.setProximo(primero);
        }
        for (i = 0; i < pos - 2; i++) {
            nodoAux = nodoAux.getProximo();
        }
        nuevo.setProximo(nodoAux.getProximo());
        nodoAux.setProximo(nuevo);
    }

}


