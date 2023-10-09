//Single Linked List
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        head = null;
    }

    public void append(T data) { // appends the data to the last node
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void delete(T value) { // deletes the first occurance of the value
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Value not found");
        }
    }

    public void display() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.append(5);
        l.append(4);
        l.append(3);
        l.delete(3);
        l.display();
    }
}