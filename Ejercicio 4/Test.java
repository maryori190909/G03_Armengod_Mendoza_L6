package Ejercicio 4;

public class Test {

    public static void main(String[] args) {
        String[] entradas = {
            "()()()[()]", "((()))[]", "[[[]](", "([{])}", "(", "[][[]]{{{}}}"};
        for (String s : entradas) {
            boolean resultado = Aplicacion.symbolBalancing(s);
            System.out.println("Entrada: " + s + " -> " + resultado);
        }
    }
}
