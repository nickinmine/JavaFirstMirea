package ru.mirea.task14;
import java.util.Stack;
import java.util.Scanner;

public class StackTest {
    Stack stack = new Stack();
    private void push(int number) { stack.push(number); }
    private int pop() { return (int)stack.pop(); }
    private int peek() { return (int)stack.peek(); }
    private boolean empty() { return stack.isEmpty(); }

    public static StackTest add(StackTest stack, int a, int b) {
        StackTest nextStack = new StackTest(), reverse = new StackTest();
        nextStack.push(b);
        nextStack.push(a);
        while (!stack.empty()) { reverse.push(stack.pop()); }
        while (!reverse.empty()) { nextStack.push(reverse.pop()); }
        return nextStack;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackTest stack1 = new StackTest();
        StackTest stack2 = new StackTest();
        StackTest reverse = new StackTest();
        System.out.println("Ввод: ");
        for (int i = 0; i < 5; i++) {
            reverse.push(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            stack1.push(reverse.pop());
        }
        for (int i = 0; i < 5; i++) {
            reverse.push(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            stack2.push(reverse.pop());
        }
        System.out.println(playGame(stack1, stack2));
        //while (!stack1.stack.isEmpty()) { System.out.print(stack1.pop()); }
        //System.out.println(stack2.peek());
    }

    public static String playGame(StackTest stack1, StackTest stack2) {
        int stepsCounter = 0;
        while(stepsCounter != 106 && !stack1.empty() && !stack2.empty()) {
            if (stack1.peek() == 9 && stack2.peek() == 0) {
                stack2 = add(stack2, stack1.pop(), stack2.pop());
            }
            else if (stack1.peek() == 0 && stack2.peek() == 9) {
                stack1 = add(stack1, stack1.pop(), stack2.pop());
            }
            else if (stack1.peek() > stack2.peek()) {
                stack1 = add(stack1, stack1.pop(), stack2.pop());
            }
            else if (stack1.peek() < stack2.peek()) {
                stack2 = add(stack2, stack1.pop(), stack2.pop());
            }
            stepsCounter++;
        }
        if (!stack1.empty()) { return "first " + stepsCounter; }
        if (!stack2.empty()) { return "second " + stepsCounter; }
        else { return "botva"; }
    }
}