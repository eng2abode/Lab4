public interface Queue<E> {
    boolean isEmpty();
    boolean isFull();
    int size();
    void enqueue(E element);
    E dequeue();
    void first();
}
