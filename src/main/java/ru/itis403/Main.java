package ru.itis403;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Node first = new Node(1);
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            add(first, random.nextInt(100));
        }
        Node current = first;
        for (int i = 0; i < 16; i++) {
            current = current.next;
        }
        System.out.println("17-ый элемент "+current.value);

        System.out.println();

        System.out.println("Содержимое списка: ");
        current = first;
        for (int i = 0; i < 30; i++) {
            System.out.println(current.value);
            current = current.next;
        }

        System.out.println();

        System.out.println("Обратное содержимое списка: ");
        current = first;
        Node reverse[] = new Node[30];
        for (int i = 29; i >= 0; i--) {
            reverse[i] = current;
            current = current.next;
        }
        for (int i = 0; i < 30; i++) {
            System.out.println(reverse[i].value);
        }
    }

    public static Node findLast(Node first) {
        Node current = first;
        while(current.next != null) {
            current = current.next;
        }
        return current;
    }

    public static void add(Node first, int value) {
        Node last = findLast(first);
        Node newElement = new Node(value);

        last.next = newElement;
    }


}

