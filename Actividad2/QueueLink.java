package Actividad2;
import Actividad2.Queue;

public class QueueLink<E> implements Queue<E>{
    private Node<E> first;
    private Node<E> last;

    public QueueLink(){
        this.first = null;
        this.last = null;
    }

    public void enqueue(E x){
        Node<E> nuevo =  new Node<>(x);
        if(isEmpty()){
            first = nuevo;
        }else{
            last.setNext(nuevo);
        }
        last = nuevo;
    }

    public E dequeue() throws ExceptionIsEmpty{
        if(isEmpty()){
            throw new ExceptionIsEmpty(" cola vacia, no hay elementos que eliminar");
        }
        E dato = first.getData();
        first = first.getNext();
        if(first == null){
            last = null;
        }
        return dato;
    }

    public E front() throws ExceptionIsEmpty{
        if(isEmpty()){
            throw new ExceptionIsEmpty(" Cola vacia, no hay elemento en el frente ");
        }
        return first.getData();
    }

    public E back() throws ExceptionIsEmpty{
        if(isEmpty()){
            throw new ExceptionIsEmpty(" cola vacia, no hay elemento al final");
        }
        return last.getData();
    }

    public boolean isEmpty(){
        return first == null;
    }

    @Override
    public String toString(){
        StringBuilder resultado = new StringBuilder("Cola [ ");
        Node<E> actual = first;
        while(actual != null){
            resultado.append(actual.getData());
            if(actual.getNext()!= null){
                resultado.append(", ");
            }
            actual = actual.getNext();
        }
        resultado.append("]");
        return resultado.toString();
    }


}
