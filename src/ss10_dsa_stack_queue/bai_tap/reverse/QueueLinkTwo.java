package ss10_dsa_stack_queue.bai_tap.reverse;

public class QueueLinkTwo {
    public static class Node {
        private int data;
        private Node link;
    }

    static class Queue {
        Node front, rear;
    }

    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }

    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.printf("Element in Circular Queue: ");
        while (temp.link != q.front) {
            System.out.printf("%d", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = queue.rear = null;
        enQueue(queue, 2);
        enQueue(queue, 3);
        enQueue(queue, 4);
        enQueue(queue, 4);
        enQueue(queue, 3);
        enQueue(queue, 1);
        displayQueue(queue);
        System.out.println("");
        System.out.printf("Deleted value = %d", deQueue(queue));
        System.out.println("");
        displayQueue(queue);
        System.out.println("");
        System.out.printf("Deleted value = %d", deQueue(queue));
        System.out.println("");
        displayQueue(queue);
        enQueue(queue, 10);
        enQueue(queue, 11);
        System.out.println("");
        displayQueue(queue);
    }
}
