public static void main(String[] args) {
        public class Stack {
            private int maxSize;
            private int[] stackArray;
            private int top;

            public Stack(int size) {
                maxSize = size;
                stackArray = new int[maxSize];
                top = -1;
            }

            public void push(int value) {
                if (top < maxSize - 1) {
                    top++;
                    stackArray[top] = value;
                } else {
                    System.out.println("Stack is full, cannot push " + value);
                }
            }

            public int pop() {
                if (top >= 0) {
                    int value = stackArray[top];
                    top--;
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

    }
}