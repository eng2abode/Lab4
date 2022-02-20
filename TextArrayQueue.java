import java.util.Scanner;

public class TextArrayQueue {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayQueue<Integer> q =new ArrayQueue<>(5);
        System.out.println("input Queue element");
        for (int i = 0; i < 5; i++) {
            q.enqueue(in.nextInt());
            q.first();
            System.out.println("size " + q.size());
        }
        System.out.println("Queue element are");
        while (!q.isEmpty())
            System.out.println(q.dequeue()+"\t");

        q.enqueue(7);
        q.enqueue(3);
        q.first();
        System.out.println("remove"+q.dequeue());
        q.first();
        System.out.println("size " + q.size());

    }
}
