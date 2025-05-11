package Actividad3;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

}
