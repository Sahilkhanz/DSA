
public class SimpleStack {
    public int top = -1;
    public int maxLength = 100;
    public int stack[] = new int[maxLength];

    public static void main(String args[]) {
        SimpleStack stack = new SimpleStack();

        stack.push(1);
        stack.pop();
    }

    public void push(int data) {
        if (top == maxLength - 1) {
            System.out.println("Stack is full!! Cannot be pushed the" + data + " element.");
            return;
        }
        top += 1;
        stack[top] = data;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Cannot pop the element as the stack is empty!!");
            return;
        }

        int element = stack[top];
        top -= 1;
        System.out.println("Element popped is " + element);
    }
}
