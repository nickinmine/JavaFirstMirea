package ru.mirea.task14;
import java.util.*;

public class DequeTest {
    Deque deque = new Deque() {
        @Override
        public void addFirst(Object o) {

        }

        @Override
        public void addLast(Object o) {

        }

        @Override
        public boolean offerFirst(Object o) {
            return false;
        }

        @Override
        public boolean offerLast(Object o) {
            return false;
        }

        @Override
        public Object removeFirst() {
            return null;
        }

        @Override
        public Object removeLast() {
            return null;
        }

        @Override
        public Object pollFirst() {
            return null;
        }

        @Override
        public Object pollLast() {
            return null;
        }

        @Override
        public Object getFirst() {
            return null;
        }

        @Override
        public Object getLast() {
            return null;
        }

        @Override
        public Object peekFirst() {
            return null;
        }

        @Override
        public Object peekLast() {
            return null;
        }

        @Override
        public boolean removeFirstOccurrence(Object o) {
            return false;
        }

        @Override
        public boolean removeLastOccurrence(Object o) {
            return false;
        }

        @Override
        public boolean add(Object o) {
            return false;
        }

        @Override
        public boolean offer(Object o) {
            return false;
        }

        @Override
        public Object remove() {
            return null;
        }

        @Override
        public Object poll() {
            return null;
        }

        @Override
        public Object element() {
            return null;
        }

        @Override
        public Object peek() {
            return null;
        }

        @Override
        public boolean addAll(Collection c) {
            return false;
        }

        @Override
        public void push(Object o) {

        }

        @Override
        public Object pop() {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public Iterator iterator() {
            return null;
        }

        @Override
        public Iterator descendingIterator() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public Object[] toArray(Object[] a) {
            return new Object[0];
        }

        @Override
        public boolean containsAll(Collection c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };
    private void add(int number) { deque.add(number); }
    private int remove() { return (int)deque.remove(); }
    private int peek() { return (int)deque.peek(); }
    private boolean empty() { return deque.isEmpty(); }

    public static DequeTest addElem(QueueTest queue, int a, int b) {
        DequeTest nextDeque = new DequeTest();
        while (!nextDeque.empty()) { nextDeque.add(nextDeque.remove()); }
        nextDeque.add(b);
        nextDeque.add(a);
        return nextDeque;
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
