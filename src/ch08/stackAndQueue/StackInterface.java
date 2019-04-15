package ch08.stackAndQueue;

public interface StackInterface<E> {
    public boolean isEmpty();
    public E peek();
    public E pop();
    public E push(E item);
}
