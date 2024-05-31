class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node prev = head;
            for (int i = 1; i < position - 1 && prev != null; ++i) {
                prev = prev.next;
            }
            if (prev != null) {
                newNode.next = prev.next;
                prev.next = newNode;
            }
        }
    }

    public void deleteAtPosition(int position) {
        if (position == 1) {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        else {
            Node prev = head;
            for (int i = 1; i < position - 1 && prev != null; ++i) {
                prev = prev.next;
            }
            if (prev != null && prev.next != null) {
                Node temp = prev.next;
                prev.next = temp.next;
                temp.next = null;
            }
        }
    }

    public void deleteAfterNode(Node currentNode) {
        if (currentNode != null && currentNode.next != null) {
            Node temp = currentNode.next;
            currentNode.next = temp.next;
            temp.next = null;
        }
    }

    public Node searchNode(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}