public class singlyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void show() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    //-----Inserting a Node at Any Given Position in a Singly Linked List-----
    public void insertAtPos(int position, int value) {
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;

        }

    }

    //-----Deleting a Node at Any Given Position in a Singly Linked List-----
    public void deleteAtPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }


    //-----Deleting a Node After a Given Node in a Singly Linked List-----

    public void deleteAfterNode(singlyLinkedList.ListNode prevListNode) {
        if (prevListNode == null || prevListNode.next == null) {
            System.out.println("Previous node is null.");
            return;
        } else {
            singlyLinkedList.ListNode toDelete = prevListNode.next;
            prevListNode.next = toDelete.next;
            toDelete.next = null;
            singlyLinkedList.ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }
    }

    // -------Searching a Node in a Singly Linked List------
    public void searchNode(int value) {
        ListNode current = head;
        boolean found = false;
        while (current != null) {
            //System.out.println(current.data + " ");
            if (current.data == value) {
                found = true;
                break;
            }
            current = current.next;
        }
        System.out.println();
        if (found) {
            System.out.println("NODE FOUND!");
        } else {
            System.out.println("NODE NOT FOUND!");
        }
    }
    public static void main (String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
        sll.head = new ListNode(12);
        ListNode second = new ListNode(22);
        ListNode third = new ListNode(32);
        ListNode fourth = new ListNode(42);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

    //-------------------EVERY METHOD CAN BE IMPLEMENTED BY REMOVING THE COMMENTS-----------------


        //sll.insertAtPos(3, 3);
        //sll.deleteAtPosition(2);
        //System.out.println("List after deleting node after node with value 22");
        //singlyLinkedList.ListNode prevNode = second;
        //sll.deleteAfterNode(prevNode);
        //sll.searchNode(22);
        //sll.show();


        }

        }
