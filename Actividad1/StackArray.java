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
        }else{
            tope++;
            array[tope] = elem;
        }
    }

    public E pop() throws ExceptionIsEmpty{
        if(isEmpty()){
            throw new ExceptionIsEmpty(" La pila esta vacia, no pueden sacarse elementos ");
        }
        E elem = array[tope];
        tope--;
        return elem;
    }

    public E top() throws ExceptionIsEmpty{
        if(isEmpty()){
            throw new ExceptionIsEmpty("No hay tope, la pila esta vacia ");
        }
        return array[tope];
    }

    public boolean isEmpty(){
        return tope == -1;
    }

    public boolean isFull(){
        return tope == array.length -1;
    }


}

