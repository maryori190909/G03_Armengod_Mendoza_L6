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

}
