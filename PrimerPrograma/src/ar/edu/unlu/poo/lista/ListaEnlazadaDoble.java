package ar.edu.unlu.poo.lista;

public class ListaEnlazadaDoble {
    private NodoDoble primero = null;

    public boolean esVacia() {
        NodoDoble nodoAux = primero;
        return primero == null;
    }

    public Integer longitud() {
        Integer i = 0;
        NodoDoble nodoAux = primero;
        if (!esVacia()) {
            while (nodoAux != null) {
                i++;
                nodoAux = nodoAux.getProximo();
            }
        }
        return i;
    }

    public void agregar(Object dato) {
        NodoDoble nuevoNodo = new NodoDoble();
        nuevoNodo.setDato(dato);
        if (esVacia()) {
            primero = nuevoNodo;
        } else {
            NodoDoble nodoAux = primero;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(nodoAux);
        }
    }

    public String toString() {
        String acumulador = "";
        Integer i = 1;
        NodoDoble nodoAux = primero;
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
        NodoDoble nodoAux = primero;
        while (nodoAux != null && nodoAux.getDato() == dato) {
            primero = nodoAux.getProximo();
            nodoAux = primero;
        }
        while (nodoAux != null && nodoAux.getProximo() != null) {
            if (nodoAux.getProximo().getDato() == dato) {
                NodoDoble temp = nodoAux.getProximo();
                nodoAux.setProximo(temp.getProximo());
                temp = temp.getProximo();
                temp.setAnterior(nodoAux);

            } else {
                nodoAux = nodoAux.getProximo();
            }
        }

    }

    public Object recuperar(Integer pos) {
        int i;
        NodoDoble nodoAux = primero;
        for (i = 0; i < pos - 1; i++) {
            nodoAux = nodoAux.getProximo();
        }
        return nodoAux.getDato();
    }

    public void insertar(Integer pos, Object dato) {
        int i;
        NodoDoble nodoAux = primero;
        NodoDoble nuevo = null;
        nuevo.setDato(dato);
        if (pos == 1) {
            nuevo.setProximo(primero);
            nuevo.setAnterior(null);
        }
        for (i = 0; i < pos - 2; i++) {
            nodoAux = nodoAux.getProximo();
        }
        nuevo.setProximo(nodoAux.getProximo());
        nuevo.setAnterior(nodoAux);
        nodoAux.setProximo(nuevo);
        nodoAux = nuevo.getProximo();
        nuevo.setAnterior(nodoAux);
    }

}
