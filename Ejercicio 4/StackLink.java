package Ejercicio 4;

public class StackLink<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }

}
