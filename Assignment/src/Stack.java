class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (top != null) {
            Node temp = top;
            top = top.next;
            temp.next = null;
        }
    }

    public int peek() {
        return (top != null) ? top.data : -1; // Return -1 if stack is empty
    }
}
