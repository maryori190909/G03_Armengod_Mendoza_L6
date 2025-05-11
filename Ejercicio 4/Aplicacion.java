package Ejercicio 4;

public class Aplicacion {
    public static boolean symbolBalancing(String s) {
        StackLink<Character> stack = new StackLink<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
        }

    }

}
