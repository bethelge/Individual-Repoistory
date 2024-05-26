public class ToDoList {
    private Node head;

    public ToDoList() {
        head = null;
    }

    public void addToDo(Task task) {
        Node node = new Node(task);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.task.getTitle() == title) {
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("The task with title " + title + " is not found.");
    }

    public void viewToDoList() {
        Node current = head;
        if (current == null) {
            System.out.println("ToDo List is empty.");
            return;
        }
        System.out.println("ToDo List:");
        while (current != null) {
            System.out.println(" " + current.task.getTitle() + " " + current.task.getDescription());
            current = current.next;
        }

    }

    public static void main(String[] args) {

        ToDoList todo = new ToDoList();

        todo.addToDo(new Task("Task 1", "Description"));
        todo.addToDo(new Task("Task 2", "Description"));

        todo.viewToDoList();

        todo.markToDoAsCompleted("Task 1");
        todo.markToDoAsCompleted("Task 3");

        todo.viewToDoList();

    }
}