package Practice;

public class LL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LL() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static LL merge(LL list1, LL list2) {
        LL mergedList = new LL();

        // Traverse the first list and add nodes to the merged list
        Node current = list1.head;
        while (current != null) {
            mergedList.insert(current.data);
            current = current.next;
        }

        // Traverse the second list and append nodes to the merged list
        current = list2.head;
        while (current != null) {
            mergedList.insert(current.data);
            current = current.next;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        LL list2 = new LL();
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        LL mergedList = merge(list1, list2);
        mergedList.display();
    }
}
