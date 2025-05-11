package Actividad3;

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

    

}
