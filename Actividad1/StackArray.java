public class StackArray <E> implements Stack <E>{
    private E[] array;
    private int tope;
    
    public StackArray (int capacidad){
        this.array =(E[]) new Object[capacidad];
        this.tope = -1;
    }

    public void push(E elem){
        if (isFull()){
            System.out.println(" La pila se encuentra llena, no se puede agregar mas elementos ");
        }
    }

}
