package Actividad2;
import Actividad2.Queue;
import Actividad2.QueueLink;

public class Test {
    public static void main(String[] args) {
        try{
            Queue<Integer> cl1 = new QueueLink<Integer>();
            cl1.enqueue(6);
            cl1.enqueue(12);
            cl1.enqueue(18);

            System.out.println(" cola1: "+ cl1);
            System.out.println(" Frente: "+ cl1.front());
            System.out.println( "Final: "+ cl1.back());

            System.out.println(" elminar el elemento del frente:" + cl1.dequeue());
            System.out.println("Nueva cola: "+ cl1);

            Queue<String> cl2 = new QueueLink<String>();
            cl2.enqueue("Gato");
            cl2.enqueue(" raton");
            cl2.enqueue("perro");

            System.out.println("cola2:"+ cl2);
        }catch(ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());

    }
    }
}
