package Ejercicio3;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> pq = new PriorityQueueLinked<>(3);

        try {
            pq.enqueue("tarea A", 0);
            pq.enqueue("tarea B", 1);
            pq.enqueue("tarea C", 1);
            pq.enqueue("tarea D", 2);
            pq.enqueue("tarea E", 2);
            pq.enqueue("tarea F", 0);

        }
    }

}
