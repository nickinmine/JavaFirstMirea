package ru.mirea.task14;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Queue;

public class QueueTest {
    Queue queue = new PriorityQueue();
    void add(int number) { queue.add(number); }
    int remove() { return (int)queue.remove(); }
    int peek() { return (int)queue.peek(); }
    boolean empty() { return queue.isEmpty(); }

    public static QueueTest addElem(QueueTest queue, int a, int b) {
        QueueTest nextQueue = new QueueTest();
        while (!queue.empty()) { nextQueue.add(queue.remove()); }
        nextQueue.add(b);
        nextQueue.add(a);
        return nextQueue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueTest queue1 = new QueueTest();
        QueueTest queue2 = new QueueTest();
        System.out.println("Ввод: ");
        for (int i = 0; i < 5; i++) {
            queue1.add(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            queue2.add(scanner.nextInt());
        }
        System.out.println(playGame(queue1, queue2));
        //while (!queue1.empty()) { System.out.print(queue1.remove()); }
        //System.out.println(queue2.peek());
    }

    public static String playGame(QueueTest stack1, QueueTest stack2) {
        int stepsCounter = 0;
        while(stepsCounter != 106 && !stack1.empty() && !stack2.empty()) {
            if (stack1.peek() == 9 && stack2.peek() == 0) {
                //stack2 = addElem(stack2, stack1.remove(), stack2.remove());
                stack2.add(stack1.remove());
                stack2.add(stack2.remove());
            }
            else if (stack1.peek() == 0 && stack2.peek() == 9) {
                //stack1 = addElem(stack1, stack1.remove(), stack2.remove());
                stack1.add(stack1.remove());
                stack1.add(stack2.remove());
            }
            else if (stack1.peek() > stack2.peek()) {
                //stack1 = addElem(stack1, stack1.remove(), stack2.remove());
                stack1.add(stack1.remove());
                stack1.add(stack2.remove());
            }
            else if (stack1.peek() < stack2.peek()) {
                //stack2 = addElem(stack2, stack1.remove(), stack2.remove());
                stack2.add(stack1.remove());
                stack2.add(stack2.remove());
            }
            stepsCounter++;
            System.out.println(stack1.queue.size() + " " + stack2.queue.size());
        }
        if (!stack1.empty()) { return "first " + stepsCounter; }
        if (!stack2.empty()) { return "second " + stepsCounter; }
        else { return "botva"; }
    }
}
