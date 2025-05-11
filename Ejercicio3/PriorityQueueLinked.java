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

    @Override
    public E front() throws ExceptionIsEmpty {
        for (int i = 0; i < numP; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].front();
            }
        }
        throw new ExceptionIsEmpty("la cola esta vacia");
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        for (int i = numP - 1; i >= 0; i--) {
            if (!queues[i].isEmpty()) {
                return queues[i].back();
            }
        }
        throw new ExceptionIsEmpty("la cola esta vacia");
    }
    @Override
    public boolean isEmpty() {
        for (int i = 0; i < numP; i++) {
            if (!queues[i].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numP; i++) {
            sb.append("la prioridad ").append(i).append(": ").append(queues[i].toString()).append("\n");
        }
        return sb.toString();
    }

}
