package Josephus;

/**
 * Created by HP on 09/03/2022.
 */
public class Node {
    public int iData;
    public Node next;

    public Node(int x) {
        iData = x;
    }

    public void displayNode() {
        System.out.print(iData + " ");

    }
}
