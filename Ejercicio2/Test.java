package Ejercicio2;

public class Test {
    public static void main(String[] args) {
        try{
            Queue<Integer> ce = new QueueArray<>(3);
            ce.enqueue(12);
            ce.enqueue(29);
            ce.enqueue(5);

            System.out.println(ce);

            System.out.println("frente: " + ce.front());
            System.out.println("final: " + ce.back());

            ce.dequeue();
            System.out.println("cola despues de eliminar un elemento: " + ce);

            ce.enqueue(11);
            System.out.println("cola depues de agregar 11: " + ce);
        }
    }

}
