package Ejercicio1;

public class Test {
    public static void main(String[] args) {
        try{
            Stack<Integer> p1 = new StackLink<>();
            p1.push(5);
            p1.push(22);
            p1.push(19);

            System.out.println("pila de numeros enteros: " + p1);
            System.out.println("elemento del tope: " + p1.top());
            System.out.println("elemento eliminado: " + p1.pop());
            System.out.println("pila nueva: " + p1);

            Stack<String> p2 = new StackLink<>();
            p2.push("cachorros");
            p2.push("gatitos");
            p2.push("elefantes");
            System.out.println("pila de strings: " + p2);
        }catch(ExceptionIsEmpty e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
