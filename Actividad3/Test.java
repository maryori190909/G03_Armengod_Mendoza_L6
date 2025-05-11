package Actividad3;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> cl = new PriorityQueueLinkSort<>();

            cl.enqueue("tarea A", 5);
            cl.enqueue("tarea B", 1);
            cl.enqueue("tarea C", 2);
            cl.enqueue("tarea D", 4);
    }

}
