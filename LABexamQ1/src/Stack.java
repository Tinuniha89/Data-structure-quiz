public class Stack {
    private int maxSize;
    private int[] Array;
    private int last;

    public Stack(int size) {
        maxSize = size;
        Array = new int[maxSize];
        last = -1;
    }

    public void push(int value) {
        if (last < maxSize - 1) {
            last++;
            Array[last] = value;
        } else {
            System.out.println("Stack is full, cannot push " + value);
        }
    }

    public int pop() {
        if (last >= 0) {
            int value = Array[last];
            last--;
            return value;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.pop()); // Output: 20
    }
}


