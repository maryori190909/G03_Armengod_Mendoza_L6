package Ejercicio3;

import Actividad2.QueueLink;

public class PriorityQueueLinked <E> implements PriorityQueue<E, Integer> {
    private Queue<E>[] queues;
    private int numP;
    public PriorityQueueLinked(int numP) {
        this.numP = numP;
        this.queues = new Queue[numP];
        for (int i = 0; i < numP; i++) {
            queues[i] = new QueueLink<>();
        }
    }

    @Override
    public void enqueue(E x, Integer pr) {
        if (pr < 0 || pr >= numP) {
            throw new IllegalArgumentException("la prioridad esta fuera de los parametros");
        }
        queues[pr].enqueue(x);
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        for (int i = 0; i < numP; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].dequeue();
            }
        }
        throw new ExceptionIsEmpty("no hay elementos");
    }


}
