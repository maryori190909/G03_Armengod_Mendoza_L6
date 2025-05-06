public class StackArray <E> implements Stack <E>{
    private E[] array;
    private int tope;
    
    public StackArray (int capacidad){
        this.array =(E[]) new Object[capacidad];
        this.tope = -1;
    }

}
