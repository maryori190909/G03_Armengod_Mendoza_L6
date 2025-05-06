
public class Test {
    public static void main(String[] args) {
        try{
            Stack<Integer> pi1= new StackArray<>(4);
            pi1.push(5);
            pi1.push(10);
            pi1.push(15);
            pi1.push(20);
            System.out.println(pi1);
        }
    }

}
