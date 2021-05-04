class Stack {
    private int top;
    private int arr[];

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int val) {
        if (top + 1 >= arr.length) {
            System.out.println("Stack Overflow");
        } else {
            System.out.println("Stack Push " + val);
            top++;
            arr[top] = val;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Stack Pop " + arr[top]);
            top--;
        }
    }

    public void traversal() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Stack Traversal");
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.traversal();
        s.push(10);
        s.push(20);
        s.push(30);
        s.traversal();
        s.pop();
        s.traversal();
    }
}