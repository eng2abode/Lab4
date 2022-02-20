public class ArrayQueue2<E>implements Queue<E> {
    final static int CAP=100;
    E[] data;
    int r =-1;
    int f=-1;
    int c=0;
    public ArrayQueue2(int c) {
        data=(E[]) new Object[c];
    }
    public ArrayQueue2() {
        this(CAP);
    }
    @Override
    public boolean isEmpty() {
        return c==0;
    }

    @Override
    public boolean isFull() {
        return c==data.length;
    }

    @Override
    public int size() {
        return c;
    }

    @Override
    public void enqueue(E element) {
        if (isFull()) throw new IllegalStateException("is full");
        r=(r+1)%data.length;
        data[r]=element;
        c++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) throw new IllegalStateException("is null");
        f=(f+1)%data.length;
        E delete=data[f];
        c--;
            return delete;
    }

    @Override
    public void first() {
        System.out.println("first "+data[f+1]);
    }
}
