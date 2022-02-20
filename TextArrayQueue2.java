import java.util.Scanner;

public class TextArrayQueue2 {
    public static void main(String[] args) {
        ArrayQueue2<Integer> q =new ArrayQueue2<>(5);
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.println("enter the number 1 enQueue & 2 deQueue & 3  first & 4  size");
            n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.print("inter the number ");
                    q.enqueue(in.nextInt());
                    break;
                case 2:
                    System.out.println("remove"+q.dequeue());
                    break;
                case 3:
                    q.first();
                    break;
                case 4:
                    System.out.println("size " + q.size());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("this is not correct");}
        }while (n != 0) ;
    }
}
