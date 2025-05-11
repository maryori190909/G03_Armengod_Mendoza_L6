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

}
