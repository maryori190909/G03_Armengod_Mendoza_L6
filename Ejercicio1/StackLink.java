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

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("la pila esta vacia no sepuede hacer pop.");
        }
        E dato = tope.getData();
        tope = tope.getNext();
        return dato;
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("la pila esta vacia, no hay elemento que sea tope.");
        }
        return tope.getData();
    }

}
