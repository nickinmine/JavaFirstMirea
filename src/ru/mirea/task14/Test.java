package ru.mirea.task14;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue1 = new PriorityQueue();
        Queue queue2 = new PriorityQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        /*while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println("");
        while (!queue1.isEmpty()) {
            System.out.print(queue1.poll());
        }
        System.out.println("");*/
        queue2.offer(1);
        queue2.offer(2);
        queue2.offer(3);
        /*while (!queue2.isEmpty()) {
            System.out.print(queue2.poll());
        }*/
        System.out.println(stack.peek() + " " + queue1.peek() + " " + queue2.peek());
    }
}