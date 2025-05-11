package Ejercicio 4;


public class Aplicacion {
    public static boolean symbolBalancing(String s) {
        StackLink<Character> stack = new StackLink<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;}
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                    }
        }

    }
    return stack.isEmpty();
    }
}
