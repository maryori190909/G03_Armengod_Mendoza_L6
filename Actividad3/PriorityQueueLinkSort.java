package Actividad3;

import Actividad2.ExceptionIsEmpty;

public class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N>{
    class EntryNode {
        E data;
        N priority;

        EntryNode(E data, N priority) {
            this.data = data;
            this.priority = priority;
        }

        public String toString() {
            return "(" + data + ", la prioridad: " + priority + ")";
        }
    }
    private Node<EntryNode> first;
    private Node<EntryNode> last;

    public PriorityQueueLinkSort() {
        this.first = null;
        this.last = null;
    }
    @Override
    public void enqueue(E x, N pr) {
        EntryNode nuevo = new EntryNode(x, pr);
        Node<EntryNode> nuevoNodo = new Node<>(nuevo);

        if (isEmpty()) {
            first = last = nuevoNodo;
        }else if (pr.compareTo(first.getData().priority) > 0) {
            nuevoNodo.setNext(first);
            first = nuevoNodo;
        }else{
            Node<EntryNode> actual = first;
            Node<EntryNode> anterior = null;

            while (actual != null && pr.compareTo(actual.getData().priority) <= 0) {
                anterior = actual;
                actual = actual.getNext();
            }

            nuevoNodo.setNext(actual);
            if (anterior != null) {
                anterior.setNext(nuevoNodo);
            }

            if (nuevoNodo.getNext() == null) {
                last = nuevoNodo;
            }
        }
    }
    
    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("la cola esta vacia");
        E valor = first.getData().data;
        first = first.getNext();
        if (first == null) last = null;
        return valor;
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("la cola esta vacia, no hay elementos adelante");
        return first.getData().data;
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("cola vacia, no hay elementos al final");
        return last.getData().data;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("Cola segun prioridad [ ");
        Node<EntryNode> actual = first;
        while (actual != null) {
            resultado.append(actual.getData());
            if (actual.getNext() != null) {
                resultado.append(" : ");
            }
            actual = actual.getNext();
        }
        resultado.append(" ]");
        return resultado.toString();
    }

}
