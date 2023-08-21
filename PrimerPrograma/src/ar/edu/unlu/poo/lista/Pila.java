package ar.edu.unlu.poo.lista;

public class Pila {

    private NodoPila nuevo = null;

    public void apilar(NodoPila pila, Object Dato){
     NodoPila NodoAux = nuevo;
    NodoAux.setDato(Dato);
    NodoAux.setSiguiente(pila.getTope());
    pila.setTope(NodoAux);
    }



}
