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


}
