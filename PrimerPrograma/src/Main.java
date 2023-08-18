import ar.edu.unlu.poo.lista.ListaEnlazada;
import ar.edu.unlu.poo.lista.Nodo;

public class Main {
    public static void main(String[] args) {
        /*
        Nodo miNodo = new Nodo();
        miNodo.setDato("Hola Mundo");
        System.out.println(miNodo.getDato());
        System.out.println(miNodo);
        miNodo.setDato("Como estas?");
        System.out.println(miNodo.getDato());
        System.out.println(miNodo);
        Nodo miNodo2 = new Nodo();
        miNodo2.setDato("Como estas?");
        System.out.println(miNodo2.getDato());
        System.out.println(miNodo2);
        miNodo.setProximo(miNodo2);
        System.out.println(miNodo.getProximo().getDato());
        */

        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("Hola");
        lista.agregar("Mundo");
        System.out.println(lista);
    }
}