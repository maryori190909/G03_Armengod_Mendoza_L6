package Ejercicio3;
import Ejercicio3.PriorityQueue;
import Ejercicio3.PriorityQueueLinked;

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

            System.out.println("cola:");
            System.out.println(pq);

            System.out.println("elemento del frente: " + pq.front());
            System.out.println("elemento al final: " + pq.back());

            System.out.println("desencolando: " + pq.dequeue());
            System.out.println("desencolando: " + pq.dequeue());

            System.out.println("cola despues de eliminar 2:");
            System.out.println(pq);

            System.out.println("la cola se encuentra vacia?: " + pq.isEmpty());

        }catch(ExceptionIsEmpty e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
