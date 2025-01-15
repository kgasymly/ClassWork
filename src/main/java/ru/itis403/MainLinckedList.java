package ru.itis403;

public class MainLinckedList {
    public static void main(String[] args) {
        Node first = new Node(5);

        Node second = new Node(7);

        first.next = second;

        System.out.println(first.next.value);

        Node third = new Node(3);

        second.next = third;
        add(first, 12);
        System.out.println(findLast(first).value);

    }

    public static Node findLast(Node first) {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public static void add(Node first, int value) {
        Node last = findLast(first);
        Node newElem = new Node(value);

        last.next = newElem;
    }
}
