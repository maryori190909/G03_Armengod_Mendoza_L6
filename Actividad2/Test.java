package Actividad2;
import java.util.Queue;

import Actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        try{
            Queue<Integer> cl1 = new QueueLink<>();
            cl1.enqueue(6);
            cl1.enqueue(12);
            cl1.enqueue(18);

            System.out.println(" cola1: "+ cl1);
            System.out.println(" Frente: "+ cl1.front());
            System.out.println( "Final: "+ cl1.back());
        }
    }

}
