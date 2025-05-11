package Ejercicio3;

public class QueueLink<E> implements Queue<E>{

    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) {
            this.data = data;
        }
    }
    private Node<E> first, last;

    @Override
    public void enqueue(E x) {
        Node<E> newNode = new Node<>(x);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }


    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacia");
        E data = first.data;
        first = first.next;
        if (first == null) last = null;
        return data;
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacia");
        return first.data;
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacia");
        return last.data;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> current = first;
        while (current != null) {
            sb.append(current.data).append(" :");
            current = current.next;
        }
        sb.append("NULL");
        return sb.toString();
    }
}


