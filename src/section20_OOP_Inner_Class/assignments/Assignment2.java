package section20_OOP_Inner_Class.assignments;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class MyLinkedList {

    private Node head;


    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 1️⃣ Iterative Traversal
    public void traverseIterative() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 2️⃣ Recursive Traversal (Public Wrapper)
    public void traverseRecursive() {
        traverseRecursiveHelper(head);
        System.out.println("null");
    }

    private void traverseRecursiveHelper(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " -> ");
        traverseRecursiveHelper(node.next);
    }

    // 3️⃣ Reverse Traversal
    public void traverseReverse() {
        traverseReverseHelper(head);
        System.out.println("null");
    }

    private void traverseReverseHelper(Node node) {
        if (node == null)
            return;

        traverseReverseHelper(node.next);
        System.out.print(node.data + " -> ");
    }

    // 4️⃣ Traverse and Count
    public void traverseAndCount() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
        System.out.println("Total Nodes: " + count);
    }
}


public class Assignment2
{
    public static void main(String[] args) {

    }
}