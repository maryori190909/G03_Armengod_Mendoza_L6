package Ejercicio2;

public class QueueArray<E> implements Queue<E>{
    private E[] array;
    private int front;
    private int back;
    private int size;
    private int capacidad;

    public QueueArray(int capacidad) {
        this.capacidad = capacidad;
        this.array = (E[]) new Object[capacidad];
        this.front = 0;
        this.back = -1;
        this.size = 0;
    }

    public void enqueue(E x) {
        if (size == capacidad) {
            System.out.println("la cola se encuentra llena, no se puede agregar mas.");
            return;
        }
        back = (back + 1) % capacidad;
        array[back] = x;
        size++;
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("la cola esta vacia");
        }
        E elem = array[front];
        front = (front + 1) % capacidad ;
        size--;
        return elem;
    }

}
