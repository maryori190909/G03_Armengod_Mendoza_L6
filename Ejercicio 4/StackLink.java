package Ejercicio 4;

public class StackLink<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }
    private Node<T> tope;
    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.next = tope;
        tope = node;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("la pila esta vacia");
        T value = tope.data;
        tope = tope.next;
        return value;
    }

    public boolean isEmpty() {
        return tope == null;
    }

}
