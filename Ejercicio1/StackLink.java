package Ejercicio1;

public class StackLink<E> implements Stack<E> {
    private Node<E> tope;

    public StackLink() {
        this.tope = null;
    }

    public void push(E x) {
        Node<E> nuevo = new Node<>(x);
        nuevo.setNext(tope);
        tope = nuevo;
    }

}
