class ToDoList {
    private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void markToDoCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTitle().equals(title)) {
                current.getTask().markCompleted();
                return;
            }
            current = current.getNext();
        }
        System.out.println("Task with title '" + title + "' not found.");
    }
    public void viewToDoList() {
        if (head == null) {
            System.out.println("ToDo List is empty.");
        } else {
            System.out.println("ToDo List:");
            Node current = head;
            int count = 1;
            while (current != null) {
                Task task = current.getTask();
                System.out.println(task.getTitle() +" " + task.getDescription() + " " + task.isCompleted());
                current = current.getNext();
                count++;
            }
        }
    }
}
