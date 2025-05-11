package Actividad3;

public class Test {
    public static void main(String[] args) {
        try{
        PriorityQueue<String, Integer> cl = new PriorityQueueLinkSort<>();

            cl.enqueue("tarea A", 5);
            cl.enqueue("tarea B", 1);
            cl.enqueue("tarea C", 2);
            cl.enqueue("tarea D", 4);

            System.out.println("cola segun la prioridad: " + cl);
            System.out.println("frente: " + cl.front());
            System.out.println("final: " + cl.back());

            System.out.println("nueva cola, sin el de mayor prioridad: " + cl.dequeue());
            System.out.println("cola actual: " + cl);
    }catch (ExceptionIsEmpty e) {
        System.out.println("Error: " + e.getMessage());
    }
}

}
