public class ArrayQueue<E>implements Queue<E> {
    final static int CAP=100;
    E[] data;
    int sz =0;
    int f=0;

    public ArrayQueue(int c) {
        data=(E[]) new Object[c];
    }
    public ArrayQueue() {
        this(CAP);
    }
    @Override
    public boolean isEmpty() {
        return sz==0;
    }
    @Override
    public boolean isFull(){
        return sz==5;
    }
    @Override
    public int size() {
        return sz;
    }
    @Override
    public void enqueue(E element) {
        if(isFull())
            throw new IllegalStateException("Queue is full");
        int index=(f+sz)%data.length;
        data[index]=element;
        sz++;
    }
    @Override
    public E dequeue() {
        if(isEmpty())return null;
        E delete=data[f];
        f=(f+1)%data.length;
        sz--;
        return delete;
    }
    @Override
    public void first() {
        if (isEmpty())System.out.println("first is null");
        System.out.println("first "+data[f]);
    }
}
